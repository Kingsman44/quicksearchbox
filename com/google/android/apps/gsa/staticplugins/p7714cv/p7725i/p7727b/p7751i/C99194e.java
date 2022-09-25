package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7751i;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C118991f;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119067w;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8915e.C118990b;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88179sb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88180sc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88181sd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88245un;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b.C98507b;
import com.google.android.apps.gsa.staticplugins.p7699cq.p7700a.p7702b.C98508c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.speech.p5230n.p5232b.C67400ap;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.i.e */
/* compiled from: PG */
public final class C99194e implements C119067w {

    /* renamed from: a */
    final /* synthetic */ C118990b f277464a;

    public C99194e(C118990b bVar) {
        this.f277464a = bVar;
    }

    /* renamed from: a */
    public final C119053i mo91376a() {
        return new C119053i(new C118991f());
    }

    /* renamed from: b */
    public final void mo91377b(C63088z zVar) {
    }

    /* renamed from: c */
    public final void mo91378c(int i) {
    }

    /* renamed from: d */
    public final void mo91379d(int i) {
        C98507b bVar = (C98507b) this.f277464a;
        if (bVar.f275069a.f275073d) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C87682aj ajVar = bVar.f275069a.f275072c;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(new C87684al(C88244um.NO_SPEECH_DETECTED).mo81964a());
            return;
        }
        C59104x d = C98508c.f275070a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PronLearningSubC");
        ((C59052c) ((C59052c) d).mo56372aa(30717)).mo56386p("#handleNoSpeechDetected Null callback. Maybe the client is not connected");
        int i2 = C90755l.f253831a;
    }

    /* renamed from: e */
    public final void mo91380e(Query query, C86232bo boVar) {
    }

    /* renamed from: f */
    public final void mo91381f(C90606n nVar) {
    }

    /* renamed from: g */
    public final void mo91382g(C67400ap apVar) {
        C98507b bVar = (C98507b) this.f277464a;
        if (bVar.f275069a.f275073d) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C87682aj ajVar = bVar.f275069a.f275072c;
        if (ajVar == null) {
            C59104x d = C98508c.f275070a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PronLearningSubC");
            ((C59052c) ((C59052c) d).mo56372aa(30720)).mo56386p("#handlePronLearningResult Null callback. Maybe the client is not connected");
            int i = C90755l.f253831a;
            return;
        }
        C88245un unVar = (C88245un) C88246uo.f238696c.createBuilder();
        C88244um umVar = C88244um.PRONUNCIATION_LEARNING_DONE;
        unVar.copyOnWrite();
        C88246uo uoVar = (C88246uo) unVar.instance;
        uoVar.f238699b = umVar.f238695cJ;
        uoVar.f238698a |= 1;
        C62940bt btVar = C88181sd.f238382b;
        C88179sb sbVar = (C88179sb) C88180sc.f238376c.createBuilder();
        sbVar.copyOnWrite();
        C88180sc scVar = (C88180sc) sbVar.instance;
        scVar.f238379b = apVar;
        scVar.f238378a |= 1;
        unVar.mo58885m(btVar, (C88180sc) sbVar.build());
        ((C86771n) ajVar).mo80379b(new C87684al((C88246uo) unVar.build()).mo81964a());
    }

    /* renamed from: h */
    public final void mo91383h(C90528t tVar) {
        C98507b bVar = (C98507b) this.f277464a;
        if (bVar.f275069a.f275073d) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C87682aj ajVar = bVar.f275069a.f275072c;
        if (ajVar != null) {
            C87684al alVar = new C87684al(C88244um.SHOW_ERROR);
            alVar.mo81966c(new ParcelableVoiceAction(new SearchError(Query.f252741b.mo84294af(), (String) null, tVar)));
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
            return;
        }
        C59104x d = C98508c.f275070a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PronLearningSubC");
        ((C59052c) ((C59052c) d).mo56372aa(30713)).mo56386p("#handleError Null callback. Maybe the client is not connected");
        int i = C90755l.f253831a;
    }
}
