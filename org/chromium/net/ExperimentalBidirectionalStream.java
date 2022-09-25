package org.chromium.net;

import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
public abstract class ExperimentalBidirectionalStream extends BidirectionalStream {

    /* compiled from: PG */
    public abstract class Builder extends BidirectionalStream.Builder {
        public abstract Builder addHeader(String str, String str2);

        public Builder addRequestAnnotation(Object obj) {
            return this;
        }

        public Builder bindToNetwork(long j) {
            return this;
        }

        public abstract ExperimentalBidirectionalStream build();

        public abstract Builder delayRequestHeadersUntilFirstFlush(boolean z);

        public abstract Builder setHttpMethod(String str);

        public abstract Builder setPriority(int i);

        public Builder setTrafficStatsTag(int i) {
            return this;
        }

        public Builder setTrafficStatsUid(int i) {
            return this;
        }
    }
}
