package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agd */
/* compiled from: PG */
final class agd extends agt {

    /* renamed from: a */
    private agt f20610a;

    /* renamed from: a */
    public final void mo14703a(agt agt) {
        if (this.f20610a == null) {
            this.f20610a = agt;
            return;
        }
        throw new AssertionError();
    }

    public final Object read(alb alb) {
        agt agt = this.f20610a;
        if (agt != null) {
            return agt.read(alb);
        }
        throw new IllegalStateException();
    }

    public final void write(ald ald, Object obj) {
        agt agt = this.f20610a;
        if (agt != null) {
            agt.write(ald, obj);
            return;
        }
        throw new IllegalStateException();
    }
}
