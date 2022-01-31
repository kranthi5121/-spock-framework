import com.homeaway.devtools.jenkins.testing.JenkinsPipelineSpecification

public class CoolJenkinsfileSpecSpec extends JenkinsPipelineSpecification {

def "Jenkinsfile"() {
      setup:
               def Jenkinsfile = loadPipelineScriptForTest("vars/CoolJenkinsfile.groovy")
      when:
               Jenkinsfile.run()
      then:
                1 * getPipelineMock("node")("legacy", _)
                1 * getPipelineMock("echo")("hello world")
}
}
