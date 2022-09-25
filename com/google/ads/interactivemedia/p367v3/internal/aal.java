package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aal */
final /* synthetic */ class aal implements Comparator {

    /* renamed from: a */
    static final Comparator f20077a = new aal();

    private aal() {
    }

    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        int i = aaw.f20155a;
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }
}
