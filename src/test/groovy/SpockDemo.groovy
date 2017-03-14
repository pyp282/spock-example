import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class SpockDemo extends Specification {
    def "pushing element to stack"() {
        setup :
        def stack = new ArrayList()
        def elem = "push me"

        when :
        stack.add(elem)

        then :
        stack.size()!=0
        stack.size == 1
        stack.get(0) == elem
    }
}

