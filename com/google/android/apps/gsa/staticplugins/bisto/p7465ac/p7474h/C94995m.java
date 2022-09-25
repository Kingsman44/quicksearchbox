package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.gsa.nga.api.bh;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88356yq;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.C95458i;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7471e.C94960u;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7477k.C95021c;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95298d;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95853d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124620am;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3739a.p3740a.C48041ab;
import com.google.assistant.p3739a.p3740a.C48090bx;
import com.google.assistant.p3739a.p3740a.C48098ce;
import com.google.assistant.p3897e.p3921j.C51717bo;
import com.google.assistant.p3897e.p3921j.C51718bp;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3996t.p3997a.C53481h;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62947c;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.m */
/* compiled from: PG */
public final class C94995m implements C87682aj {

    /* renamed from: a */
    public static final C59071e f265738a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.h.m");

    /* renamed from: b */
    public static final C88244um[] f265739b = {C88244um.BISTO_UPDATE_RECOGNIZED_TEXT, C88244um.BISTO_SET_FINAL_RECOGNIZED_TEXT, C88244um.BISTO_TTS_RESULT_EVENT, C88244um.BISTO_NOTIFY_COMPLETED_CONVERSATION, C88244um.BISTO_NOTIFY_REQUEST_FOLLOW_ON, C88244um.START_ACTIVITY, C88244um.BISTO_VOICE_SEARCH_DONE, C88244um.BISTO_NO_SPEECH_DETECTED, C88244um.BISTO_FORCE_CLOSE, C88244um.GACS_EXECUTE_EVENT, C88244um.BISTO_PR_REQUEST_PERMISSION, C88244um.NOTIFY_DEVICE_SELECTION_SUPPRESSION, C88244um.BISTO_START_OF_SPEECH_DETECTED, C88244um.GACS_TTS_RESULT_EVENT};

    /* renamed from: c */
    public final C22871g f265740c;

    /* renamed from: d */
    public final C21370a f265741d;

    /* renamed from: e */
    public final C95006x f265742e;

    /* renamed from: f */
    public final C95853d f265743f;

    /* renamed from: g */
    public final C95295ag f265744g;

    /* renamed from: h */
    public final C89656k f265745h;

    /* renamed from: i */
    public final C95021c f265746i;

    /* renamed from: j */
    final C68214a f265747j;

    /* renamed from: k */
    public final C95298d f265748k;

    /* renamed from: l */
    public final bh f265749l;

    /* renamed from: m */
    public final C95458i f265750m;

    /* renamed from: n */
    public C95007y f265751n;

    /* renamed from: o */
    public boolean f265752o;

    /* renamed from: p */
    public boolean f265753p;

    /* renamed from: q */
    public C48098ce f265754q = C48098ce.ASSISTANT_ERROR_CODE_UNSPECIFIED;

    /* renamed from: r */
    public C95294af f265755r;

    /* renamed from: s */
    public long f265756s;

    /* renamed from: t */
    public boolean f265757t;

    /* renamed from: u */
    public C60870cx f265758u;

    /* renamed from: v */
    public C124548d f265759v;

    /* renamed from: w */
    public volatile boolean f265760w;

    /* renamed from: x */
    public volatile C94991i f265761x;

    /* renamed from: y */
    public C94960u f265762y;

    /* renamed from: z */
    private final C58495hd f265763z;

    public C94995m(C22871g gVar, C21370a aVar, C95006x xVar, C95853d dVar, C95295ag agVar, C89656k kVar, C68214a aVar2, C95298d dVar2, C95021c cVar, bh bhVar, C95458i iVar) {
        this.f265740c = gVar;
        this.f265741d = aVar;
        this.f265742e = xVar;
        this.f265743f = dVar;
        this.f265744g = agVar;
        this.f265745h = kVar;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("IDLE", new C94989g(this));
        gzVar.mo55429h("WAITING_FOR_AUDIO", new C94994l(this));
        gzVar.mo55429h("FETCHING", new C94988f(this));
        gzVar.mo55429h("NO_SPEECH_DETECTED", new C94990h(this));
        gzVar.mo55429h("RUNNING_ACTION", new C94993k(this));
        gzVar.mo55429h("DONE", new C94987e(this));
        C58495hd f = gzVar.mo55427f(false);
        this.f265763z = f;
        C94991i iVar2 = (C94991i) f.get("IDLE");
        iVar2.getClass();
        this.f265761x = iVar2;
        this.f265747j = aVar2;
        this.f265748k = dVar2;
        this.f265746i = cVar;
        this.f265749l = bhVar;
        this.f265750m = iVar;
    }

    /* renamed from: a */
    public static void m156832a(Bundle bundle, C48090bx bxVar, C124548d dVar, Account account) {
        C51717bo boVar = (C51717bo) C51718bp.f135685d.createBuilder();
        boVar.copyOnWrite();
        C51718bp bpVar = (C51718bp) boVar.instance;
        bxVar.getClass();
        bpVar.f135688b = bxVar;
        bpVar.f135687a |= 1;
        if (account != null) {
            C124620am o = dVar.mo106517o(account);
            if ((o.f343763a & 1) != 0) {
                C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
                String str = o.f343764b;
                riVar.copyOnWrite();
                C52428rj rjVar = (C52428rj) riVar.instance;
                str.getClass();
                rjVar.f137560a |= 4;
                rjVar.f137562c = str;
                C52428rj rjVar2 = (C52428rj) riVar.build();
                boVar.copyOnWrite();
                C51718bp bpVar2 = (C51718bp) boVar.instance;
                rjVar2.getClass();
                bpVar2.f135689c = rjVar2;
                bpVar2.f135687a |= 2;
            }
        }
        bundle.putByteArray("android.opa.extra.QUERY_GACS_CAPABILITIES", ((C51718bp) boVar.build()).toByteArray());
        C48041ab abVar = bxVar.f124457e;
        if (abVar == null) {
            abVar = C48041ab.f124355c;
        }
        if (!abVar.f124358b.isEmpty()) {
            C48041ab abVar2 = bxVar.f124457e;
            if (abVar2 == null) {
                abVar2 = C48041ab.f124355c;
            }
            bundle.putString("android.opa.extra.EXTRA_HETERODYNE_TOKEN", abVar2.f124358b);
        }
        C48041ab abVar3 = bxVar.f124457e;
        if (abVar3 == null) {
            abVar3 = C48041ab.f124355c;
        }
        C53481h hVar = abVar3.f124357a;
        if (hVar == null) {
            hVar = C53481h.f140358b;
        }
        if (!hVar.f140360a.isEmpty()) {
            C48041ab abVar4 = bxVar.f124457e;
            if (abVar4 == null) {
                abVar4 = C48041ab.f124355c;
            }
            C53481h hVar2 = abVar4.f124357a;
            if (hVar2 == null) {
                hVar2 = C53481h.f140358b;
            }
            bundle.putString("com.google.android.apps.gsa.shared.bisto.EXTRA_USER_AGENT_SUFFIX", hVar2.f140360a);
        }
    }

    /* renamed from: b */
    public final void mo88899b(C88356yq yqVar, String str) {
        if ((yqVar.f238946a & 1) != 0) {
            C59071e eVar = f265738a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17804)).mo56386p("Handling TTS");
            String path = new Uri.Builder().path(yqVar.f238947b).build().getPath();
            if (path == null || !path.contains(",")) {
                C59104x c = eVar.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                ((C59052c) ((C59052c) c).mo56372aa(17805)).mo56386p("Bad audio URI");
                return;
            }
            try {
                byte[] decode = Base64.decode(path.substring(path.indexOf(",")), 0);
                C95007y yVar = this.f265751n;
                yVar.getClass();
                yVar.mo88823n(decode, str);
                C95006x xVar = this.f265742e;
                xVar.f265815d.mo89056a();
                xVar.f265814c.mo81937i(new C88489j(C87739bu.TTS_PLAYBACK_COMPLETE).mo82013a());
            } catch (IllegalArgumentException e) {
                C59104x c2 = f265738a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(17806)).mo56386p("Bad audio");
            }
        }
    }

    /* renamed from: d */
    public final void mo88900d(String str, Object obj) {
        if (this.f265745h.mo83553h("bistoSpeechTestingMode")) {
            C59071e eVar = f265738a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17808)).mo56389s(str, Base64.encodeToString(((C62947c) obj).toByteArray(), 0));
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(17809)).mo56386p("*ENDMSG*");
        }
    }

    /* renamed from: e */
    public final void mo88901e() {
        if (this.f265756s != 0) {
            this.f265741d.mo26870b();
            C58976aa aaVar = C58975e.f156826a;
            this.f265756s = 0;
        }
        C95294af afVar = this.f265755r;
        if (afVar != null) {
            afVar.mo89220a(C95457c.f267108h);
            this.f265755r = null;
        }
    }

    /* renamed from: f */
    public final void mo88902f(String str) {
        this.f265761x.mo88897c();
        C94991i iVar = (C94991i) this.f265763z.get(str);
        iVar.getClass();
        this.f265761x = iVar;
        this.f265761x.mo88896b();
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        this.f265740c.mo28212l("on-event", new C94985c(this, serviceEventData));
    }
}
