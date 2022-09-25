package com.google.learning.expander.pod.inferenceapi.core;

/* compiled from: PG */
public class PredictionResult implements Comparable {

    /* renamed from: a */
    private final float f167587a;

    public PredictionResult(Object obj, float f) {
        this.f167587a = f;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(((PredictionResult) obj).f167587a, this.f167587a);
    }
}
