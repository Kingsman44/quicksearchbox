package com.google.android.apps.search.googleapp.discover.streamui.p10227c;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.c.a */
/* compiled from: PG */
public final class C134703a implements C47388b {

    /* renamed from: a */
    public final Throwable f366820a;

    public C134703a(Throwable th) {
        this.f366820a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134703a) && C69664n.m101066l(this.f366820a, ((C134703a) obj).f366820a);
    }

    public final int hashCode() {
        return this.f366820a.hashCode();
    }

    public final String toString() {
        Throwable th = this.f366820a;
        return "DebugEvent(cause=" + th + ")";
    }
}
