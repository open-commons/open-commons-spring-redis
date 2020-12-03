/*
 * Copyright 2020 Park Jun-Hong_(parkjunhong77/google/com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 *
 * This file is generated under this project, "open-commons-spring-redis".
 *
 * Date  : 2020. 12. 3. 오후 4:24:09
 *
 * Author: Park_Jun_Hong_(fafanmama_at_naver_com)
 * 
 */

package open.commons.spring.redis;

import java.util.HashMap;
import java.util.Map;

/**
 * Redis 명령어에 따른 성능 향상을 위한 설정 정보
 * 
 * @since 2020. 12. 3.
 * @version 0.1.0
 * @author Park_Jun_Hong_(fafanmama_at_naver_com)
 */
public class RedisTuningConfig {
    /** 'lrange' 명령어용 설정 */
    private final Map<String, Object> lrange = new HashMap<>();

    /** 'mget' 명령어용 설정 */
    private final Map<String, Object> mget = new HashMap<>();

    /**
     * 
     * @since 2020. 12. 3.
     */
    public RedisTuningConfig() {
    }

    /**
     * 설정값을 제공한다.
     *
     * @param prop
     *            설정 이름
     * @return
     *
     * @since 2020. 12. 3.
     */
    public Object getLrange(String prop) {
        return this.lrange.get(prop);
    }

    /**
     * 설정값을 제공한다.
     * 
     * @param prop
     *            설정 이름
     * @return
     *
     * @since 2020. 12. 3.
     */
    public Object getMget(String prop) {
        return this.mget.get(prop);
    }

    /**
     * @param lrange
     *            the lrange to set
     *
     * @since 2020. 12. 3.
     */
    public void setLrange(Map<String, Object> lrange) {
        if (lrange == null || lrange.isEmpty()) {
            return;
        }

        this.lrange.putAll(lrange);
    }

    /**
     * @param mget
     *            the mget to set
     *
     * @since 2020. 12. 3.
     */
    public void setMget(Map<String, Object> mget) {
        if (mget == null || mget.isEmpty()) {
            return;
        }

        this.mget.putAll(mget);
    }
}
