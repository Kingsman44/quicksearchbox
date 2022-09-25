package com.google.android.libraries.notifications.p2268e.p2281g;

import com.google.android.libraries.notifications.p2296j.C30034d;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.notifications.e.g.c */
/* compiled from: PG */
public abstract class C29892c {
    /* renamed from: e */
    public static C29892c m55335e(MessageLite messageLite, C30034d dVar) {
        C29860a g = m55336g();
        g.f80952a = messageLite;
        g.f80953b = dVar.mo35360a();
        g.f80954c = dVar.mo35362c();
        g.mo35181b(dVar.mo35364e());
        return g.mo35180a();
    }

    /* renamed from: g */
    public static C29860a m55336g() {
        C29860a aVar = new C29860a();
        aVar.mo35181b(true);
        return aVar;
    }

    /* renamed from: a */
    public abstract MessageLite mo35198a();

    /* renamed from: b */
    public abstract MessageLite mo35199b();

    /* renamed from: c */
    public abstract Throwable mo35200c();

    /* renamed from: d */
    public abstract boolean mo35201d();

    /* renamed from: f */
    public final boolean mo35205f() {
        return mo35200c() != null;
    }
}
