package com.google.android.enterprise.connectedapps;

/* renamed from: com.google.android.enterprise.connectedapps.ap */
/* compiled from: PG */
public final class C142556ap implements AutoCloseable {

    /* renamed from: a */
    private final C142557aq f386834a;

    /* renamed from: b */
    private final Object f386835b;

    private C142556ap(C142557aq aqVar, Object obj) {
        this.f386834a = aqVar;
        this.f386835b = obj;
    }

    /* renamed from: a */
    public static C142556ap m231150a(C142557aq aqVar, Object obj) {
        C142556ap apVar = new C142556ap(aqVar, obj);
        aqVar.mo117176f(apVar, obj);
        return apVar;
    }

    public final void close() {
        this.f386834a.mo117177h(this.f386835b);
    }
}
