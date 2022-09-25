package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akd */
/* compiled from: PG */
final class akd extends agt {
    /* renamed from: a */
    public final agj read(alb alb) {
        int p = alb.mo14838p();
        int i = p - 1;
        if (p == 0) {
            throw null;
        } else if (i == 0) {
            agh agh = new agh();
            alb.mo14822a();
            while (alb.mo14827e()) {
                agh.mo14718a(read(alb));
            }
            alb.mo14823b();
            return agh;
        } else if (i == 2) {
            agm agm = new agm();
            alb.mo14824c();
            while (alb.mo14827e()) {
                agm.mo14726a(alb.mo14828f(), read(alb));
            }
            alb.mo14826d();
            return agm;
        } else if (i == 5) {
            return new ago(alb.mo14829g());
        } else {
            if (i == 6) {
                return new ago((Number) new ahu(alb.mo14829g()));
            }
            if (i == 7) {
                return new ago(Boolean.valueOf(alb.mo14830h()));
            }
            if (i == 8) {
                alb.mo14831i();
                return agl.f20627a;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public final void write(ald ald, agj agj) {
        if (agj == null || (agj instanceof agl)) {
            ald.mo14851g();
        } else if (agj instanceof ago) {
            ago ago = (ago) agj;
            if (ago.mo14734e()) {
                ald.mo14854j(ago.mo14736f());
            } else if (ago.mo14731b()) {
                ald.mo14856l(ago.mo14733d());
            } else {
                ald.mo14855k(ago.mo14738h());
            }
        } else if (agj instanceof agh) {
            ald.mo14844b();
            Iterator it = ((agh) agj).iterator();
            while (it.hasNext()) {
                write(ald, (agj) it.next());
            }
            ald.mo14847d();
        } else if (agj instanceof agm) {
            ald.mo14845c();
            for (Map.Entry entry : ((agm) agj).mo14727b()) {
                ald.mo14849f((String) entry.getKey());
                write(ald, (agj) entry.getValue());
            }
            ald.mo14848e();
        } else {
            StringBuilder sb = new StringBuilder("Couldn't write ");
            Class<?> cls = agj.getClass();
            sb.append(cls);
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(cls)));
        }
    }
}
