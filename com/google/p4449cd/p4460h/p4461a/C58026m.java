package com.google.p4449cd.p4460h.p4461a;

import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4454e.C57969i;
import java.util.concurrent.Callable;

/* renamed from: com.google.cd.h.a.m */
/* compiled from: PG */
public final /* synthetic */ class C58026m implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C57958d f155129a;

    /* renamed from: b */
    public final /* synthetic */ C57969i f155130b;

    /* renamed from: c */
    public final /* synthetic */ Callable f155131c;

    public /* synthetic */ C58026m(C57958d dVar, C57969i iVar, Callable callable) {
        this.f155129a = dVar;
        this.f155130b = iVar;
        this.f155131c = callable;
    }

    public final Object call() {
        C57958d dVar = this.f155129a;
        C57969i iVar = this.f155130b;
        Callable callable = this.f155131c;
        C58021h.f155121a.set(dVar);
        iVar.mo54577g(dVar);
        try {
            return callable.call();
        } finally {
            iVar.mo54571a(dVar);
            C58021h.f155121a.set((Object) null);
        }
    }
}
