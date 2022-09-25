package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ail */
/* compiled from: PG */
public final class ail extends agt {

    /* renamed from: a */
    public static final agu f20701a = new aik();

    /* renamed from: b */
    private final Class f20702b;

    /* renamed from: c */
    private final agt f20703c;

    public ail(age age, agt agt, Class cls) {
        this.f20703c = new ajj(age, agt, cls);
        this.f20702b = cls;
    }

    public final Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        alb.mo14822a();
        while (alb.mo14827e()) {
            arrayList.add(this.f20703c.read(alb));
        }
        alb.mo14823b();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f20702b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public final void write(ald ald, Object obj) {
        if (obj == null) {
            ald.mo14851g();
            return;
        }
        ald.mo14844b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f20703c.write(ald, Array.get(obj, i));
        }
        ald.mo14847d();
    }
}
