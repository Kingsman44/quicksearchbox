package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6491a.C84350ai;
import com.google.android.apps.gsa.search.core.p6491a.p6493b.C84352a;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107473al;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107944s;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67190ah;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.t */
/* compiled from: PG */
public final class C107845t implements C107839n {

    /* renamed from: b */
    private static final C59071e f300090b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.a.t");

    /* renamed from: a */
    public final C84350ai f300091a;

    /* renamed from: c */
    private final C68214a f300092c;

    /* renamed from: d */
    private final Query f300093d;

    public C107845t(Query query, C68214a aVar, C84350ai aiVar) {
        this.f300093d = query.mo84244G(true).mo84259V();
        this.f300092c = aVar;
        this.f300091a = aiVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final void mo96297b(C107504e eVar, C58833ax axVar, C107944s sVar) {
        Object obj;
        C67190ah ahVar;
        C67190ah ahVar2;
        C107502c a = C107502c.m178394a(eVar.f299118b);
        if (a == null) {
            a = C107502c.UNDEFINED;
        }
        if (a == C107502c.OPA_TEXT_TO_SPEECH) {
            C62940bt r8 = C62942bv.checkIsLite(C107473al.f299053a);
            eVar.mo58887l(r8);
            if (!eVar.f169962ag.mo58857o(r8.f169971d)) {
                C59104x d = f300090b.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TtsSubController");
                ((C59052c) ((C59052c) d).mo56372aa(26311)).mo56386p("clientEventData does not have extension textToSpeechEventData");
                int i = C90755l.f253831a;
                return;
            }
            C62940bt r82 = C62942bv.checkIsLite(C107473al.f299053a);
            eVar.mo58887l(r82);
            Object l = eVar.f169962ag.mo58854l(r82.f169971d);
            if (l == null) {
                obj = r82.f169969b;
            } else {
                obj = r82.mo58889c(l);
            }
            C107475an anVar = (C107475an) obj;
            if (anVar.f299059d) {
                C58976aa aaVar = C58975e.f156826a;
                if (((C84352a) this.f300092c.mo27525b()).mo77891e()) {
                    ((C84352a) this.f300092c.mo27525b()).mo77890d();
                    return;
                }
                return;
            }
            int i2 = anVar.f299057b;
            int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 0 : 2 : 1 : 3;
            int i4 = i3 - 1;
            TtsRequest ttsRequest = null;
            if (i3 != 0) {
                if (i4 == 0) {
                    ttsRequest = new TtsRequest(i2 == 1 ? (String) anVar.f299058c : BuildConfig.FLAVOR, false);
                } else if (i4 == 1) {
                    if (i2 == 2) {
                        ahVar = (C67190ah) anVar.f299058c;
                    } else {
                        ahVar = C67190ah.f182619q;
                    }
                    if (anVar.f299057b == 2) {
                        ahVar2 = (C67190ah) anVar.f299058c;
                    } else {
                        ahVar2 = C67190ah.f182619q;
                    }
                    ttsRequest = new TtsRequest(ahVar, ahVar2.f182625d);
                } else if (i4 == 2) {
                    C59104x d2 = f300090b.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "TtsSubController");
                    ((C59052c) ((C59052c) d2).mo56372aa(26307)).mo56386p("one of {text, tts_service_request} should be set.");
                    int i5 = C90755l.f253831a;
                }
                if (ttsRequest == null) {
                    C59104x d3 = f300090b.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "TtsSubController");
                    ((C59052c) ((C59052c) d3).mo56372aa(26309)).mo56386p("failed to create tts request.");
                    return;
                }
                C58976aa aaVar2 = C58975e.f156826a;
                ((C84352a) this.f300092c.mo27525b()).mo77888b(this.f300093d.mo84493u(), ttsRequest, new C107844s(this));
                return;
            }
            throw null;
        }
    }
}
