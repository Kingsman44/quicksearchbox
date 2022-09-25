package com.google.speech.micro;

/* compiled from: PG */
public class GoogleHotwordRecognizer {
    private GoogleHotwordData hotwordData;
    private long nativeHotwordRecognizer;

    /* compiled from: PG */
    public class AdaptSpeakerModelResult {
        private float modelScore;
        private byte[] speakerModel;

        public float getModelScore() {
            return this.modelScore;
        }

        public byte[] getSpeakerModel() {
            return this.speakerModel;
        }
    }

    /* compiled from: PG */
    public class GoogleHotwordResult {
        private int bytesConsumed;
        private boolean hotwordDetected;
        private HotwordResult[] hotwordResults;
        private SpeakerResult speakerResult;
        private boolean speechDetected;

        /* compiled from: PG */
        public class ConfidenceInterval {
            private boolean fired;
            private int label;
            private float left;
            private float right;
        }

        /* compiled from: PG */
        public class HotwordResult {
            private float backgroundPower;
            private boolean hotwordEndHint;
            private long hotwordEndTime;
            private boolean hotwordFired;
            private boolean hotwordLowConfidence;
            private float hotwordPower;
            private float hotwordScore;
            private long hotwordStartTime;
            private String phrase;

            public float getBackgroundPower() {
                return this.backgroundPower;
            }

            public long getHotwordEndTime() {
                return this.hotwordEndTime;
            }

            public float getHotwordPower() {
                return this.hotwordPower;
            }

            public float getHotwordScore() {
                return this.hotwordScore;
            }

            public long getHotwordStartTime() {
                return this.hotwordStartTime;
            }

            public String getPhrase() {
                return this.phrase;
            }

            public boolean hotwordEndHint() {
                return this.hotwordEndHint;
            }

            public boolean hotwordFired() {
                return this.hotwordFired;
            }

            public boolean hotwordLowConfidence() {
                return this.hotwordLowConfidence;
            }
        }

        /* compiled from: PG */
        public class SpeakerResult {
            private float adaptationThreshold;
            private boolean authenticated;
            private float authenticationThreshold;
            private int bestSpeaker;
            private ConfidenceInterval[] confidenceIntervals;
            private boolean shouldAdapt;
            private boolean speakerDetected;
            private float[] speakerScores;
            private float threshold;

            public float getAdaptationThreshold() {
                if (this.bestSpeaker >= 0) {
                    return this.adaptationThreshold;
                }
                throw new IllegalStateException("Attempt to retrieve index of best speaker model when there is no speaker model.");
            }

            public float getAuthenticationThreshold() {
                if (this.bestSpeaker >= 0) {
                    return this.authenticationThreshold;
                }
                throw new IllegalStateException("Attempt to retrieve index of best speaker model when there is no speaker model.");
            }

            public int getBestSpeaker() {
                int i = this.bestSpeaker;
                if (i >= 0) {
                    return i;
                }
                throw new IllegalStateException("Attempted to retrieve index of best speaker model when there is no speaker model.");
            }

            public ConfidenceInterval[] getConfidenceIntervals() {
                if (this.bestSpeaker >= 0) {
                    return this.confidenceIntervals;
                }
                throw new IllegalStateException("Attempt to retrieve index of best speaker model when there is no speaker model.");
            }

            public float[] getSpeakerScores() {
                if (this.bestSpeaker >= 0) {
                    return this.speakerScores;
                }
                throw new IllegalStateException("Attempt to retrieve index of best speaker model when there is no speaker model.");
            }

            public float getThreshold() {
                if (this.bestSpeaker >= 0) {
                    return this.threshold;
                }
                throw new IllegalStateException("Attempt to retrieve index of best speaker model when there is no speaker model.");
            }

            public boolean isAuthenticated() {
                if (this.bestSpeaker >= 0) {
                    return this.authenticated;
                }
                throw new IllegalStateException("Attempt to determine whether speaker is authenticated when there is no speaker model.");
            }

            public boolean isShouldAdapt() {
                if (this.bestSpeaker >= 0) {
                    return this.shouldAdapt;
                }
                throw new IllegalStateException("Attempted to determine whether to adapt speaker model when there is no speaker model.");
            }

            public boolean isSpeakerDetected() {
                if (this.bestSpeaker >= 0) {
                    return this.speakerDetected;
                }
                throw new IllegalStateException("Attempted to determine whether speaker detected when there is no speaker model.");
            }
        }

        public int getBytesConsumed() {
            return this.bytesConsumed;
        }

        public HotwordResult[] getHotwordResults() {
            return this.hotwordResults;
        }

        public SpeakerResult getSpeakerResult() {
            return this.speakerResult;
        }

        public boolean hotwordDetected() {
            return this.hotwordDetected;
        }

        public boolean speechDetected() {
            return this.speechDetected;
        }
    }

    public GoogleHotwordRecognizer(GoogleHotwordData googleHotwordData) {
        this.hotwordData = googleHotwordData;
        this.nativeHotwordRecognizer = nativeNew(googleHotwordData);
    }

    private static native AdaptSpeakerModelResult nativeAdaptSpeakerModel(long j, int i);

    private static native void nativeClose(long j);

    private static native long nativeNew(GoogleHotwordData googleHotwordData);

    private static native long nativeNew(GoogleHotwordData googleHotwordData, byte[][] bArr);

    private static native byte[] nativeNewSpeakerFromProcessedAudio(long j);

    private static native GoogleHotwordResult nativeProcess(long j, byte[] bArr, int i, int i2);

    private static native void nativeReset(long j);

    private static native void nativeSetEnrollmentMode(long j, boolean z);

    public AdaptSpeakerModelResult adaptSpeakerModel(int i) {
        return nativeAdaptSpeakerModel(this.nativeHotwordRecognizer, i);
    }

    public synchronized void close() {
        long j = this.nativeHotwordRecognizer;
        if (j != 0) {
            nativeClose(j);
            this.nativeHotwordRecognizer = 0;
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

    public byte[] newSpeakerFromProcessedAudio() {
        return nativeNewSpeakerFromProcessedAudio(this.nativeHotwordRecognizer);
    }

    public GoogleHotwordResult process(byte[] bArr) {
        return process(bArr, 0, bArr.length);
    }

    public void reset() {
        nativeReset(this.nativeHotwordRecognizer);
    }

    public void setEnrollmentMode(boolean z) {
        nativeSetEnrollmentMode(this.nativeHotwordRecognizer, z);
    }

    public GoogleHotwordRecognizer(GoogleHotwordData googleHotwordData, byte[][] bArr) {
        this.hotwordData = googleHotwordData;
        this.nativeHotwordRecognizer = nativeNew(googleHotwordData, bArr);
    }

    public GoogleHotwordResult process(byte[] bArr, int i, int i2) {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            return nativeProcess(this.nativeHotwordRecognizer, bArr, i, i2);
        }
        throw new IllegalArgumentException("Samples must be 2-bytes.");
    }
}
