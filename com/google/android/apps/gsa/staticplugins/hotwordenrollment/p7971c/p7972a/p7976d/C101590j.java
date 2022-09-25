package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7976d;

import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83975q;
import com.google.android.apps.gsa.opaonboarding.personalresults.C83952c;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7988k.C101873d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.d.j */
/* compiled from: PG */
public final class C101590j {

    /* renamed from: a */
    public static final C59071e f283462a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.d.j");

    /* renamed from: b */
    public final C101582b f283463b;

    /* renamed from: c */
    public final C74555u f283464c;

    /* renamed from: d */
    public final C101860a f283465d;

    /* renamed from: e */
    public final C92371d f283466e;

    /* renamed from: f */
    public final l f283467f;

    /* renamed from: g */
    public final C47770dh f283468g;

    /* renamed from: h */
    public C83975q f283469h;

    /* renamed from: i */
    private final String f283470i;

    /* renamed from: j */
    private final C86054o f283471j;

    /* renamed from: k */
    private final C22871g f283472k;

    /* renamed from: l */
    private final C68214a f283473l;

    /* renamed from: m */
    private final C101592l f283474m;

    /* renamed from: n */
    private final C83952c f283475n;

    /* renamed from: o */
    private final C101495ac f283476o;

    public C101590j(C101582b bVar, String str, C74555u uVar, C101860a aVar, C86054o oVar, C92371d dVar, C83952c cVar, l lVar, C22871g gVar, C68214a aVar2, C101495ac acVar, C101592l lVar2, C47770dh dhVar) {
        this.f283463b = bVar;
        this.f283464c = uVar;
        this.f283465d = aVar;
        this.f283470i = str;
        this.f283471j = oVar;
        this.f283466e = dVar;
        this.f283475n = cVar;
        this.f283467f = lVar;
        this.f283472k = gVar;
        this.f283473l = aVar2;
        this.f283476o = acVar;
        this.f283474m = lVar2;
        this.f283468g = dhVar;
    }

    /* renamed from: a */
    public final void mo92412a(boolean z) {
        C89849ae aeVar;
        new C90873ag(this.f283475n.mo77356a(this.f283476o, this.f283470i, this.f283463b.getActivity(), this.f283471j.mo79689w(this.f283470i), z).mo77355a(), this.f283472k, "updateAndRecordPersonalResults", C101873d.m168556a(new C101585e(this))).mo85223a(C101873d.m168556a(new C101586f(this)));
        if (z) {
            this.f283474m.f283484c = true;
            aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_ENABLED;
        } else {
            aeVar = C89849ae.VOICE_MATCH_FACE_MATCH_ENROLLMENT_PR_DISABLED;
        }
        ((C89859i) this.f283473l.mo27525b()).mo83702b(aeVar);
    }
}
