package mnlib;

import com.mongodb.reactivestreams.client.MongoClient;
import io.lettuce.core.api.StatefulRedisConnection;

import javax.annotation.Nullable;
import javax.inject.Singleton;

@Singleton
public class SomeService {

    private final MongoClient mongoClient;
    private final StatefulRedisConnection redisClient;

    public SomeService(@Nullable MongoClient mongoClient, @Nullable StatefulRedisConnection<String, String> redisClient) {
        this.mongoClient = mongoClient;
        this.redisClient = redisClient;
    }

    public void doSomething() {
        System.out.println("MongoClient: " + mongoClient);
        System.out.println("RedisClient: " + redisClient);
    }
}
