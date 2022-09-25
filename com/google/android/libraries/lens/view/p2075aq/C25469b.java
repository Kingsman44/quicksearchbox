package com.google.android.libraries.lens.view.p2075aq;

import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.aq.b */
/* compiled from: PG */
public final class C25469b {

    /* renamed from: a */
    public static final Duration f69403a = Duration.ofMinutes(3);

    /* renamed from: b */
    public final C60888db f69404b;

    /* renamed from: c */
    public final C25758g f69405c = new C25758g(false);

    /* renamed from: d */
    public C60870cx f69406d;

    public C25469b(C60888db dbVar) {
        this.f69404b = dbVar;
    }

    /* renamed from: a */
    public final void mo30504a() {
        C60870cx cxVar = this.f69406d;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f69406d = null;
        }
        this.f69405c.mo5708l(false);
    }
}
