package com.google.android.apps.search.assistant.platform.ondevice.p9263b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.b.i */
/* compiled from: PG */
public final class C122128i {

    /* renamed from: a */
    public static final ArrayDeque f338791a = new ArrayDeque();

    /* renamed from: f */
    private static final C59071e f338792f = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.b.i");

    /* renamed from: b */
    public final Executor f338793b;

    /* renamed from: c */
    public final long f338794c;

    /* renamed from: d */
    public final long f338795d;

    /* renamed from: e */
    public final int f338796e;

    public C122128i(long j, long j2, long j3, Executor executor) {
        this.f338796e = new int[]{1, 2}[(int) j];
        this.f338795d = j2;
        this.f338794c = Math.min(Math.max(j3, 0), j2);
        this.f338793b = executor;
        if (j2 < j3) {
            ((C59052c) ((C59052c) f338792f.mo56226d()).mo56372aa(34774)).mo56350C("Requested cache size of %d is too large and will be capped at the size limit: %d", j3, j2);
        }
    }
}
