package com.google.p4449cd.p4456g.p4458b;

import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.p4457a.C57980f;

/* renamed from: com.google.cd.g.b.g */
/* compiled from: PG */
public final class C57988g extends C57980f {

    /* renamed from: a */
    final /* synthetic */ C57989h f155057a;

    /* renamed from: d */
    private final C57974a f155058d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57988g(C57989h hVar, C57974a aVar) {
        super(aVar);
        this.f155057a = hVar;
        this.f155058d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54581a() {
        synchronized (this.f155057a.f155059g) {
            try {
                this.f155058d.mo20339gQ(true);
                this.f155057a.f155060h.remove(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
