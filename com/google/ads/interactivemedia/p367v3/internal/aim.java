package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aim */
/* compiled from: PG */
final class aim extends agt {

    /* renamed from: a */
    private final agt f20704a;

    /* renamed from: b */
    private final aid f20705b;

    public aim(age age, Type type, agt agt, aid aid) {
        this.f20704a = new ajj(age, agt, type);
        this.f20705b = aid;
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        Collection collection = (Collection) this.f20705b.mo14768a();
        alb.mo14822a();
        while (alb.mo14827e()) {
            collection.add(this.f20704a.read(alb));
        }
        alb.mo14823b();
        return collection;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        Collection<Object> collection = (Collection) obj;
        if (collection == null) {
            ald.mo14851g();
            return;
        }
        ald.mo14844b();
        for (Object write : collection) {
            this.f20704a.write(ald, write);
        }
        ald.mo14847d();
    }
}
