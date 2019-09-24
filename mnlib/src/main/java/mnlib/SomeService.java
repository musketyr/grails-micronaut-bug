package mnlib;

import com.mongodb.reactivestreams.client.MongoClient;
import io.lettuce.core.RedisClient;

import javax.annotation.Nullable;
import javax.inject.Singleton;

@Singleton
public class SomeService {

    private final MongoClient mongoClient;
    private final RedisClient redisClient;

    public SomeService(@Nullable MongoClient mongoClient, @Nullable RedisClient redisClient) {
        this.mongoClient = mongoClient;
        this.redisClient = redisClient;
    }
}
