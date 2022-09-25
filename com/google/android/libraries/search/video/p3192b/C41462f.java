package com.google.android.libraries.search.video.p3192b;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21238ah;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1714d.C20873cx;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.android.libraries.search.video.conductor.C41482e;
import com.google.android.libraries.search.video.p3191a.C41452k;
import com.google.android.libraries.search.video.p3191a.C41454m;
import com.google.android.libraries.search.video.p3194d.C41491b;
import com.google.android.libraries.search.video.p3194d.C41501l;
import com.google.android.libraries.search.video.p3195e.C41504c;
import com.google.android.libraries.search.video.p3196f.C41518l;
import com.google.android.libraries.search.video.players.C41548a;
import com.google.android.libraries.search.video.players.C41572g;
import com.google.android.libraries.search.video.players.C41593x;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57145bb;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.MessageLite;
import java.util.List;

/* renamed from: com.google.android.libraries.search.video.b.f */
/* compiled from: PG */
public final /* synthetic */ class C41462f implements C20873cx {

    /* renamed from: a */
    public final /* synthetic */ C41452k f108292a;

    /* renamed from: b */
    public final /* synthetic */ C41454m f108293b;

    /* renamed from: c */
    public final /* synthetic */ C41593x f108294c;

    /* renamed from: d */
    public final /* synthetic */ C41548a f108295d;

    /* renamed from: e */
    public final /* synthetic */ C40480q f108296e;

    /* renamed from: f */
    public final /* synthetic */ C41482e f108297f;

    /* renamed from: g */
    public final /* synthetic */ C41501l f108298g;

    /* renamed from: h */
    public final /* synthetic */ C41518l f108299h;

    /* renamed from: i */
    public final /* synthetic */ C41504c f108300i;

    /* renamed from: j */
    public final /* synthetic */ C41572g f108301j;

    /* renamed from: k */
    public final /* synthetic */ C41491b f108302k;

    public /* synthetic */ C41462f(C41482e eVar, C41501l lVar, C41452k kVar, C41454m mVar, C41518l lVar2, C41593x xVar, C41548a aVar, C41504c cVar, C41572g gVar, C41491b bVar, C40480q qVar) {
        this.f108297f = eVar;
        this.f108298g = lVar;
        this.f108292a = kVar;
        this.f108293b = mVar;
        this.f108299h = lVar2;
        this.f108294c = xVar;
        this.f108295d = aVar;
        this.f108300i = cVar;
        this.f108301j = gVar;
        this.f108302k = bVar;
        this.f108296e = qVar;
    }

    /* renamed from: a */
    public final C6405o mo25998a(C6411u uVar, C21319z zVar, MessageLite messageLite, String str, List list) {
        C41482e eVar = this.f108297f;
        C41501l lVar = this.f108298g;
        C41452k kVar = this.f108292a;
        C41454m mVar = this.f108293b;
        C41518l lVar2 = this.f108299h;
        C41593x xVar = this.f108294c;
        C41548a aVar = this.f108295d;
        C41504c cVar = this.f108300i;
        C41572g gVar = this.f108301j;
        C41491b bVar = this.f108302k;
        C40480q qVar = this.f108296e;
        C57145bb bbVar = (C57145bb) messageLite;
        C41457a aVar2 = new C41457a();
        aVar2.mo43987d(uVar, new C41460d());
        float f = C41469m.m72499a(bbVar).f152697d;
        if (f <= 0.0f) {
            f = 1.7777778f;
        }
        aVar2.mo13443p(f);
        aVar2.f108267a.f108287f = bbVar;
        aVar2.f108268d.set(10);
        aVar2.f108267a.f108284c = eVar.mo44003a(bbVar.f152556h);
        aVar2.f108268d.set(3);
        aVar2.f108267a.f108279F = lVar;
        aVar2.f108268d.set(5);
        aVar2.f108267a.f108285d = kVar.mo43981a();
        aVar2.f108268d.set(6);
        aVar2.f108267a.f108276C = mVar;
        aVar2.f108268d.set(12);
        aVar2.f108267a.f108278E = lVar2;
        aVar2.f108268d.set(4);
        aVar2.f108267a.f108275B = xVar;
        aVar2.f108268d.set(11);
        aVar2.f108267a.f108282a = aVar;
        aVar2.f108268d.set(0);
        aVar2.f108267a.f108281H = cVar;
        aVar2.f108268d.set(9);
        aVar2.f108267a.f108280G = gVar;
        aVar2.f108268d.set(7);
        aVar2.f108267a.f108277D = bVar;
        aVar2.f108268d.set(1);
        aVar2.f108267a.f108286e = qVar;
        aVar2.f108268d.set(8);
        C21238ah g = zVar.mo26805g();
        C40027ah ahVar = g instanceof C40081u ? ((C40081u) g).f105299b : null;
        if (ahVar != null) {
            aVar2.f108267a.f108288g = ahVar;
        }
        if ((bbVar.f152549a & 32) != 0) {
            C57696b bVar2 = bbVar.f152555g;
            if (bVar2 == null) {
                bVar2 = C57696b.f154137l;
            }
            aVar2.f108267a.f108274A = bVar2;
        }
        return aVar2;
    }
}
