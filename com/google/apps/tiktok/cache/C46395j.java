package com.google.apps.tiktok.cache;

import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.cache.j */
/* compiled from: PG */
public abstract class C46395j {
    /* renamed from: a */
    public abstract C46396k mo50350a();

    /* renamed from: b */
    public abstract void mo50351b(int i);

    /* renamed from: c */
    public final C46396k mo50371c() {
        C46396k a = mo50350a();
        C58838bb.m90884s(a.mo50352a() > 0, "The cache must have a positive size limit in bytes.");
        return a;
    }
}
