package com.google.android.apps.gsa.assist;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.assistant.shared.C73912w;
import com.google.android.apps.gsa.assistant.shared.az;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.opa.C83574ae;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.opa.p8354d.C108523b;
import com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120058d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assist.cc */
/* compiled from: PG */
public final class C9398cc {

    /* renamed from: A */
    private final C69464a f32629A;

    /* renamed from: B */
    private final C69464a f32630B;

    /* renamed from: C */
    private final C69464a f32631C;

    /* renamed from: D */
    private final C69464a f32632D;

    /* renamed from: E */
    private final C69464a f32633E;

    /* renamed from: F */
    private final C69464a f32634F;

    /* renamed from: G */
    private final C69464a f32635G;

    /* renamed from: H */
    private final C69464a f32636H;

    /* renamed from: I */
    private final C69464a f32637I;

    /* renamed from: a */
    private final C69464a f32638a;

    /* renamed from: b */
    private final C69464a f32639b;

    /* renamed from: c */
    private final C69464a f32640c;

    /* renamed from: d */
    private final C69464a f32641d;

    /* renamed from: e */
    private final C69464a f32642e;

    /* renamed from: f */
    private final C69464a f32643f;

    /* renamed from: g */
    private final C69464a f32644g;

    /* renamed from: h */
    private final C69464a f32645h;

    /* renamed from: i */
    private final C69464a f32646i;

    /* renamed from: j */
    private final C69464a f32647j;

    /* renamed from: k */
    private final C69464a f32648k;

    /* renamed from: l */
    private final C69464a f32649l;

    /* renamed from: m */
    private final C69464a f32650m;

    /* renamed from: n */
    private final C69464a f32651n;

    /* renamed from: o */
    private final C69464a f32652o;

    /* renamed from: p */
    private final C69464a f32653p;

    /* renamed from: q */
    private final C69464a f32654q;

    /* renamed from: r */
    private final C69464a f32655r;

    /* renamed from: s */
    private final C69464a f32656s;

    /* renamed from: t */
    private final C69464a f32657t;

    /* renamed from: u */
    private final C69464a f32658u;

    /* renamed from: v */
    private final C69464a f32659v;

    /* renamed from: w */
    private final C69464a f32660w;

    /* renamed from: x */
    private final C69464a f32661x;

    /* renamed from: y */
    private final C69464a f32662y;

    /* renamed from: z */
    private final C69464a f32663z;

    public C9398cc(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8, C69464a aVar9, C69464a aVar10, C69464a aVar11, C69464a aVar12, C69464a aVar13, C69464a aVar14, C69464a aVar15, C69464a aVar16, C69464a aVar17, C69464a aVar18, C69464a aVar19, C69464a aVar20, C69464a aVar21, C69464a aVar22, C69464a aVar23, C69464a aVar24, C69464a aVar25, C69464a aVar26, C69464a aVar27, C69464a aVar28, C69464a aVar29, C69464a aVar30, C69464a aVar31, C69464a aVar32, C69464a aVar33, C69464a aVar34, C69464a aVar35) {
        aVar.getClass();
        this.f32638a = aVar;
        aVar2.getClass();
        this.f32639b = aVar2;
        this.f32640c = aVar3;
        this.f32641d = aVar4;
        this.f32642e = aVar5;
        this.f32643f = aVar6;
        aVar7.getClass();
        this.f32644g = aVar7;
        aVar8.getClass();
        this.f32645h = aVar8;
        aVar9.getClass();
        this.f32646i = aVar9;
        aVar10.getClass();
        this.f32647j = aVar10;
        aVar11.getClass();
        this.f32648k = aVar11;
        aVar12.getClass();
        this.f32649l = aVar12;
        aVar13.getClass();
        this.f32650m = aVar13;
        aVar14.getClass();
        this.f32651n = aVar14;
        aVar15.getClass();
        this.f32652o = aVar15;
        this.f32653p = aVar16;
        this.f32654q = aVar17;
        aVar18.getClass();
        this.f32655r = aVar18;
        aVar19.getClass();
        this.f32656s = aVar19;
        aVar20.getClass();
        this.f32657t = aVar20;
        aVar21.getClass();
        this.f32658u = aVar21;
        aVar22.getClass();
        this.f32659v = aVar22;
        aVar23.getClass();
        this.f32660w = aVar23;
        aVar24.getClass();
        this.f32661x = aVar24;
        aVar25.getClass();
        this.f32662y = aVar25;
        aVar26.getClass();
        this.f32663z = aVar26;
        aVar27.getClass();
        this.f32629A = aVar27;
        aVar28.getClass();
        this.f32630B = aVar28;
        this.f32631C = aVar29;
        this.f32632D = aVar30;
        aVar31.getClass();
        this.f32633E = aVar31;
        aVar32.getClass();
        this.f32634F = aVar32;
        aVar33.getClass();
        this.f32635G = aVar33;
        aVar34.getClass();
        this.f32636H = aVar34;
        aVar35.getClass();
        this.f32637I = aVar35;
    }

    /* renamed from: a */
    public final C9397cb mo17630a(Bundle bundle, Context context, C58833ax axVar) {
        bundle.getClass();
        C86124t tVar = (C86124t) this.f32638a.mo17428b();
        C86124t tVar2 = tVar;
        tVar.getClass();
        C90929bz bzVar = (C90929bz) this.f32639b.mo17428b();
        C90929bz bzVar2 = bzVar;
        bzVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) this.f32640c).f184585a);
        C68214a aVar = a;
        a.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) this.f32641d).f184585a);
        C68214a aVar2 = a2;
        a2.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) this.f32642e).f184585a);
        C68214a aVar3 = a3;
        a3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) this.f32643f).f184585a);
        C68214a aVar4 = a4;
        a4.getClass();
        C84413ad adVar = (C84413ad) this.f32644g.mo17428b();
        C84413ad adVar2 = adVar;
        adVar.getClass();
        C9313a aVar5 = (C9313a) this.f32645h.mo17428b();
        C9313a aVar6 = aVar5;
        aVar5.getClass();
        C91022f fVar = (C91022f) this.f32646i.mo17428b();
        C91022f fVar2 = fVar;
        fVar.getClass();
        C9321i iVar = (C9321i) this.f32647j.mo17428b();
        C9321i iVar2 = iVar;
        iVar.getClass();
        bm bmVar = (bm) this.f32648k.mo17428b();
        bm bmVar2 = bmVar;
        bmVar.getClass();
        C83574ae aeVar = (C83574ae) this.f32649l.mo17428b();
        C83574ae aeVar2 = aeVar;
        aeVar.getClass();
        C9413b bVar = (C9413b) this.f32650m.mo17428b();
        C9413b bVar2 = bVar;
        bVar.getClass();
        C86152a aVar7 = (C86152a) this.f32651n.mo17428b();
        C86152a aVar8 = aVar7;
        aVar7.getClass();
        C9356b bVar3 = (C9356b) this.f32652o.mo17428b();
        C9356b bVar4 = bVar3;
        bVar3.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) this.f32653p).f184585a);
        C68214a aVar9 = a5;
        a5.getClass();
        C68214a a6 = C68219e.m98518a(((C68226l) this.f32654q).f184585a);
        C68214a aVar10 = a6;
        a6.getClass();
        C90476a aVar11 = (C90476a) this.f32655r.mo17428b();
        C90476a aVar12 = aVar11;
        aVar11.getClass();
        ((C90479a) this.f32656s.mo17428b()).getClass();
        C87677ae aeVar3 = (C87677ae) this.f32657t.mo17428b();
        C87677ae aeVar4 = aeVar3;
        aeVar3.getClass();
        Query query = (Query) this.f32658u.mo17428b();
        Query query2 = query;
        query.getClass();
        ((ComponentName) this.f32659v.mo17428b()).getClass();
        C21370a aVar13 = (C21370a) this.f32660w.mo17428b();
        C21370a aVar14 = aVar13;
        aVar13.getClass();
        C58833ax axVar2 = (C58833ax) this.f32661x.mo17428b();
        C58833ax axVar3 = axVar2;
        axVar2.getClass();
        C38802e eVar = (C38802e) this.f32662y.mo17428b();
        C38802e eVar2 = eVar;
        eVar.getClass();
        C69464a aVar15 = this.f32663z;
        C84516aa aaVar = (C84516aa) this.f32629A.mo17428b();
        C84516aa aaVar2 = aaVar;
        aaVar.getClass();
        C73912w wVar = (C73912w) this.f32630B.mo17428b();
        C73912w wVar2 = wVar;
        wVar.getClass();
        C108523b bVar5 = (C108523b) this.f32631C.mo17428b();
        C108523b bVar6 = bVar5;
        bVar5.getClass();
        C68214a a7 = C68219e.m98518a(((C68226l) this.f32632D).f184585a);
        C68214a aVar16 = a7;
        a7.getClass();
        az azVar = (az) this.f32633E.mo17428b();
        az azVar2 = azVar;
        azVar.getClass();
        C83305i iVar3 = (C83305i) this.f32634F.mo17428b();
        C83305i iVar4 = iVar3;
        iVar3.getClass();
        C22871g gVar = (C22871g) this.f32635G.mo17428b();
        C22871g gVar2 = gVar;
        gVar.getClass();
        C120058d dVar = (C120058d) this.f32636H.mo17428b();
        C120058d dVar2 = dVar;
        dVar.getClass();
        C47770dh dhVar = (C47770dh) this.f32637I.mo17428b();
        dhVar.getClass();
        return new C9397cb(bundle, context, axVar, tVar2, bzVar2, aVar, aVar2, aVar3, aVar4, adVar2, aVar6, fVar2, iVar2, bmVar2, aeVar2, bVar2, aVar8, bVar4, aVar9, aVar10, aVar12, aeVar4, query2, aVar14, axVar3, eVar2, aVar15, aaVar2, wVar2, bVar6, aVar16, azVar2, iVar4, gVar2, dVar2, dhVar);
    }
}
