package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.c.f */
/* compiled from: PG */
public final class C33879f extends Exception {

    /* renamed from: a */
    private final C33878e f90400a;

    /* renamed from: b */
    private final String f90401b;

    /* renamed from: c */
    private final Throwable f90402c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33879f(C33878e eVar, String str, Throwable th) {
        super(str, th);
        C69664n.m101061g(eVar, "errorType");
        this.f90400a = eVar;
        this.f90401b = str;
        this.f90402c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33879f)) {
            return false;
        }
        C33879f fVar = (C33879f) obj;
        return this.f90400a == fVar.f90400a && C69664n.m101066l(this.f90401b, fVar.f90401b) && C69664n.m101066l(this.f90402c, fVar.f90402c);
    }

    public final Throwable getCause() {
        return this.f90402c;
    }

    public final String getMessage() {
        return this.f90401b;
    }

    public final int hashCode() {
        int hashCode = ((this.f90400a.hashCode() * 31) + this.f90401b.hashCode()) * 31;
        Throwable th = this.f90402c;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        C33878e eVar = this.f90400a;
        String str = this.f90401b;
        Throwable th = this.f90402c;
        return "ViSessionProcessLocationException(errorType=" + eVar + ", message=" + str + ", cause=" + th + ")";
    }
}
