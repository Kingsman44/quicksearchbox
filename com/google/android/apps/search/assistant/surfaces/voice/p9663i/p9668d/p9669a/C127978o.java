package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d.p9669a;

import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128041j;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128042k;
import com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f.C128045n;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import p3186j$.time.Duration;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71078dx;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71079dy;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.a.o */
/* compiled from: PG */
public final class C127978o implements C127974k {

    /* renamed from: a */
    public static final C59071e f352233a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.i.d.a.o");

    /* renamed from: b */
    private final C127960aj f352234b;

    public C127978o(C127961ak akVar) {
        C51347ei eiVar = C51347ei.IN_POCKET_OR_BAG;
        C128041j d = C128042k.m209187d();
        d.mo108331e(C128045n.ACCELEROMETER, 14);
        d.mo108331e(C128045n.GRAVITY, 14);
        d.mo108331e(C128045n.PROXIMITY, 1);
        d.mo108331e(C128045n.LIGHT, 1);
        d.mo108308b(Duration.ofMillis(200));
        C128042k d2 = d.mo108330d();
        C37258g gVar = C37176a.f97191gr;
        C62940bt btVar = C71079dy.f189555d;
        C71078dx dxVar = (C71078dx) C71079dy.f189554c.createBuilder();
        dxVar.copyOnWrite();
        C71079dy dyVar = (C71079dy) dxVar.instance;
        dyVar.f189558b = 7;
        dyVar.f189557a = 1 | dyVar.f189557a;
        this.f352234b = akVar.mo108294a(eiVar, d2, gVar.mo40812e(btVar, (C71079dy) dxVar.build()), C37176a.f97192gs, C37176a.f97193gt.mo40804b(), C127975l.f352230a);
    }

    /* renamed from: a */
    public final C127951aa mo108295a() {
        return this.f352234b;
    }

    /* renamed from: b */
    public final /* synthetic */ C51347ei mo108292b() {
        return C127973j.m209101a(this);
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo108293c() {
        return C127973j.m209102b(this);
    }
}
