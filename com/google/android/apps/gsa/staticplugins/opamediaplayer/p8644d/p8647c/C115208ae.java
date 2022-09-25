package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p5535j.p5536a.p5561h.C71177a;
import p5535j.p5536a.p5561h.C71179c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ae */
/* compiled from: PG */
final class C115208ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C62722b f319714a;

    /* renamed from: b */
    final /* synthetic */ C84275o f319715b;

    /* renamed from: c */
    final /* synthetic */ C115210ag f319716c;

    /* renamed from: d */
    final /* synthetic */ C37259h f319717d;

    public C115208ae(C115210ag agVar, C37259h hVar, C62722b bVar, C84275o oVar) {
        this.f319716c = agVar;
        this.f319717d = hVar;
        this.f319714a = bVar;
        this.f319715b = oVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C71177a aVar = (C71177a) obj;
        aVar.getClass();
        C37215b bVar = this.f319716c.f319722b;
        C37252a e = this.f319717d.mo40781e(this.f319714a);
        C62940bt btVar = C71179c.f189894t;
        C63042fg i = C62953e.m95484i(this.f319716c.f319726f);
        aVar.copyOnWrite();
        C71179c cVar = (C71179c) aVar.instance;
        i.getClass();
        cVar.f189899d = i;
        cVar.f189896a |= 8;
        C63042fg i2 = C62953e.m95484i(this.f319715b.mo77801g());
        aVar.copyOnWrite();
        C71179c cVar2 = (C71179c) aVar.instance;
        i2.getClass();
        cVar2.f189900e = i2;
        cVar2.f189896a |= 16;
        float floatValue = ((Float) this.f319715b.mo77808n().mo56109e(Float.valueOf(0.0f))).floatValue();
        aVar.copyOnWrite();
        C71179c cVar3 = (C71179c) aVar.instance;
        cVar3.f189896a |= 32;
        cVar3.f189901f = floatValue;
        int i3 = 1;
        if (true == this.f319716c.f319724d.mo101954a().mo101953g()) {
            i3 = 2;
        }
        aVar.copyOnWrite();
        C71179c cVar4 = (C71179c) aVar.instance;
        cVar4.f189906k = i3 - 1;
        cVar4.f189896a |= 1024;
        boolean z = this.f319716c.f319728h;
        aVar.copyOnWrite();
        C71179c cVar5 = (C71179c) aVar.instance;
        cVar5.f189896a |= 2048;
        cVar5.f189907l = z;
        ((C37253b) e).mo40792p(btVar, (C71179c) aVar.build());
        bVar.mo19974a(e);
        this.f319716c.f319728h = false;
    }
}
