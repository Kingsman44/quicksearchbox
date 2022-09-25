package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p5836c.C74453e;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90509a;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.search.p2904c.p2976v.C38120a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.ae */
/* compiled from: PG */
final class C100576ae implements C22868d {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f281195a;

    /* renamed from: b */
    final /* synthetic */ C89061q f281196b;

    /* renamed from: c */
    final /* synthetic */ Query f281197c;

    /* renamed from: d */
    final /* synthetic */ ClientConfig f281198d;

    /* renamed from: e */
    final /* synthetic */ C85422c f281199e;

    /* renamed from: f */
    final /* synthetic */ C86498a f281200f;

    /* renamed from: g */
    final /* synthetic */ C89356b f281201g;

    /* renamed from: h */
    final /* synthetic */ C58833ax f281202h;

    /* renamed from: i */
    final /* synthetic */ C60870cx f281203i;

    /* renamed from: j */
    final /* synthetic */ C100585an f281204j;

    public C100576ae(C100585an anVar, SettableFuture settableFuture, C89061q qVar, Query query, ClientConfig clientConfig, C85422c cVar, C86498a aVar, C89356b bVar, C58833ax axVar, C60870cx cxVar) {
        this.f281204j = anVar;
        this.f281195a = settableFuture;
        this.f281196b = qVar;
        this.f281197c = query;
        this.f281198d = clientConfig;
        this.f281199e = cVar;
        this.f281200f = aVar;
        this.f281201g = bVar;
        this.f281202h = axVar;
        this.f281203i = cxVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C100585an anVar = this.f281204j;
        if (anVar.f281235F) {
            anVar.mo91980c(this.f281203i);
        }
        C58887cx.m90979f(th, Error.class);
        C59104x d = C100585an.f281229a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VSWorkerHelper");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(33691)).mo56386p("Failed to get SpeechieMode");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C100585an anVar = this.f281204j;
        SettableFuture settableFuture = this.f281195a;
        C89061q qVar = this.f281196b;
        Query query = this.f281197c;
        int intValue = ((Integer) obj).intValue();
        ClientConfig clientConfig = this.f281198d;
        C85422c cVar = this.f281199e;
        C86498a aVar = this.f281200f;
        C89356b bVar = this.f281201g;
        C58833ax axVar = this.f281202h;
        C60870cx cxVar = this.f281203i;
        C58976aa aaVar = C58975e.f156826a;
        if (settableFuture.value instanceof C60873d.C60875b) {
            query.mo84263a("android.opa.extra.AUDIO_SESSION_ID");
            C74449d dVar = ((C74453e) ((u) anVar.f281232C.mo27525b()).e.mo27525b()).f208531a;
            if (anVar.f281235F) {
                anVar.mo91980c(cxVar);
                return;
            }
            return;
        }
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.VOICE_SEARCH_SPEECHIE_START;
        fVar.mo83701c("rId", Long.toString(query.f252749G));
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160062a |= 268435456;
        cbVar.f160144y = intValue;
        fVar.f246203c = (C59687cb) ajVar.build();
        ((C89859i) anVar.f281258t.mo27525b()).mo74236a(fVar.mo83699a());
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 746;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164251f |= 512;
        ufVar2.f164111aR = intValue;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar3.f164093a |= 4;
        ufVar3.f164259n = b;
        if (qVar != null) {
            long a = qVar.mo27431a();
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164251f |= 4096;
            ufVar4.f164114aU = a;
            long a2 = qVar.mo27431a();
            tzVar.copyOnWrite();
            C60555uf ufVar5 = (C60555uf) tzVar.instance;
            ufVar5.f164251f |= 8192;
            ufVar5.f164115aV = a2;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        C59104x b2 = C100585an.f281229a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "VSWorkerHelper");
        ((C59052c) ((C59052c) b2).mo56372aa(33705)).mo56387q("Using speechie mode=%d", intValue);
        if (C38120a.m67298b(anVar.f281242d, "android.permission.RECORD_AUDIO")) {
            anVar.f281244f.mo28211k(cxVar, "getRequestClientOptional", new C100580ai(anVar, query, cVar, settableFuture, intValue, clientConfig, qVar, aVar, bVar, axVar));
            return;
        }
        if (anVar.f281235F) {
            anVar.mo91980c(cxVar);
        }
        C90509a aVar2 = new C90509a(C89885b.AUDIO_CANT_START_RECORDING_MICROPHONE_PERMISSION_DENIED_VALUE);
        settableFuture.mo57357o(aVar2);
        cVar.mo78943i(query, new VoiceSearchError(query, aVar2, (String) null));
        new ProxyPermissionsRequester(anVar.f281243e, anVar.f281242d).mo81047ju(new String[]{"android.permission.RECORD_AUDIO"}, 5, C100621r.f281380a);
    }
}
