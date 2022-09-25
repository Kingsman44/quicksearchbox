package com.google.firebase.components;

import com.google.firebase.p4611d.C61174a;

/* renamed from: com.google.firebase.components.z */
/* compiled from: PG */
public final class C61172z implements C61174a {

    /* renamed from: a */
    private static final Object f165511a = new Object();

    /* renamed from: b */
    private volatile Object f165512b = f165511a;

    /* renamed from: c */
    private volatile C61174a f165513c;

    public C61172z(C61174a aVar) {
        this.f165513c = aVar;
    }

    /* renamed from: a */
    public final Object mo57687a() {
        Object obj = this.f165512b;
        Object obj2 = f165511a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f165512b;
                if (obj == obj2) {
                    obj = this.f165513c.mo57687a();
                    this.f165512b = obj;
                    this.f165513c = null;
                }
            }
        }
        return obj;
    }
}
