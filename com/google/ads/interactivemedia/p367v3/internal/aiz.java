package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiz */
/* compiled from: PG */
public final class aiz extends agt {

    /* renamed from: a */
    private final aid f20729a;

    /* renamed from: b */
    private final Map f20730b;

    public aiz(aid aid, Map map) {
        this.f20729a = aid;
        this.f20730b = map;
    }

    public final Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        Object a = this.f20729a.mo14768a();
        try {
            alb.mo14824c();
            while (alb.mo14827e()) {
                aja aja = (aja) this.f20730b.get(alb.mo14828f());
                if (aja != null) {
                    if (aja.f20741c) {
                        aja.mo14868b(alb, a);
                    }
                }
                alb.mo14835m();
            }
            alb.mo14826d();
            return a;
        } catch (IllegalStateException e) {
            throw new agq((Throwable) e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void write(ald ald, Object obj) {
        if (obj == null) {
            ald.mo14851g();
            return;
        }
        ald.mo14845c();
        try {
            for (aja aja : this.f20730b.values()) {
                if (aja.mo14869c(obj)) {
                    ald.mo14849f(aja.f20739a);
                    aja.mo14867a(ald, obj);
                }
            }
            ald.mo14848e();
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
