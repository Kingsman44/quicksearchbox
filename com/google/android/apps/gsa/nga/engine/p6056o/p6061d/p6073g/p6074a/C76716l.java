package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.p6074a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6073g.C76717b;
import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6075h.C76719b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122398aq;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122399ar;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.g.a.l */
/* compiled from: PG */
public final class C76716l implements C76717b {

    /* renamed from: a */
    public static final C58974d f212040a = C58974d.m91136j();

    /* renamed from: b */
    public final C47770dh f212041b;

    /* renamed from: c */
    private final C76719b f212042c;

    /* renamed from: d */
    private Locale f212043d;

    /* renamed from: e */
    private Optional f212044e = Optional.empty();

    public C76716l(C76719b bVar, C47770dh dhVar) {
        this.f212042c = bVar;
        this.f212041b = dhVar;
    }

    /* renamed from: a */
    public final synchronized Optional mo72301a(Locale locale) {
        if (locale.equals(this.f212043d)) {
            return this.f212044e;
        }
        this.f212043d = locale;
        this.f212044e = Optional.empty();
        C60856cj.m92911t(C60922j.m93045h(C60838bs.m92859i(this.f212042c.mo72312c()), new C76712h(this, locale), C60826bg.f164896a), new C76715k(this, locale), C60826bg.f164896a);
        return this.f212044e;
    }

    /* renamed from: b */
    public final void mo72302b(C65753ak akVar) {
        C122398aq aqVar = (C122398aq) C122399ar.f339334b.createBuilder();
        int i = akVar.f178757bE;
        aqVar.copyOnWrite();
        ((C122399ar) aqVar.instance).f339336a = i;
        C60856cj.m92911t(C60922j.m93045h(C60838bs.m92859i(this.f212042c.mo72312c()), new C76713i(this, (C122399ar) aqVar.build()), C60826bg.f164896a), new C76714j(), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final synchronized void mo72303c(Locale locale) {
        if (locale.equals(this.f212043d)) {
            this.f212043d = null;
        }
    }

    /* renamed from: d */
    public final synchronized void mo72304d(Locale locale, boolean z) {
        if (locale.equals(this.f212043d)) {
            this.f212044e = Optional.m71637of(Boolean.valueOf(z));
        }
    }
}
