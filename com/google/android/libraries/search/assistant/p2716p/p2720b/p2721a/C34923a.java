package com.google.android.libraries.search.assistant.p2716p.p2720b.p2721a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.android.libraries.assistant.p1363c.p1382d.C17195a;
import com.google.android.libraries.assistant.p1363c.p1382d.p1383a.C17197b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.p.b.a.a */
/* compiled from: PG */
public final class C34923a {

    /* renamed from: a */
    private final Optional f92582a;

    /* renamed from: b */
    private final C17195a f92583b;

    /* renamed from: c */
    private boolean f92584c;

    /* renamed from: d */
    private C123051cr f92585d = new C123051cr(C60866ct.f164955a);

    public C34923a(Optional optional, C17195a aVar) {
        this.f92582a = optional;
        this.f92583b = aVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo39636a() {
        if (!this.f92582a.isPresent()) {
            return C60866ct.f164955a;
        }
        if (!this.f92584c) {
            this.f92584c = true;
            this.f92585d = new C123051cr(this.f92583b.mo23231a((C17197b) this.f92582a.get()));
        }
        return C60856cj.m92901j(this.f92585d.f340614a);
    }
}
