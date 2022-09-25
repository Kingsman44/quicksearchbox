package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiy */
/* compiled from: PG */
public final class aiy extends agt {

    /* renamed from: a */
    public static final agu f20727a = new aix();

    /* renamed from: b */
    private final age f20728b;

    public aiy(age age) {
        this.f20728b = age;
    }

    public final Object read(alb alb) {
        int p = alb.mo14838p();
        int i = p - 1;
        if (p == 0) {
            throw null;
        } else if (i == 0) {
            ArrayList arrayList = new ArrayList();
            alb.mo14822a();
            while (alb.mo14827e()) {
                arrayList.add(read(alb));
            }
            alb.mo14823b();
            return arrayList;
        } else if (i == 2) {
            aic aic = new aic();
            alb.mo14824c();
            while (alb.mo14827e()) {
                aic.put(alb.mo14828f(), read(alb));
            }
            alb.mo14826d();
            return aic;
        } else if (i == 5) {
            return alb.mo14829g();
        } else {
            if (i == 6) {
                return Double.valueOf(alb.mo14832j());
            }
            if (i == 7) {
                return Boolean.valueOf(alb.mo14830h());
            }
            if (i == 8) {
                alb.mo14831i();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public final void write(ald ald, Object obj) {
        if (obj == null) {
            ald.mo14851g();
            return;
        }
        agt d = this.f20728b.mo14706d(obj.getClass());
        if (d instanceof aiy) {
            ald.mo14845c();
            ald.mo14848e();
            return;
        }
        d.write(ald, obj);
    }
}
