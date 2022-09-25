package com.google.android.gms.cast;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.cast.at */
/* compiled from: PG */
public final class C143362at {

    /* renamed from: a */
    public final Map f388819a = new HashMap();

    /* renamed from: b */
    public final Map f388820b = new HashMap();

    /* renamed from: c */
    private final Map f388821c = new HashMap();

    /* renamed from: a */
    public final int mo118514a(String str) {
        Integer num = (Integer) this.f388821c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo118515b(String str, String str2, int i) {
        this.f388819a.put(str, str2);
        this.f388820b.put(str2, str);
        this.f388821c.put(str, Integer.valueOf(i));
    }
}
