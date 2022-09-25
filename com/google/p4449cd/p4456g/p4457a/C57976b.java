package com.google.p4449cd.p4456g.p4457a;

import com.google.p4449cd.p4456g.C57974a;

/* renamed from: com.google.cd.g.a.b */
/* compiled from: PG */
final class C57976b extends C57980f {

    /* renamed from: a */
    final /* synthetic */ C57978d f155030a;

    /* renamed from: d */
    private final C57974a f155031d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57976b(C57978d dVar, C57974a aVar) {
        super(aVar);
        this.f155030a = dVar;
        this.f155031d = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo54581a() {
        synchronized (this.f155030a.f155033a) {
            try {
                this.f155031d.mo20339gQ(true);
                this.f155030a.f155034b.remove(this.f155031d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo54582b() {
        this.f155031d.mo20338d(this);
    }
}
