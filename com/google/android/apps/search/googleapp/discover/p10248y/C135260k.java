package com.google.android.apps.search.googleapp.discover.p10248y;

import android.content.Intent;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.k */
/* compiled from: PG */
public final class C135260k extends C135268s {

    /* renamed from: a */
    public final int f368486a;

    /* renamed from: b */
    public final Intent f368487b;

    public C135260k(int i, Intent intent) {
        this.f368486a = i;
        this.f368487b = intent;
    }

    /* renamed from: a */
    public final boolean mo112198a(C135268s sVar) {
        C69664n.m101061g(sVar, "other");
        return sVar instanceof C135260k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135260k)) {
            return false;
        }
        C135260k kVar = (C135260k) obj;
        return this.f368486a == kVar.f368486a && C69664n.m101066l(this.f368487b, kVar.f368487b);
    }

    public final int hashCode() {
        int i = this.f368486a * 31;
        Intent intent = this.f368487b;
        return i + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        int i = this.f368486a;
        Intent intent = this.f368487b;
        return "GooglePlayServicesErrorRenderableSlice(errorState=" + i + ", repairIntent=" + intent + ")";
    }
}
