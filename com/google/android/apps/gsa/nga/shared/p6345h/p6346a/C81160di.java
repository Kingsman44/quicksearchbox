package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81320p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.di */
/* compiled from: PG */
public final class C81160di implements C81320p {

    /* renamed from: a */
    public final C42876ab f222281a;

    /* renamed from: b */
    public final Executor f222282b;

    /* renamed from: c */
    private final C22871g f222283c;

    /* renamed from: d */
    private final C32160b f222284d;

    public C81160di(C42876ab abVar, C22871g gVar, C32160b bVar) {
        this.f222281a = abVar;
        this.f222283c = gVar;
        this.f222284d = bVar;
        this.f222282b = new C81159dh(gVar);
    }

    /* renamed from: a */
    public final C60870cx mo74912a() {
        return C80905at.m128758b(this.f222283c, "[NGA] getAmbientVisualSearchGleamTapPreviewHasShown", this.f222281a.mo46042d(), this.f222284d.mo37974b(), C81134cj.f222255a);
    }

    /* renamed from: b */
    public final C60870cx mo74913b() {
        C22871g gVar = this.f222283c;
        C42876ab abVar = this.f222281a;
        Objects.requireNonNull(abVar);
        return gVar.mo28209i(gVar.mo28202b("[NGA] getNgaInputPlatePreferences", new C81135ck(abVar)), "[NGA] getNgaLensChipPreferences", C81136cl.f222257a);
    }

    /* renamed from: c */
    public final C60870cx mo74914c() {
        return C80905at.m128758b(this.f222283c, "[NGA] getNestPromoImpressionCount", this.f222281a.mo46042d(), this.f222284d.mo37974b(), C81152da.f222273a);
    }

    /* renamed from: d */
    public final C60870cx mo74915d() {
        return C80905at.m128758b(this.f222283c, "[NGA] getNestPromoInteractionCount", this.f222281a.mo46042d(), this.f222284d.mo37974b(), C81131cg.f222252a);
    }

    /* renamed from: e */
    public final C60870cx mo74916e() {
        return C80905at.m128758b(this.f222283c, "[NGA] getTellMyFamilyPromoImpressionCount", this.f222281a.mo46042d(), this.f222284d.mo37974b(), C81138cn.f222259a);
    }

    /* renamed from: f */
    public final C60870cx mo74917f() {
        return C80905at.m128758b(this.f222283c, "[NGA] getTellMyFamilyPromoInteractionCount", this.f222281a.mo46042d(), this.f222284d.mo37974b(), C81148cx.f222269a);
    }

    /* renamed from: g */
    public final C60870cx mo74918g() {
        return C80905at.m128758b(this.f222283c, "[NGA] getVoiceMatchPromoImpressionCount", this.f222281a.mo46042d(), this.f222284d.mo37974b(), C81149cy.f222270a);
    }

    /* renamed from: h */
    public final C60870cx mo74919h() {
        return C80905at.m128758b(this.f222283c, "[NGA] getVoiceMatchPromoInteractionCount", this.f222281a.mo46042d(), this.f222284d.mo37974b(), C81158dg.f222279a);
    }

    /* renamed from: i */
    public final C60870cx mo74920i() {
        return this.f222283c.mo28210j(this.f222284d.mo37974b(), "[NGA] incrementNestPromoImpressionCount", new C81150cz(this));
    }

    /* renamed from: j */
    public final C60870cx mo74921j() {
        return this.f222283c.mo28210j(this.f222284d.mo37974b(), "[NGA] incrementNestPromoInteractionCount", new C81137cm(this));
    }

    /* renamed from: k */
    public final C60870cx mo74922k() {
        return this.f222283c.mo28210j(this.f222284d.mo37974b(), "[NGA] incrementTellMyFamilyPromoImpressionCount", new C81142cr(this));
    }

    /* renamed from: l */
    public final C60870cx mo74923l() {
        return this.f222283c.mo28209i(this.f222284d.mo37974b(), "[NGA] getVoiceMatchPromoImpressionCount", new C81133ci(this));
    }

    /* renamed from: m */
    public final C60870cx mo74924m() {
        return this.f222283c.mo28209i(this.f222281a.mo46042d(), "[NGA] InputPlatePreferencesImpl.quickActionsPreferences", C81157df.f222278a);
    }

    /* renamed from: n */
    public final C60870cx mo74925n() {
        return this.f222283c.mo28210j(this.f222284d.mo37974b(), "[NGA] recordAmbientVisualSearchGleamTapPreviewHasShown", new C81153db(this));
    }

    /* renamed from: o */
    public final C60870cx mo74926o() {
        return C118826c.m197213c(this.f222281a.mo46039a(C81143cs.f222264a, this.f222282b));
    }

    /* renamed from: p */
    public final C60870cx mo74927p(long j) {
        return C118826c.m197213c(this.f222281a.mo46039a(new C81147cw(j), this.f222282b));
    }

    /* renamed from: q */
    public final void mo74928q() {
        this.f222283c.mo28209i(this.f222284d.mo37974b(), "[NGA] getVoiceMatchPromoInteractionCount", new C81154dc(this));
    }

    /* renamed from: r */
    public final void mo74929r() {
        this.f222283c.mo28210j(this.f222284d.mo37974b(), "[NGA] incrementTellMyFamilyPromoInteractionCount", new C81156de(this));
    }
}
