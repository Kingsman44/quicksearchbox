package com.google.speech.micro;

/* compiled from: PG */
public class GoogleEndpointer {
    private GoogleEndpointerData endpointerData;
    private long nativeEndpointer;

    /* compiled from: PG */
    public class GoogleEndpointerResult {
        private int bytesConsumed;
        private int endpointerEvent;
        private long eventTimestampMs;

        public GoogleEndpointerResult() {
        }

        public GoogleEndpointerResult(GoogleEndpointerResult googleEndpointerResult) {
            this.bytesConsumed = googleEndpointerResult.bytesConsumed;
            this.eventTimestampMs = googleEndpointerResult.eventTimestampMs;
            this.endpointerEvent = googleEndpointerResult.endpointerEvent;
        }

        public int getBytesConsumed() {
            return this.bytesConsumed;
        }

        public C67363a getEvent() {
            if (this.endpointerEvent == 0) {
                return C67363a.NO_SPEECH;
            }
            return C67363a.SPEECH;
        }

        public long getEventTimestampMs() {
            return this.eventTimestampMs;
        }
    }

    public GoogleEndpointer(GoogleEndpointerData googleEndpointerData) {
        this.endpointerData = googleEndpointerData;
        this.nativeEndpointer = nativeNew(googleEndpointerData);
    }

    private static native void nativeClose(long j);

    private static native long nativeNew(GoogleEndpointerData googleEndpointerData);

    private static native GoogleEndpointerResult nativeProcess(long j, byte[] bArr, int i, int i2);

    private static native void nativeReset(long j);

    public synchronized void close() {
        long j = this.nativeEndpointer;
        if (j != 0) {
            nativeClose(j);
            this.nativeEndpointer = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public GoogleEndpointerResult process(byte[] bArr) {
        return process(bArr, 0, bArr.length);
    }

    public void reset() {
        nativeReset(this.nativeEndpointer);
    }

    public GoogleEndpointerResult process(byte[] bArr, int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            return nativeProcess(this.nativeEndpointer, bArr, i, i2);
        }
        throw new IllegalArgumentException("Samples must be 2-bytes.");
    }
}
