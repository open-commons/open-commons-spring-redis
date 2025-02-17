[2025/02/17]
- Snapshot: 0.3.0-SNAPSHOT
- Dependencies:
  + open-commons-spring-web-dependencies: 0.8.0-SNAPSHOT

[2025/02/17]
- Release: 0.2.0

[2024/10/31]
- ETC
  + Maven Repository 주소 변경 (http -> https)
  
[2022/05/11]
- Dependencies
  + springframework:5.3.19
  + spring-data-redis: 2.6.4

[2022/04/07]
- Release: 0.2.0-SNAPSHOT
- Tag: 0.1.0
- Dependencies:
  + open.commons.core: 2.0.0-SNAPSHOT

[2022/04/07]
- Release: 0.1.0

[2020/12/03]
- New
  + open.commons.spring.redis.RedisTuningConfig: Redis 명령어별 성능 향상을 위한 설정
  
- Add
  + open.commons.spring.redis.lettuce.AbstractLettuceRedisDao
    - RedisTuningConfig tuningConfig: Redis 명령어 성능 향상을 위한 설정 


[2020/12/01]
- Add
  + open.commons.spring.redis.AbstractRedisDao
    - createRedisTemplate(F): 기본 코드 구성
    - keySerializer()
    - stringSerializer()
    - valueSerializer()
- INITIALIZED!!!
