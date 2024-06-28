package com.example.sample.QuizService2024.Feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("QUESION-SERVICE2024")
public interface QuizInterface {
}
