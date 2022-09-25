package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.C85767f;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92417w;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92602a;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92607f;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92594a;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92599f;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92556i;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92557j;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.at */
/* compiled from: PG */
public final class C92591at implements C92558k, C92556i {

    /* renamed from: a */
    public static final C58528ij f258382a = C58528ij.m90011K("speaker_id_retrain_voice_model", "speaker_id_delete_voice_model");

    /* renamed from: f */
    private static final C59071e f258383f = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.hotword.at");

    /* renamed from: b */
    public final C91097g f258384b;

    /* renamed from: c */
    public final C92602a f258385c;

    /* renamed from: d */
    public final C68214a f258386d;

    /* renamed from: e */
    public final C89859i f258387e;

    /* renamed from: g */
    private final C92597d f258388g;

    /* renamed from: h */
    private final C92599f f258389h;

    /* renamed from: i */
    private final C92486a f258390i;

    /* renamed from: j */
    private final C89994f f258391j;

    /* renamed from: k */
    private final C92417w f258392k;

    /* renamed from: l */
    private final C68214a f258393l;

    /* renamed from: m */
    private final C86124t f258394m;

    public C92591at(C91097g gVar, C92597d dVar, C92602a aVar, C92599f fVar, C92486a aVar2, C89994f fVar2, C92417w wVar, C68214a aVar3, C68214a aVar4, C89859i iVar, C86124t tVar) {
        this.f258384b = gVar;
        this.f258388g = dVar;
        this.f258385c = aVar;
        this.f258389h = fVar;
        this.f258390i = aVar2;
        this.f258391j = fVar2;
        this.f258392k = wVar;
        this.f258386d = aVar3;
        this.f258393l = aVar4;
        this.f258387e = iVar;
        this.f258394m = tVar;
    }

    /* renamed from: h */
    private final void m152459h(String str, EventForDump eventForDump) {
        if (this.f258391j.mo83850M()) {
            this.f258391j.mo83844G();
        }
        this.f258391j.mo83843F(str, eventForDump);
        this.f258392k.mo87056a(str, -1);
    }

    /* renamed from: b */
    public final void mo87342b() {
    }

    /* renamed from: c */
    public final void mo87343c() {
    }

    /* renamed from: d */
    public final boolean mo87341d(C92557j jVar) {
        int b = C92607f.m152512b(jVar);
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 9) {
            mo87365g();
            return true;
        } else if (i != 10) {
            return true;
        } else {
            mo87364f(jVar.mo87329e());
            return true;
        }
    }

    /* renamed from: e */
    public final void mo87363e(EventForDump eventForDump) {
        C59104x b = f258383f.mo56224b();
        b.mo56378ag(C58975e.f156826a, "VoiceModelController");
        ((C59052c) ((C59052c) b).mo56372aa(12982)).mo56386p("#deleteVoiceModel");
        if (this.f258391j.mo83848K()) {
            for (String h : ((C86054o) this.f258393l.mo27525b()).mo79685s()) {
                m152459h(h, eventForDump);
            }
        } else {
            m152459h(this.f258388g.mo87367a(), eventForDump);
        }
        this.f258388g.mo87374h();
        C85767f.m137817a(this.f258388g.f258409b);
        this.f258385c.mo64739a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87364f(android.content.Context r12) {
        /*
            r11 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.speech.settingsui.hotword.b.f r0 = r11.f258389h
            boolean r0 = r0.mo87378a()
            com.google.android.apps.gsa.search.core.i.t r1 = r11.f258394m
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249943bF
            boolean r1 = r1.mo79746e(r2)
            com.google.android.apps.gsa.speech.microdetection.a r2 = r11.f258390i
            java.lang.String r2 = r2.mo87230d()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0060
            r5 = 2132088229(0x7f1515a5, float:1.9816736E38)
            java.lang.String r5 = r12.getString(r5)
            r6 = 2132088234(0x7f1515aa, float:1.9816746E38)
            java.lang.String r6 = r12.getString(r6)
            r7 = 2132088232(0x7f1515a8, float:1.9816742E38)
            java.lang.String r7 = r12.getString(r7)
            r8 = 2132088233(0x7f1515a9, float:1.9816744E38)
            java.lang.String r8 = r12.getString(r8)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r3] = r2
            r10[r4] = r2
            r2 = 2
            r10[r2] = r5
            r2 = 3
            r10[r2] = r7
            r2 = 2132088231(0x7f1515a7, float:1.981674E38)
            java.lang.String r2 = r12.getString(r2, r10)
            r9.<init>(r2)
            com.google.android.apps.gsa.speech.utils.ui.NoUnderlineURLSpan r2 = new com.google.android.apps.gsa.speech.utils.ui.NoUnderlineURLSpan
            r2.<init>(r6, r12)
            com.google.android.apps.gsa.speech.utils.p7317ui.C92658d.m152614a(r9, r5, r2)
            com.google.android.apps.gsa.speech.utils.ui.NoUnderlineURLSpan r2 = new com.google.android.apps.gsa.speech.utils.ui.NoUnderlineURLSpan
            r2.<init>(r8, r12)
            com.google.android.apps.gsa.speech.utils.p7317ui.C92658d.m152614a(r9, r7, r2)
            goto L_0x0071
        L_0x0060:
            if (r0 == 0) goto L_0x0066
            r5 = 2132088228(0x7f1515a4, float:1.9816734E38)
            goto L_0x0069
        L_0x0066:
            r5 = 2132088230(0x7f1515a6, float:1.9816738E38)
        L_0x0069:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r2
            java.lang.String r9 = r12.getString(r5, r6)
        L_0x0071:
            if (r4 == r1) goto L_0x0077
            r2 = 2132088226(0x7f1515a2, float:1.981673E38)
            goto L_0x007a
        L_0x0077:
            r2 = 2132088227(0x7f1515a3, float:1.9816732E38)
        L_0x007a:
            java.lang.String r2 = r12.getString(r2)
            r5 = 2132088225(0x7f1515a1, float:1.9816728E38)
            java.lang.String r5 = r12.getString(r5)
            r6 = 5
            java.lang.String r7 = "VoiceModelControllerDelete Voice Model Setting"
            com.google.android.apps.gsa.shared.speech.dumper.EventForDump r6 = com.google.android.apps.gsa.shared.speech.dumper.EventForDump.m147676e(r6, r7)
            android.app.AlertDialog$Builder r7 = new android.app.AlertDialog$Builder
            r7.<init>(r12)
            if (r4 == r1) goto L_0x0097
            r12 = 2132088235(0x7f1515ab, float:1.9816748E38)
            goto L_0x009a
        L_0x0097:
            r12 = 2132088236(0x7f1515ac, float:1.981675E38)
        L_0x009a:
            android.app.AlertDialog$Builder r12 = r7.setTitle(r12)
            android.app.AlertDialog$Builder r12 = r12.setMessage(r9)
            com.google.android.apps.gsa.speech.settingsui.hotword.ao r4 = new com.google.android.apps.gsa.speech.settingsui.hotword.ao
            r4.<init>(r11, r0, r6)
            android.app.AlertDialog$Builder r12 = r12.setPositiveButton(r2, r4)
            r0 = 0
            android.app.AlertDialog$Builder r12 = r12.setNegativeButton(r5, r0)
            android.app.AlertDialog$Builder r12 = r12.setCancelable(r3)
            if (r1 != 0) goto L_0x00bc
            r0 = 16843605(0x1010355, float:2.369595E-38)
            r12.setIconAttribute(r0)
        L_0x00bc:
            android.app.AlertDialog r12 = r12.create()
            if (r1 == 0) goto L_0x00ca
            com.google.android.apps.gsa.speech.settingsui.hotword.ap r0 = new com.google.android.apps.gsa.speech.settingsui.hotword.ap
            r0.<init>(r12)
            r12.setOnShowListener(r0)
        L_0x00ca:
            r12.show()
            com.google.android.apps.gsa.speech.settingsui.hotword.b.d r12 = r11.f258388g
            r12.mo87372f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.settingsui.hotword.C92591at.mo87364f(android.content.Context):void");
    }

    /* renamed from: g */
    public final void mo87365g() {
        ac acVar;
        C58976aa aaVar = C58975e.f156826a;
        C92597d dVar = this.f258388g;
        C91097g gVar = dVar.f258408a;
        C74554t i = C74555u.m120572i();
        i.mo70868b(s.a);
        C74543ad d = C74544ae.m120523d();
        d.mo70851c(af.c);
        i.mo70872f(d.mo70849a());
        i.mo70869c(C9439b.VOICE_SETTINGS_HOTWORD_RETRAINING);
        aa c = C74542ab.m120516c();
        if (((C86124t) dVar.f258414g.mo27525b()).mo79746e(C90082eg.f249889aE)) {
            acVar = ac.d;
        } else {
            acVar = ac.a;
        }
        c.c(acVar);
        i.mo70871e(c.a());
        gVar.mo65090b(i.mo70882h(), C92594a.f258404a);
        this.f258388g.mo87372f();
    }

    /* renamed from: gd */
    public final void mo87344gd(C92557j jVar) {
        int b = C92607f.m152512b(jVar);
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 9) {
            jVar.mo87333i(this);
        } else if (i == 10) {
            jVar.mo87333i(this);
        }
    }
}
