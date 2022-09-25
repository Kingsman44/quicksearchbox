package com.google.android.apps.gsa.store;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.store.v */
/* compiled from: PG */
public final class C118333v {

    /* renamed from: a */
    public final ArrayList f328464a = new ArrayList();

    /* renamed from: b */
    public final String f328465b;

    /* renamed from: c */
    public final byte[] f328466c;

    /* renamed from: d */
    public final long f328467d;

    public C118333v(String str, byte[] bArr, long j, TimeUnit timeUnit) {
        this.f328466c = bArr;
        this.f328467d = timeUnit.toSeconds(j);
        this.f328465b = str;
    }

    /* renamed from: a */
    public final void mo103672a(C118302a aVar, Long l) {
        this.f328464a.add(C118311b.m196482a(aVar, l.longValue()));
    }

    /* renamed from: b */
    public final void mo103673b(C118302a aVar, String str) {
        this.f328464a.add(new C118311b(aVar, str, (Long) null, (Double) null, (Boolean) null));
    }
}
