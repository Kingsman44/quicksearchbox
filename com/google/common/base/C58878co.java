package com.google.common.base;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.common.base.co */
/* compiled from: PG */
final class C58878co {

    /* renamed from: a */
    final boolean[] f156715a = new boolean[256];

    /* renamed from: b */
    final Set f156716b;

    public C58878co(Set set) {
        this.f156716b = set;
        for (int i = 0; i < 256; i++) {
            this.f156715a[i] = this.f156716b.contains(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56167a(C58878co coVar) {
        HashSet hashSet = new HashSet();
        C58877cn.m90957c(this, hashSet);
        C58877cn.m90957c(coVar, hashSet);
        new C58878co(hashSet);
    }
}
