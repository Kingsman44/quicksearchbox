package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.libraries.p1730f.C21370a;
import java.util.Calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.p */
/* compiled from: PG */
public final class C110891p {

    /* renamed from: a */
    public final C21370a f308928a;

    public C110891p(C21370a aVar) {
        this.f308928a = aVar;
    }

    /* renamed from: a */
    public final int mo98917a() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f308928a.mo26870b());
        return instance.get(11);
    }

    /* renamed from: b */
    public final long mo98918b(int i, boolean z) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f308928a.mo26870b());
        if (z) {
            instance.add(5, 1);
        }
        instance.set(instance.get(1), instance.get(2), instance.get(5), i, 0, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    public final boolean mo98919c() {
        int a = mo98917a();
        return a >= 21 || a < 2;
    }
}
