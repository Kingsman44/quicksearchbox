package com.google.android.apps.search.podcasts.p10600q;

import android.support.p033v7.p040e.C0422d;
import android.support.p033v7.p040e.C0425g;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.q.f */
/* compiled from: PG */
public final class C140947f extends C0422d {

    /* renamed from: a */
    private final List f382701a;

    /* renamed from: b */
    private final List f382702b;

    /* renamed from: c */
    private final C0425g f382703c;

    public C140947f(List list, List list2, C0425g gVar) {
        this.f382701a = list;
        this.f382702b = list2;
        this.f382703c = gVar;
    }

    /* renamed from: a */
    public final int mo1379a() {
        return this.f382702b.size();
    }

    /* renamed from: b */
    public final int mo1380b() {
        return this.f382701a.size();
    }

    /* renamed from: d */
    public final boolean mo1382d(int i, int i2) {
        C0425g gVar = this.f382703c;
        Object obj = this.f382701a.get(i);
        obj.getClass();
        Object obj2 = this.f382702b.get(i2);
        obj2.getClass();
        return gVar.mo1400a(obj, obj2);
    }

    /* renamed from: e */
    public final boolean mo1383e(int i, int i2) {
        C0425g gVar = this.f382703c;
        Object obj = this.f382701a.get(i);
        obj.getClass();
        Object obj2 = this.f382702b.get(i2);
        obj2.getClass();
        return gVar.mo1401b(obj, obj2);
    }
}
