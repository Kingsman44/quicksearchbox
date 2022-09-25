package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.android.apps.gsa.nga.api.a.i;
import com.google.android.apps.gsa.nga.engine.ay.d;
import com.google.android.apps.gsa.nga.engine.ay.e;
import com.google.android.apps.gsa.nga.engine.ay.p;
import com.google.android.apps.gsa.nga.engine.p5977ay.C75181f;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81052j;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34134g;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.ExternalHotwordVerificationAdapterImpl$onClientHotword$1", mo61344c = "ExternalHotwordVerificationAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {83, 85, 90})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.j */
/* compiled from: PG */
public final class C34476j extends C69572j implements C69630p {

    /* renamed from: a */
    int f91606a;

    /* renamed from: b */
    final /* synthetic */ C34478l f91607b;

    /* renamed from: c */
    final /* synthetic */ C37500dg f91608c;

    /* renamed from: d */
    final /* synthetic */ C37672hs f91609d;

    /* renamed from: e */
    final /* synthetic */ C81052j f91610e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34476j(C34478l lVar, C37500dg dgVar, C37672hs hsVar, C81052j jVar, C69577g gVar) {
        super(2, gVar);
        this.f91607b = lVar;
        this.f91608c = dgVar;
        this.f91609d = hsVar;
        this.f91610e = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34476j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        i iVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f91606a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C69626l lVar = this.f91607b.f91621d;
            this.f91606a = 1;
            obj = lVar.mo5761a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C69714l.m101134b(obj);
        } else if (i != 2) {
            C69714l.m101134b(obj);
            iVar = (i) obj;
            C69664n.m101060f(iVar, "if (hotwordArchitecture(…         .await()\n      }");
            return iVar;
        } else {
            C69714l.m101134b(obj);
            iVar = (i) obj;
            C69664n.m101060f(iVar, "if (hotwordArchitecture(…         .await()\n      }");
            return iVar;
        }
        if (obj == C34134g.HDM) {
            C59052c cVar = (C59052c) C34478l.f91618a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordBisto");
            int i2 = this.f91608c.f99560b;
            cVar.mo56379ah(new C59094n(51398));
            cVar.mo56387q("Using APA stack for #onClientHotword(%s).", i2);
            C34478l lVar2 = this.f91607b;
            C37672hs hsVar = this.f91609d;
            C37500dg dgVar = this.f91608c;
            C81052j jVar = this.f91610e;
            this.f91606a = 2;
            obj = lVar2.mo39367a(hsVar, dgVar, jVar, this);
            if (obj == aVar) {
                return aVar;
            }
            iVar = (i) obj;
            C69664n.m101060f(iVar, "if (hotwordArchitecture(…         .await()\n      }");
            return iVar;
        }
        C59052c cVar2 = (C59052c) C34478l.f91618a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "TRG.HotwordBisto");
        int i3 = this.f91608c.f99560b;
        cVar2.mo56379ah(new C59094n(51397));
        cVar2.mo56387q("Using legacy stack for #onClientHotword(%s).", i3);
        p pVar = (p) this.f91607b.f91622e.mo5768a();
        C37672hs hsVar2 = this.f91609d;
        C37500dg dgVar2 = this.f91608c;
        C81052j jVar2 = this.f91610e;
        ((C58970a) ((C58970a) p.a.mo56224b()).mo56372aa(5524)).mo56386p("onBistoHotword()");
        SettableFuture settableFuture = new SettableFuture();
        C60870cx e = C90877ak.m148471e(settableFuture, 10, TimeUnit.SECONDS, pVar.g);
        pVar.h.mo28212l("[NGA] GsaVISConnection#onBistoHotword", new C75181f(pVar, new d(hsVar2, dgVar2, jVar2, settableFuture)));
        C60870cx e2 = pVar.g.mo28205e(e, "[NGA] GsaVISConnection.onBistoHotword.catching", TimeoutException.class, e.a);
        C69664n.m101060f(e2, "gsaVoiceInteractionServi…erId, verificationParams)");
        this.f91606a = 3;
        obj = C71663i.m104690c(e2, this);
        if (obj == aVar) {
            return aVar;
        }
        iVar = (i) obj;
        C69664n.m101060f(iVar, "if (hotwordArchitecture(…         .await()\n      }");
        return iVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34476j(this.f91607b, this.f91608c, this.f91609d, this.f91610e, gVar);
    }
}
