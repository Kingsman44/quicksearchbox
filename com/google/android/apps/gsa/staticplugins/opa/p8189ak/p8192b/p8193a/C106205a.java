package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82789am;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82790an;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83629ar;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83652d;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83653e;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83654f;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83664p;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106204a;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106221b;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a.C106215j;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.p8193a.p8194a.C106219n;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107708s;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.b.a.a */
/* compiled from: PG */
public final class C106205a implements C106221b {

    /* renamed from: a */
    private final C83334w f296409a;

    public C106205a(C83334w wVar) {
        this.f296409a = wVar;
    }

    /* renamed from: a */
    public final void mo95443a(C83652d dVar) {
        C83334w wVar = this.f296409a;
        C82887ec ecVar = C82887ec.ACTIVE_SEARCH_CLIENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        dVar.getClass();
        eaVar.f225980b = dVar;
        eaVar.f225979a = 94;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }

    /* renamed from: b */
    public final void mo95444b(String str, String str2) {
        C82790an anVar;
        if (str2.isEmpty()) {
            C82789am amVar = (C82789am) C82790an.f225572d.createBuilder();
            amVar.copyOnWrite();
            C82790an anVar2 = (C82790an) amVar.instance;
            str.getClass();
            anVar2.f225574a |= 1;
            anVar2.f225575b = str;
            anVar = (C82790an) amVar.build();
        } else {
            C82789am amVar2 = (C82789am) C82790an.f225572d.createBuilder();
            amVar2.copyOnWrite();
            C82790an anVar3 = (C82790an) amVar2.instance;
            str.getClass();
            anVar3.f225574a |= 1;
            anVar3.f225575b = str;
            amVar2.copyOnWrite();
            C82790an anVar4 = (C82790an) amVar2.instance;
            str2.getClass();
            anVar4.f225574a |= 2;
            anVar4.f225576c = str2;
            anVar = (C82790an) amVar2.build();
        }
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        anVar.getClass();
        eaVar.f225980b = anVar;
        eaVar.f225979a = 103;
        this.f296409a.mo75543a(C82887ec.CLOUD_FULFILLMENT_NGA_CLIENT_EVENT, (C82885ea) dzVar.build());
    }

    /* renamed from: c */
    public final void mo95445c(C22722z zVar) {
        this.f296409a.mo75543a(C82887ec.OPA_CONVERSATION_DELTA_PROCESSED, C106215j.m176979a(zVar));
    }

    /* renamed from: d */
    public final void mo95446d(Optional optional) {
        C83654f fVar;
        if (optional.isPresent()) {
            C83653e eVar = (C83653e) C83654f.f228032c.createBuilder();
            String str = (String) optional.get();
            eVar.copyOnWrite();
            C83654f fVar2 = (C83654f) eVar.instance;
            str.getClass();
            fVar2.f228034a |= 1;
            fVar2.f228035b = str;
            fVar = (C83654f) eVar.build();
        } else {
            fVar = C83654f.f228032c;
        }
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        fVar.getClass();
        eaVar.f225980b = fVar;
        eaVar.f225979a = 90;
        this.f296409a.mo75543a(C82887ec.CLIENT_CONVERSATION_DONE, (C82885ea) dzVar.build());
    }

    /* renamed from: e */
    public final void mo95447e(C83664p pVar) {
        C83334w wVar = this.f296409a;
        C82887ec ecVar = C82887ec.QUERY_STATE_COMMITTED;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        pVar.getClass();
        eaVar.f225980b = pVar;
        eaVar.f225979a = 88;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }

    /* renamed from: f */
    public final /* synthetic */ void mo95448f(C106204a aVar) {
        mo95449g(aVar, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /* renamed from: g */
    public final void mo95449g(C106204a aVar, Optional optional, Optional optional2, Optional optional3) {
        this.f296409a.mo75543a(C82887ec.SEARCH_SERVICE_CLIENT_MANAGER, C106219n.m176981a(aVar, optional, optional2, optional3));
    }

    /* renamed from: h */
    public final void mo95450h(C106204a aVar, C107708s sVar, C107706q qVar) {
        this.f296409a.mo75543a(C82887ec.SEARCH_SERVICE_CLIENT_USER, C106219n.m176982b(aVar, sVar, qVar));
    }

    /* renamed from: i */
    public final void mo95451i(C83629ar arVar) {
        C83334w wVar = this.f296409a;
        C82887ec ecVar = C82887ec.SEARCH_SESSION_LIFECYCLE;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        arVar.getClass();
        eaVar.f225980b = arVar;
        eaVar.f225979a = 89;
        wVar.mo75543a(ecVar, (C82885ea) dzVar.build());
    }
}
