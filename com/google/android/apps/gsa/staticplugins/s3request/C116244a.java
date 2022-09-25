package com.google.android.apps.gsa.staticplugins.s3request;

import android.content.Context;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6517ak.C84600b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116348g;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116349h;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116353l;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116354m;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116358q;
import com.google.android.apps.gsa.staticplugins.s3request.producers.C116359r;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a */
/* compiled from: PG */
public final /* synthetic */ class C116244a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116331b f322332a;

    /* renamed from: b */
    public final /* synthetic */ C92473f f322333b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f322334c;

    public /* synthetic */ C116244a(C116331b bVar, C92473f fVar, C58833ax axVar) {
        this.f322332a = bVar;
        this.f322333b = fVar;
        this.f322334c = axVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116331b bVar = this.f322332a;
        C92473f fVar = this.f322333b;
        C58833ax axVar = this.f322334c;
        if (C92473f.m152085a(fVar.f258014b)) {
            C116354m mVar = bVar.f322512b;
            fVar.getClass();
            axVar.getClass();
            Context context = (Context) mVar.f322630a.mo17428b();
            context.getClass();
            C86124t tVar = (C86124t) mVar.f322631b.mo17428b();
            tVar.getClass();
            C90931ca caVar = (C90931ca) mVar.f322632c.mo17428b();
            caVar.getClass();
            C69464a aVar = mVar.f322633d;
            ((C90476a) mVar.f322634e.mo17428b()).getClass();
            C69464a aVar2 = mVar.f322635f;
            C69464a aVar3 = mVar.f322636g;
            C68214a a = C68219e.m98518a(((C68226l) mVar.f322637h).f184585a);
            a.getClass();
            C68214a a2 = C68219e.m98518a(((C68226l) mVar.f322638i).f184585a);
            a2.getClass();
            C68214a a3 = C68219e.m98518a(((C68226l) mVar.f322639j).f184585a);
            a3.getClass();
            C69464a aVar4 = mVar.f322640k;
            C84600b bVar2 = (C84600b) mVar.f322641l.mo17428b();
            bVar2.getClass();
            u uVar = (u) mVar.f322642m.mo17428b();
            uVar.getClass();
            return new C116353l(fVar, axVar, context, tVar, caVar, aVar, aVar2, aVar3, a, a2, a3, aVar4, bVar2, uVar);
        } else if (fVar.f258014b == C90536a.PRONUNCIATION_LEARNING) {
            C116349h hVar = bVar.f322513c;
            fVar.getClass();
            axVar.getClass();
            C86124t tVar2 = (C86124t) hVar.f322594a.mo17428b();
            tVar2.getClass();
            C90931ca caVar2 = (C90931ca) hVar.f322595b.mo17428b();
            caVar2.getClass();
            C89994f fVar2 = (C89994f) hVar.f322596c.mo17428b();
            fVar2.getClass();
            C86054o oVar = (C86054o) hVar.f322597d.mo17428b();
            oVar.getClass();
            C92302a aVar5 = (C92302a) hVar.f322598e.mo17428b();
            aVar5.getClass();
            C69464a aVar6 = hVar.f322599f;
            ((C90476a) hVar.f322600g.mo17428b()).getClass();
            u uVar2 = (u) hVar.f322601h.mo17428b();
            uVar2.getClass();
            Context context2 = (Context) hVar.f322602i.mo17428b();
            context2.getClass();
            return new C116348g(fVar, axVar, tVar2, caVar2, fVar2, oVar, aVar5, aVar6, uVar2, context2);
        } else {
            C116359r rVar = bVar.f322511a;
            fVar.getClass();
            axVar.getClass();
            C90021c cVar = (C90021c) rVar.f322670a.mo17428b();
            C90021c cVar2 = cVar;
            cVar.getClass();
            C69464a aVar7 = rVar.f322671b;
            C84466a aVar8 = (C84466a) rVar.f322672c.mo17428b();
            C84466a aVar9 = aVar8;
            aVar8.getClass();
            C69464a aVar10 = rVar.f322673d;
            C69464a aVar11 = rVar.f322674e;
            C69464a aVar12 = rVar.f322675f;
            C69464a aVar13 = rVar.f322676g;
            C69464a aVar14 = rVar.f322677h;
            C22871g gVar = (C22871g) rVar.f322678i.mo17428b();
            C22871g gVar2 = gVar;
            gVar.getClass();
            C118561t tVar3 = (C118561t) rVar.f322679j.mo17428b();
            C118561t tVar4 = tVar3;
            tVar3.getClass();
            u uVar3 = (u) rVar.f322680k.mo17428b();
            u uVar4 = uVar3;
            uVar3.getClass();
            Context context3 = (Context) rVar.f322681l.mo17428b();
            Context context4 = context3;
            context3.getClass();
            C68214a a4 = C68219e.m98518a(((C68226l) rVar.f322682m).f184585a);
            C68214a aVar15 = a4;
            a4.getClass();
            C68214a a5 = C68219e.m98518a(((C68226l) rVar.f322683n).f184585a);
            C68214a aVar16 = a5;
            a5.getClass();
            C58833ax axVar2 = (C58833ax) rVar.f322684o.mo17428b();
            axVar2.getClass();
            return new C116358q(fVar, axVar, cVar2, aVar7, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, gVar2, tVar4, uVar4, context4, aVar15, aVar16, axVar2);
        }
    }
}
