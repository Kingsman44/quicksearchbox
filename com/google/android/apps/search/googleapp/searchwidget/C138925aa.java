package com.google.android.apps.search.googleapp.searchwidget;

import android.os.Process;
import com.google.android.libraries.p1730f.C21370a;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.aa */
/* compiled from: PG */
public final class C138925aa {

    /* renamed from: a */
    public static final Duration f377856a = Duration.ofSeconds(9);

    /* renamed from: a */
    public static Duration m225759a(C21370a aVar, Duration duration) {
        Duration ofMillis = Duration.ofMillis(aVar.mo26871c() - Process.getStartElapsedRealtime());
        return ofMillis.compareTo(duration) < 0 ? duration.minus(ofMillis) : duration;
    }
}
