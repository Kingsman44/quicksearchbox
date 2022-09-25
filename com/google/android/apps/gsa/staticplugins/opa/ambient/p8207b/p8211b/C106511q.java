package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6454c.C83751g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106432a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8229c.p8230a.C106601a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8260d.C106990ap;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107048a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.MessageLite;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.q */
/* compiled from: PG */
public final class C106511q implements C106432a {

    /* renamed from: a */
    public final C58974d f297035a;

    /* renamed from: b */
    public final C58485gu f297036b;

    /* renamed from: c */
    public final C60888db f297037c;

    /* renamed from: d */
    public final C107048a f297038d;

    /* renamed from: e */
    public final C106990ap f297039e;

    /* renamed from: f */
    public final C42876ab f297040f;

    /* renamed from: g */
    public final C86124t f297041g;

    /* renamed from: h */
    public final C21370a f297042h;

    /* renamed from: i */
    public final C83751g f297043i;

    /* renamed from: j */
    public final C106601a f297044j;

    /* renamed from: k */
    private final Optional f297045k;

    /* renamed from: l */
    private final C60836bq f297046l = new C60836bq();

    public C106511q(C58485gu guVar, Optional optional, C106601a aVar, C107048a aVar2, C60888db dbVar, C83564a aVar3, C106990ap apVar, C42876ab abVar, C86124t tVar, C21370a aVar4, C83751g gVar) {
        this.f297036b = guVar;
        this.f297045k = optional;
        this.f297037c = dbVar;
        this.f297044j = aVar;
        this.f297038d = aVar2;
        this.f297035a = aVar3.mo76900a("AA.Context");
        this.f297039e = apVar;
        this.f297040f = abVar;
        this.f297041g = tVar;
        this.f297042h = aVar4;
        this.f297043i = gVar;
        optional.ifPresent(C106500f.f297017a);
    }

    /* renamed from: a */
    public final synchronized C60870cx mo95528a(C106546e eVar, MessageLite messageLite) {
        eVar.mo95557b().mo95553a(messageLite);
        C106601a aVar = this.f297044j;
        eVar.mo95557b().mo95553a(messageLite);
        aVar.mo95590d(4);
        return this.f297046l.mo57305b(new C106504j(this, eVar, messageLite), this.f297037c);
    }

    /* renamed from: b */
    public final C60870cx mo95529b() {
        if (this.f297041g.mo79746e(C90017bw.f247978bn)) {
            return this.f297046l.mo57305b(new C106508n(this), this.f297037c);
        }
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: c */
    public final C60870cx mo95530c() {
        return this.f297046l.mo57304a(new C106502h(this), this.f297037c);
    }

    /* renamed from: e */
    public final synchronized void mo95555e(List list) {
        list.size();
        Collection.EL.stream(list).forEach(C106501g.f297018a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ContextAggregatorImpl");
        boolean isPresent = this.f297045k.isPresent();
        fVar.mo85292s(C90752i.m148229c("Dev entry point present? " + isPresent));
    }
}
