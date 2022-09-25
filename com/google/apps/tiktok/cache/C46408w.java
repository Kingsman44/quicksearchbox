package com.google.apps.tiktok.cache;

import com.google.common.base.C58838bb;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.cache.w */
/* compiled from: PG */
public abstract class C46408w {
    /* renamed from: a */
    public abstract C46409x mo50357a();

    /* renamed from: b */
    public abstract void mo50358b(long j);

    /* renamed from: c */
    public abstract void mo50359c(int i);

    /* renamed from: d */
    public abstract void mo50360d(int i);

    /* renamed from: e */
    public abstract void mo50361e(MessageLite messageLite);

    /* renamed from: f */
    public final C46409x mo50384f() {
        C46409x a = mo50357a();
        boolean z = true;
        if (a.mo50363b() <= 0 && a.mo50362a() <= 0) {
            z = false;
        }
        C58838bb.m90884s(z, "The maximum cache size must be limited by memory or entry count as a positive integer");
        return a;
    }
}
