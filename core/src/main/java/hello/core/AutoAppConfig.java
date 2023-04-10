package hello.core; // basePackages 정하지 않으면 여기부터 하위를 ComponentScan

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // basePackages = "hello.core", // scan 범위 정하기, 요즘에는 주로 생략
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) // @Configuration 붙은 거 제외, 실무에서는 이렇게 안하는데 기존 예제코드와 겹칠까봐 하는 것.
)
public class AutoAppConfig {
}
