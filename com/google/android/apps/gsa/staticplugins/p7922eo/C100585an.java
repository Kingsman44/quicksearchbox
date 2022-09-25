package com.google.android.apps.gsa.staticplugins.p7922eo;

import android.content.Context;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.c.b.a;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.c.l;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8914d.C118986a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f.C119008ap;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6610c.C84998a;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86670ch;
import com.google.android.apps.gsa.search.core.state.p6864a.C86794i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37729w;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a.C37730x;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67242t;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.an */
/* compiled from: PG */
public final class C100585an implements C86670ch {

    /* renamed from: a */
    public static final C59071e f281229a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eo.an");

    /* renamed from: A */
    public final b f281230A;

    /* renamed from: B */
    public final a f281231B;

    /* renamed from: C */
    public final C68214a f281232C;

    /* renamed from: D */
    public final C84998a f281233D;

    /* renamed from: E */
    public final l f281234E;

    /* renamed from: F */
    public final boolean f281235F;

    /* renamed from: G */
    public C85421b f281236G;

    /* renamed from: H */
    public final C92214y f281237H;

    /* renamed from: I */
    private final C68214a f281238I;

    /* renamed from: J */
    private final C118986a f281239J;

    /* renamed from: b */
    public final C86794i f281240b;

    /* renamed from: c */
    public final C58833ax f281241c;

    /* renamed from: d */
    public final Context f281242d;

    /* renamed from: e */
    public final C91097g f281243e;

    /* renamed from: f */
    public final C22871g f281244f;

    /* renamed from: g */
    public final C22871g f281245g;

    /* renamed from: h */
    public final C22871g f281246h;

    /* renamed from: i */
    public final C86124t f281247i;

    /* renamed from: j */
    public final C84516aa f281248j;

    /* renamed from: k */
    public final C68214a f281249k;

    /* renamed from: l */
    public final C68214a f281250l;

    /* renamed from: m */
    public final C68214a f281251m;

    /* renamed from: n */
    public final C68214a f281252n;

    /* renamed from: o */
    public final C21370a f281253o;

    /* renamed from: p */
    public final boolean f281254p;

    /* renamed from: q */
    public final C68214a f281255q;

    /* renamed from: r */
    public final C9388a f281256r;

    /* renamed from: s */
    public final C86610af f281257s;

    /* renamed from: t */
    public final C68214a f281258t;

    /* renamed from: u */
    public final C68214a f281259u;

    /* renamed from: v */
    public final C68214a f281260v;

    /* renamed from: w */
    public final C100604bf f281261w;

    /* renamed from: x */
    public final C85107a f281262x;

    /* renamed from: y */
    public final C119008ap f281263y;

    /* renamed from: z */
    public final C100609f f281264z;

    public C100585an(Context context, C91097g gVar, C86794i iVar, C22871g gVar2, C22871g gVar3, C22871g gVar4, C86124t tVar, C84516aa aaVar, C92214y yVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C21370a aVar5, boolean z, C68214a aVar6, C68214a aVar7, C9388a aVar8, C86610af afVar, C68214a aVar9, C58833ax axVar, C68214a aVar10, C68214a aVar11, C100604bf bfVar, C85107a aVar12, C119008ap apVar, C100609f fVar, b bVar, a aVar13, C118986a aVar14, C68214a aVar15, C84998a aVar16, l lVar, boolean z2) {
        this.f281242d = context;
        this.f281243e = gVar;
        this.f281240b = iVar;
        this.f281244f = gVar2;
        this.f281245g = gVar3;
        this.f281246h = gVar4;
        this.f281247i = tVar;
        this.f281248j = aaVar;
        this.f281237H = yVar;
        this.f281249k = aVar;
        this.f281251m = aVar2;
        this.f281252n = aVar3;
        this.f281250l = aVar4;
        this.f281253o = aVar5;
        this.f281254p = z;
        this.f281255q = aVar6;
        this.f281238I = aVar7;
        this.f281256r = aVar8;
        this.f281257s = afVar;
        this.f281258t = aVar9;
        this.f281241c = axVar;
        this.f281259u = aVar10;
        this.f281260v = aVar11;
        this.f281261w = bfVar;
        this.f281262x = aVar12;
        this.f281263y = apVar;
        this.f281264z = fVar;
        this.f281230A = bVar;
        this.f281231B = aVar13;
        this.f281239J = aVar14;
        this.f281232C = aVar15;
        this.f281233D = aVar16;
        this.f281234E = lVar;
        this.f281235F = z2;
    }

    /* renamed from: a */
    public final void mo80278a() {
        C85421b bVar = this.f281236G;
        if (bVar != null) {
            bVar.mo78931a(C60537to.NO_LONGER_HANDLED, false);
            this.f281236G.mo78932b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C74458k mo91979b(Query query, C85422c cVar) {
        com.google.android.apps.gsa.c.b bVar;
        C58976aa aaVar = C58975e.f156826a;
        C92460b a = this.f281239J.mo104088a(query, ((C92486a) this.f281238I.mo27525b()).mo87252z(query));
        C67242t p = a.mo87204p();
        if ((p == C67242t.SEAMLESS_HOTWORD || p == C67242t.SEAMLESS_HOTWORD_BEEP) && a.mo87211w()) {
            bVar = com.google.android.apps.gsa.c.b.l;
        } else {
            bVar = com.google.android.apps.gsa.c.b.b;
        }
        com.google.android.apps.gsa.c.b bVar2 = bVar;
        C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37729w wVar = (C37729w) C37730x.f100158c.createBuilder();
        String name = bVar2.name();
        wVar.copyOnWrite();
        C37730x xVar = (C37730x) wVar.instance;
        name.getClass();
        xVar.f100160a |= 1;
        xVar.f100161b = name;
        aVar.copyOnWrite();
        C37773c cVar2 = (C37773c) aVar.instance;
        C37730x xVar2 = (C37730x) wVar.build();
        xVar2.getClass();
        cVar2.f100246b = xVar2;
        cVar2.f100245a = 12;
        bkVar.copyOnWrite();
        C37407bl blVar = (C37407bl) bkVar.instance;
        C37773c cVar3 = (C37773c) aVar.build();
        cVar3.getClass();
        blVar.f99328b = cVar3;
        blVar.f99327a |= 1;
        return ((u) this.f281232C.mo27525b()).a((C37407bl) bkVar.build(), query, a, bVar2, new C100579ah(this, query, cVar), true, C39226b.TAG_CLASSIC_VOICE_SEARCH_MIC);
    }

    /* renamed from: c */
    public final void mo91980c(C60870cx cxVar) {
        this.f281244f.mo28211k(cxVar, "audioListeningSessionAdapterOptional", new C100578ag(this));
    }
}
