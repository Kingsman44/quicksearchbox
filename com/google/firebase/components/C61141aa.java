package com.google.firebase.components;

import com.google.firebase.p4611d.C61174a;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.components.aa */
/* compiled from: PG */
final class C61141aa implements C61174a {

    /* renamed from: a */
    private volatile Set f165461a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set f165462b = null;

    public C61141aa(Collection collection) {
        this.f165461a.addAll(collection);
    }

    /* renamed from: b */
    static C61141aa m93496b(Collection collection) {
        return new C61141aa((Set) collection);
    }

    /* renamed from: d */
    private final synchronized void m93497d() {
        for (C61174a a : this.f165461a) {
            this.f165462b.add(a.mo57687a());
        }
        this.f165461a = null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo57687a() {
        if (this.f165462b == null) {
            synchronized (this) {
                if (this.f165462b == null) {
                    this.f165462b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m93497d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f165462b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo57712c(C61174a aVar) {
        if (this.f165462b == null) {
            this.f165461a.add(aVar);
        } else {
            this.f165462b.add(aVar.mo57687a());
        }
    }
}
