package com.google.android.apps.search.soundsearch.p10655d;

import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.soundsearch.d.a */
/* compiled from: PG */
public final class C141651a {

    /* renamed from: a */
    public static final C59071e f384472a = C59071e.m91332i("com.google.android.apps.search.soundsearch.d.a");

    /* renamed from: b */
    public static final int f384473b;

    /* renamed from: c */
    public static final int f384474c;

    /* renamed from: d */
    public static final int f384475d;

    /* renamed from: e */
    private static final Duration f384476e;

    /* renamed from: f */
    private static final Duration f384477f;

    /* renamed from: g */
    private static final Duration f384478g;

    static {
        Duration ofSeconds = Duration.ofSeconds(1);
        f384476e = ofSeconds;
        f384473b = m229868a(ofSeconds);
        Duration ofSeconds2 = Duration.ofSeconds(1);
        f384477f = ofSeconds2;
        f384474c = m229868a(ofSeconds2);
        Duration ofMillis = Duration.ofMillis(500);
        f384478g = ofMillis;
        f384475d = m229868a(ofMillis);
    }

    /* renamed from: a */
    public static int m229868a(Duration duration) {
        int millis = (int) ((((float) duration.toMillis()) / 1000.0f) * 16000.0f);
        return millis + millis;
    }
}
