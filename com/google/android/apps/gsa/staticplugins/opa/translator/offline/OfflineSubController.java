package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.speech.SpeechRecognizer;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113611x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.p3926e.C51910dq;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;

/* compiled from: PG */
public final class OfflineSubController {

    /* renamed from: a */
    public static final C59071e f314597a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.translator.offline.OfflineSubController");

    /* renamed from: b */
    public final C113631j f314598b;

    /* renamed from: c */
    public final C58495hd f314599c;

    /* renamed from: d */
    public final C113621af f314600d;

    /* renamed from: e */
    public final String f314601e;

    /* renamed from: f */
    public final C22871g f314602f;

    /* renamed from: g */
    public final C22871g f314603g;

    /* renamed from: h */
    public final C107955f f314604h;

    /* renamed from: i */
    public final C118831d f314605i;

    /* renamed from: j */
    public final C118831d f314606j;

    /* renamed from: k */
    private final boolean f314607k;

    /* renamed from: l */
    private final C113620ae f314608l;

    public OfflineSubController(C118827a aVar, final C113631j jVar, C86124t tVar, C113621af afVar, final C113620ae aeVar, C89994f fVar, C22871g gVar, C22871g gVar2, C107955f fVar2, C2391v vVar) {
        this.f314605i = aVar.mo77944g(C118569b.OFFLINE_INTERPRETER_OFFLINE_USAGE_RATE, C118575h.ACTIVITY_OPA);
        this.f314606j = aVar.mo77944g(C118569b.OFFLINE_INTERPRETER_TRANSLATE_SUCCESS_RATE, C118575h.ACTIVITY_OPA);
        this.f314598b = jVar;
        this.f314607k = tVar.mo79746e(C90042cu.f248705f);
        this.f314599c = tVar.mo79752r(C90042cu.f248710k);
        this.f314600d = afVar;
        this.f314608l = aeVar;
        this.f314601e = fVar.mo83863Z();
        this.f314602f = gVar;
        this.f314603g = gVar2;
        this.f314604h = fVar2;
        vVar.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final void mo3525ha(C2391v vVar) {
                C113631j jVar = C113631j.this;
                SpeechRecognizer speechRecognizer = jVar.f314662c;
                jVar.f314662c = null;
                if (speechRecognizer != null) {
                    speechRecognizer.destroy();
                }
                C113620ae aeVar = aeVar;
                aeVar.f314620b.mo28212l("cleanUpTranslator", new C113646y(aeVar));
            }
        });
    }

    /* renamed from: a */
    public final C60870cx mo100352a(String str, String str2) {
        return this.f314603g.mo28201a("InterpreterCheckAiAiModel", new C113632k(this, str, str2));
    }

    /* renamed from: b */
    public final boolean mo100353b(C51910dq dqVar) {
        return this.f314607k && this.f314598b.mo100358a() && this.f314599c.containsKey(Locale.forLanguageTag(dqVar.f136163c).toLanguageTag()) && this.f314599c.containsKey(Locale.forLanguageTag(dqVar.f136164d).toLanguageTag());
    }

    /* renamed from: c */
    public final boolean mo100354c(C51910dq dqVar) {
        return this.f314607k && dqVar != null && dqVar.f136176p && this.f314598b.mo100358a();
    }

    /* renamed from: d */
    public final void mo100355d(String str, String str2, String str3, boolean z, C113611x xVar) {
        String language = Locale.forLanguageTag(str2).getLanguage();
        String language2 = Locale.forLanguageTag(str3).getLanguage();
        C113620ae aeVar = this.f314608l;
        C60922j.m93044g(aeVar.f314620b.mo28202b("translate", new C113617ab(aeVar, language, language2, z, str)), new C113635n(this, z, str, xVar, str2, str3), C60826bg.f164896a);
    }
}
