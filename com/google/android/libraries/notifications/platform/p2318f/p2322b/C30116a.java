package com.google.android.libraries.notifications.platform.p2318f.p2322b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.b.a */
/* compiled from: PG */
public final class C30116a {

    /* renamed from: a */
    public static final C30116a f81465a = new C30116a(C30126e.SUCCESS, (Throwable) null);

    /* renamed from: b */
    public final C30126e f81466b;

    /* renamed from: c */
    public final Throwable f81467c;

    public C30116a(C30126e eVar, Throwable th) {
        C69664n.m101061g(eVar, "status");
        this.f81466b = eVar;
        this.f81467c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30116a)) {
            return false;
        }
        C30116a aVar = (C30116a) obj;
        return this.f81466b == aVar.f81466b && C69664n.m101066l(this.f81467c, aVar.f81467c);
    }

    public final int hashCode() {
        int hashCode = this.f81466b.hashCode() * 31;
        Throwable th = this.f81467c;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        C30126e eVar = this.f81466b;
        Throwable th = this.f81467c;
        return "GnpJobResult(status=" + eVar + ", error=" + th + ")";
    }
}
