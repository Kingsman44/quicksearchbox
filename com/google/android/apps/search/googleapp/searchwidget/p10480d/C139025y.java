package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import android.content.Context;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.frameworks.client.data.android.C61531o;
import com.google.net.p4726a.p4727a.C62722b;
import p5535j.p5536a.p5545c.p5553d.C71160a;
import p5535j.p5536a.p5545c.p5553d.C71161b;
import p5535j.p5536a.p5545c.p5553d.C71162c;
import p5535j.p5536a.p5545c.p5553d.C71163d;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.y */
/* compiled from: PG */
public final class C139025y {

    /* renamed from: a */
    public static final C59071e f378079a = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.d.y");

    /* renamed from: b */
    public final C139135z f378080b;

    /* renamed from: c */
    public final C61531o f378081c;

    /* renamed from: d */
    public final C60887da f378082d;

    /* renamed from: e */
    public final C60887da f378083e;

    /* renamed from: f */
    public final C42876ab f378084f;

    /* renamed from: g */
    public final C37215b f378085g;

    /* renamed from: h */
    private final Context f378086h;

    /* renamed from: i */
    private final C42876ab f378087i;

    /* renamed from: j */
    private final C42876ab f378088j;

    public C139025y(Context context, C139135z zVar, C61531o oVar, C60887da daVar, C60887da daVar2, C42876ab abVar, C42876ab abVar2, C42876ab abVar3, C37215b bVar) {
        this.f378086h = context;
        this.f378080b = zVar;
        this.f378081c = oVar;
        this.f378082d = daVar;
        this.f378083e = daVar2;
        this.f378084f = abVar;
        this.f378087i = abVar2;
        this.f378088j = abVar3;
        this.f378085g = bVar;
    }

    /* renamed from: a */
    public static C71163d m225808a(String str) {
        C71160a aVar = (C71160a) C71163d.f189848d.createBuilder();
        C71161b bVar = (C71161b) C71162c.f189843d.createBuilder();
        bVar.copyOnWrite();
        C71162c cVar = (C71162c) bVar.instance;
        cVar.f189845a |= 4;
        cVar.f189847c = str;
        aVar.copyOnWrite();
        C71163d dVar = (C71163d) aVar.instance;
        C71162c cVar2 = (C71162c) bVar.build();
        cVar2.getClass();
        dVar.f189852b = cVar2;
        dVar.f189851a |= 1;
        return (C71163d) aVar.build();
    }

    /* renamed from: b */
    public final C60870cx mo114657b(C139008h hVar, int i) {
        String str;
        C37215b bVar = this.f378085g;
        C37252a c = C37182a.f98237ix.mo40779c();
        ((C37253b) c).mo40792p(C71163d.f189849e, m225808a(C139024x.m225807a(i)));
        c.mo40781e(C62722b.OK);
        bVar.mo19974a(c);
        float f = (float) this.f378086h.getResources().getDisplayMetrics().densityDpi;
        String str2 = null;
        if (f <= 480.0f || (hVar.f378045a & 16) == 0) {
            str = (f <= 320.0f || (hVar.f378045a & 8) == 0) ? (f <= 240.0f || (hVar.f378045a & 4) == 0) ? (f <= 160.0f || (hVar.f378045a & 2) == 0) ? (hVar.f378045a & 1) != 0 ? hVar.f378046b : null : hVar.f378047c : hVar.f378048d : hVar.f378049e;
        } else {
            str = hVar.f378050f;
        }
        if (str != null && !str.isEmpty()) {
            str2 = str;
        }
        if (str2 == null) {
            ((C59052c) ((C59052c) f378079a.mo56226d()).mo56372aa(41342)).mo56386p("Did not find image asset corresponding to url");
            C37215b bVar2 = this.f378085g;
            C37252a c2 = C37182a.f98193iA.mo40779c();
            ((C37253b) c2).mo40792p(C71163d.f189849e, m225808a(C139024x.m225807a(i)));
            c2.mo40781e(C62722b.OK);
            bVar2.mo19974a(c2);
            return C60866ct.f164955a;
        } else if (i - 1 != 0) {
            return this.f378088j.mo46039a(new C139021u(this, str2, i), this.f378083e);
        } else {
            return this.f378087i.mo46039a(new C139020t(this, str2, i), this.f378083e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo114658c(int i) {
        if (i - 1 != 0) {
            return this.f378088j.mo46039a(C139018r.f378068a, this.f378083e);
        }
        return this.f378087i.mo46039a(C139017q.f378067a, this.f378083e);
    }
}
