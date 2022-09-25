package com.google.android.apps.gsa.staticplugins.p7903ef;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118950d;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90525q;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.C90763bg;
import com.google.android.apps.gsa.speech.helper.p7280a.C92303a;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.android.apps.gsa.speech.p7294j.C92432b;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92472e;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7298l.C92474g;
import com.google.android.apps.gsa.speech.p7298l.C92475h;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p395al.p408c.p414c.p416b.C8460ac;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.b */
/* compiled from: PG */
public final /* synthetic */ class C100475b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100493h f280871a;

    /* renamed from: b */
    public final /* synthetic */ Query f280872b;

    /* renamed from: c */
    public final /* synthetic */ C85379a f280873c;

    /* renamed from: d */
    public final /* synthetic */ C92431a f280874d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f280875e;

    public /* synthetic */ C100475b(C100493h hVar, Query query, C85379a aVar, C92431a aVar2, C58833ax axVar) {
        this.f280871a = hVar;
        this.f280872b = query;
        this.f280873c = aVar;
        this.f280874d = aVar2;
        this.f280875e = axVar;
    }

    public final void run() {
        C90536a aVar;
        String str;
        String string;
        ArrayList<String> stringArrayList;
        C100493h hVar = this.f280871a;
        Query query = this.f280872b;
        C85379a aVar2 = this.f280873c;
        C92431a aVar3 = this.f280874d;
        C58833ax axVar = this.f280875e;
        C58976aa aaVar = C58975e.f156826a;
        C58838bb.m90868c(query.mo84447db());
        hVar.f280939l.mo85091a();
        if (hVar.f280942o) {
            C59104x b = C100493h.f280930a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TranscriptionWorker");
            ((C59052c) ((C59052c) b).mo56372aa(33445)).mo56386p("Transcription already in progress!");
            hVar.mo91938h(false);
        }
        hVar.f280943p = query;
        C92303a aVar4 = (C92303a) hVar.f280938k.mo27525b();
        aVar4.f257398b = 0;
        aVar4.f257399c = 0;
        if (hVar.f280940m == null) {
            hVar.f280942o = true;
            C92474g gVar = (C92474g) hVar.f280935h.mo27525b();
            Bundle bundle = query.f252786y;
            if (bundle != null) {
                aVar = C90536a.values()[bundle.getInt("android.speech.extra.MODE", C90536a.SERVICE_API.ordinal())];
            } else {
                aVar = C90536a.SERVICE_API;
            }
            C90536a aVar5 = aVar;
            a audio = gVar.f258044f.getAudio(query.f252781t);
            C66421a aVar6 = (C66421a) C66422b.f180605k.createBuilder();
            Bundle bundle2 = query.f252786y;
            if (bundle2 != null) {
                EditorInfo editorInfo = (EditorInfo) bundle2.getParcelable("android.speech.extra.EDITOR_INFO");
                if (editorInfo != null) {
                    boolean z = bundle2.getBoolean("android.speech.extra.SINGLE_LINE", false);
                    String c = C90763bg.m148263c(editorInfo.label);
                    aVar6.copyOnWrite();
                    C66422b bVar = (C66422b) aVar6.instance;
                    c.getClass();
                    bVar.f180607a |= 16;
                    bVar.f180612f = c;
                    String c2 = C90763bg.m148263c(editorInfo.hintText);
                    aVar6.copyOnWrite();
                    C66422b bVar2 = (C66422b) aVar6.instance;
                    c2.getClass();
                    bVar2.f180607a |= 32;
                    bVar2.f180613g = c2;
                    String c3 = C90763bg.m148263c(editorInfo.packageName);
                    aVar6.copyOnWrite();
                    C66422b bVar3 = (C66422b) aVar6.instance;
                    c3.getClass();
                    bVar3.f180607a |= 1;
                    bVar3.f180608b = c3;
                    String c4 = C90763bg.m148263c(Integer.valueOf(editorInfo.fieldId));
                    aVar6.copyOnWrite();
                    C66422b bVar4 = (C66422b) aVar6.instance;
                    c4.getClass();
                    bVar4.f180607a |= 4;
                    bVar4.f180610d = c4;
                    String c5 = C90763bg.m148263c(editorInfo.fieldName);
                    aVar6.copyOnWrite();
                    C66422b bVar5 = (C66422b) aVar6.instance;
                    c5.getClass();
                    bVar5.f180607a |= 2;
                    bVar5.f180609c = c5;
                    int i = editorInfo.inputType;
                    aVar6.copyOnWrite();
                    C66422b bVar6 = (C66422b) aVar6.instance;
                    bVar6.f180607a |= 64;
                    bVar6.f180614h = i;
                    int i2 = editorInfo.imeOptions;
                    aVar6.copyOnWrite();
                    C66422b bVar7 = (C66422b) aVar6.instance;
                    bVar7.f180607a |= 128;
                    bVar7.f180615i = i2;
                    aVar6.copyOnWrite();
                    C66422b bVar8 = (C66422b) aVar6.instance;
                    bVar8.f180607a |= 8;
                    bVar8.f180611e = z;
                }
                str = C58837ba.m90858g(bundle2.getString("android.speech.extra.CALLING_PACKAGE"));
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str2 = str;
            C92460b b2 = gVar.mo87219b(query);
            C92472e eVar = (C92472e) gVar.f258041c.mo17428b();
            boolean z2 = audio != null;
            C92472e eVar2 = eVar;
            gVar.mo87223f(eVar, query, aVar5, z2, aVar5 == C90536a.VOICE_ACTIONS || aVar5 == C90536a.CLOCKWORK || aVar5 == C90536a.VOICE_IME || aVar5 == C90536a.ANDROID_TV_SEARCH || aVar5 == C90536a.INTENT_API);
            if (query.mo84465ds()) {
                eVar2.f257996s = gVar.f258040b;
            }
            if (query.mo84324bI()) {
                C92474g.m152089k(eVar2, query.mo84386cS());
            }
            boolean bw = query.mo84363bw("android.speech.extra.PREFER_OFFLINE");
            List e = gVar.mo87222e();
            Bundle bundle3 = query.f252786y;
            if (!(bundle3 == null || (stringArrayList = bundle3.getStringArrayList("android.speech.extra.ADDITIONAL_LANGUAGE")) == null)) {
                e = stringArrayList;
            }
            eVar2.f257982e = e;
            eVar2.f257979b = b2;
            eVar2.f257986i = C92252n.DICTATION;
            eVar2.f257989l = query.mo84363bw("android.speech.extra.PARTIAL_RESULTS");
            eVar2.f257984g = bw;
            eVar2.f257990m = query.mo84363bw("android.speech.extra.PROFANITY_FILTER") || gVar.mo87225h();
            eVar2.f257993p = (C66422b) aVar6.build();
            eVar2.f257999v = Long.valueOf(query.f252749G);
            eVar2.f257980c = z2;
            C8513w a = ((C92541i) gVar.f258042d.mo27525b()).mo87316a();
            String d = gVar.mo87221d(query);
            Bundle bundle4 = query.f252786y;
            if (!(bundle4 == null || (string = bundle4.getString("android.speech.extra.LANGUAGE")) == null)) {
                if (C92654a.m152604a(a, string) != null) {
                    d = string;
                } else {
                    C8460ac c6 = C92654a.m152606c(a, string);
                    if (c6 != null) {
                        ((C59052c) ((C59052c) C92475h.f258054a.mo56226d()).mo56372aa(12813)).mo56386p("The locale should be specified in BCP47");
                        d = c6.f29383c;
                    }
                }
            }
            eVar2.f257981d = d;
            eVar2.f257991n = query.mo84363bw("android.speech.extra.SUGGESTIONS_ENABLED");
            eVar2.f257983f = str2;
            eVar2.f257967F = query.mo84399cf();
            C92473f a2 = eVar2.mo87218a();
            hVar.f280940m = new C92432b(new C100492g(hVar, query, aVar2, aVar3));
            hVar.f280941n = Long.valueOf(query.f252749G);
            String str3 = a2.f258019g;
            if (!a2.f258020h || (str3 != null && (!hVar.mo91937g(C90082eg.f250045db, str3) || !hVar.mo91937g(C90082eg.f250046dc, str3)))) {
                ((C118950d) hVar.f280934g.mo27525b()).mo91289b(a2, hVar.f280940m, hVar.f280931b, axVar);
                return;
            }
            C90525q qVar = new C90525q();
            C89886e b3 = ((C89911f) hVar.f280937j.mo27525b()).mo83756b(qVar);
            b3.mo83725d(query.f252749G);
            b3.mo83721a();
            aVar2.mo78903d(query, new VoiceSearchError(query, qVar, (String) null));
        }
    }
}
