package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.content.Context;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.apps.gsa.speech.audio.C92196g;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92410p;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101718a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.C101725ag;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.libraries.assistant.soda.C19390z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.i */
/* compiled from: PG */
public final class C101968i implements C101967h {

    /* renamed from: a */
    private final C101960bg f284532a;

    /* renamed from: b */
    private final C101944ar f284533b;

    public C101968i(C101960bg bgVar, C101944ar arVar) {
        this.f284532a = bgVar;
        this.f284533b = arVar;
    }

    /* renamed from: a */
    public final C101943aq mo92746a(C101966g gVar, C101983x xVar, C92380d dVar, boolean z) {
        if (gVar == C101966g.SODA) {
            C101960bg bgVar = this.f284532a;
            dVar.getClass();
            C74555u uVar = (C74555u) bgVar.f284490a.mo17428b();
            C74555u uVar2 = uVar;
            uVar.getClass();
            C101860a aVar = (C101860a) bgVar.f284491b.mo17428b();
            C101860a aVar2 = aVar;
            aVar.getClass();
            C101725ag agVar = (C101725ag) bgVar.f284492c.mo17428b();
            C101725ag agVar2 = agVar;
            agVar.getClass();
            C101718a aVar3 = (C101718a) bgVar.f284493d.mo17428b();
            C101718a aVar4 = aVar3;
            aVar3.getClass();
            C101945as asVar = (C101945as) bgVar.f284494e.mo17428b();
            C101945as asVar2 = asVar;
            asVar.getClass();
            C92196g gVar2 = (C92196g) bgVar.f284495f.mo17428b();
            C92196g gVar3 = gVar2;
            gVar2.getClass();
            C89994f fVar = (C89994f) bgVar.f284496g.mo17428b();
            C89994f fVar2 = fVar;
            fVar.getClass();
            Context context = (Context) bgVar.f284497h.mo17428b();
            Context context2 = context;
            context.getClass();
            C22871g gVar4 = (C22871g) bgVar.f284498i.mo17428b();
            C22871g gVar5 = gVar4;
            gVar4.getClass();
            C22871g gVar6 = (C22871g) bgVar.f284499j.mo17428b();
            C22871g gVar7 = gVar6;
            gVar6.getClass();
            C22871g gVar8 = (C22871g) bgVar.f284500k.mo17428b();
            C22871g gVar9 = gVar8;
            gVar8.getClass();
            C19390z zVar = (C19390z) bgVar.f284501l.mo17428b();
            C19390z zVar2 = zVar;
            zVar.getClass();
            C87677ae aeVar = (C87677ae) bgVar.f284502m.mo17428b();
            C87677ae aeVar2 = aeVar;
            aeVar.getClass();
            C86124t tVar = (C86124t) bgVar.f284503n.mo17428b();
            C86124t tVar2 = tVar;
            tVar.getClass();
            C29409fd fdVar = (C29409fd) bgVar.f284504o.mo17428b();
            C29409fd fdVar2 = fdVar;
            fdVar.getClass();
            C42813k kVar = (C42813k) bgVar.f284505p.mo17428b();
            C42813k kVar2 = kVar;
            kVar.getClass();
            C68214a a = C68219e.m98518a(((C68226l) bgVar.f284506q).f184585a);
            C68214a aVar5 = a;
            a.getClass();
            C86054o oVar = (C86054o) bgVar.f284507r.mo17428b();
            C86054o oVar2 = oVar;
            oVar.getClass();
            C21370a aVar6 = (C21370a) bgVar.f284508s.mo17428b();
            C21370a aVar7 = aVar6;
            aVar6.getClass();
            C92410p pVar = (C92410p) bgVar.f284509t.mo17428b();
            C92410p pVar2 = pVar;
            pVar.getClass();
            C89859i iVar = (C89859i) bgVar.f284510u.mo17428b();
            C89859i iVar2 = iVar;
            iVar.getClass();
            C90584f fVar3 = (C90584f) bgVar.f284511v.mo17428b();
            fVar3.getClass();
            String str = (String) bgVar.f284512w.mo17428b();
            str.getClass();
            return new C101959bf(xVar, z, uVar2, aVar2, agVar2, aVar4, asVar2, gVar3, fVar2, context2, gVar5, gVar7, gVar9, zVar2, aeVar2, tVar2, fdVar2, kVar2, aVar5, oVar2, aVar7, pVar2, iVar2, fVar3, str);
        }
        C101944ar arVar = this.f284533b;
        dVar.getClass();
        C74555u uVar3 = (C74555u) arVar.f284423a.mo17428b();
        C74555u uVar4 = uVar3;
        uVar3.getClass();
        C101718a aVar8 = (C101718a) arVar.f284424b.mo17428b();
        C101718a aVar9 = aVar8;
        aVar8.getClass();
        C101725ag agVar3 = (C101725ag) arVar.f284425c.mo17428b();
        C101725ag agVar4 = agVar3;
        agVar3.getClass();
        C87677ae aeVar3 = (C87677ae) arVar.f284426d.mo17428b();
        C87677ae aeVar4 = aeVar3;
        aeVar3.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) arVar.f284427e).f184585a);
        C68214a aVar10 = a2;
        a2.getClass();
        C90932cb cbVar = (C90932cb) arVar.f284428f.mo17428b();
        C90932cb cbVar2 = cbVar;
        cbVar.getClass();
        C92486a aVar11 = (C92486a) arVar.f284429g.mo17428b();
        C92486a aVar12 = aVar11;
        aVar11.getClass();
        C101945as asVar3 = (C101945as) arVar.f284430h.mo17428b();
        C101945as asVar4 = asVar3;
        asVar3.getClass();
        C22871g gVar10 = (C22871g) arVar.f284431i.mo17428b();
        C22871g gVar11 = gVar10;
        gVar10.getClass();
        C101860a aVar13 = (C101860a) arVar.f284432j.mo17428b();
        C101860a aVar14 = aVar13;
        aVar13.getClass();
        C89994f fVar4 = (C89994f) arVar.f284433k.mo17428b();
        C89994f fVar5 = fVar4;
        fVar4.getClass();
        C90584f fVar6 = (C90584f) arVar.f284434l.mo17428b();
        C90584f fVar7 = fVar6;
        fVar6.getClass();
        String str2 = (String) arVar.f284435m.mo17428b();
        str2.getClass();
        C86124t tVar3 = (C86124t) arVar.f284436n.mo17428b();
        tVar3.getClass();
        return new C101942ap(xVar, dVar, z, uVar4, aVar9, agVar4, aeVar4, aVar10, cbVar2, aVar12, asVar4, gVar11, aVar14, fVar5, fVar7, str2, tVar3);
    }
}
