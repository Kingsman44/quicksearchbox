package org.chromium.net;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
public abstract class ExperimentalUrlRequest extends UrlRequest {

    /* compiled from: PG */
    public abstract class Builder extends UrlRequest.Builder {
        public static final int DEFAULT_IDEMPOTENCY = 0;
        public static final int IDEMPOTENT = 1;
        public static final int NOT_IDEMPOTENT = 2;

        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        public abstract Builder allowDirectExecutor();

        public Builder bindToNetwork(long j) {
            return this;
        }

        public abstract ExperimentalUrlRequest build();

        public abstract Builder disableCache();

        public Builder disableConnectionMigration() {
            return this;
        }

        public abstract Builder setHttpMethod(String str);

        public Builder setIdempotency(int i) {
            return this;
        }

        public abstract Builder setPriority(int i);

        public Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
            return this;
        }

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }

        public abstract Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor);
    }
}
