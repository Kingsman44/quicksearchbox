package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.p */
/* compiled from: PG */
public final class C113836p {

    /* renamed from: a */
    private final Context f315243a;

    public C113836p(Context context) {
        this.f315243a = context;
    }

    /* renamed from: a */
    public final C60870cx mo100688a(Intent intent) {
        try {
            intent.addFlags(268435456);
            this.f315243a.startActivity(intent);
            return C60856cj.m92900i(C118826c.f331422a);
        } catch (RuntimeException e) {
            return C60856cj.m92899h(e);
        }
    }
}
