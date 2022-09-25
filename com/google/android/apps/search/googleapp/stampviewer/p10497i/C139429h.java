package com.google.android.apps.search.googleapp.stampviewer.p10497i;

import android.net.Uri;
import com.google.android.apps.search.googleapp.amp.p10138a.C133456e;
import com.google.android.apps.search.googleapp.amp.p10138a.C133459h;
import com.google.android.apps.search.googleapp.amp.p10138a.C133460i;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139322d;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139323e;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139324f;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139325g;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.apps.p3579a.p3580a.C45611a;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58837ba;
import com.google.common.p4541l.C59326i;
import com.google.common.p4552o.amk;
import com.google.common.p4552o.aml;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4242bp.p4253e.p4254a.C56182b;
import com.google.p4242bp.p4253e.p4254a.C56192l;
import com.google.p4242bp.p4253e.p4254a.C56198r;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56609a;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56621m;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import com.google.p4495cl.p4496a.C58128a;
import com.google.p4495cl.p4496a.C58129b;
import com.google.protobuf.C62940bt;
import com.google.protos.p4970c.p4971a.C64626a;
import com.google.protos.p4970c.p4971a.C64627b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.h */
/* compiled from: PG */
public final /* synthetic */ class C139429h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C139430i f379117a;

    /* renamed from: b */
    public final /* synthetic */ C47505k f379118b;

    public /* synthetic */ C139429h(C139430i iVar, C47505k kVar) {
        this.f379117a = iVar;
        this.f379118b = kVar;
    }

    public final C60870cx apply(Object obj) {
        C139430i iVar = this.f379117a;
        C47505k kVar = this.f379118b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84517e());
        }
        String str = iVar.f379122d.f149729b;
        if (C58837ba.m90859h(str)) {
            iVar.f379120b.mo114942b(C139423b.NO_PUBLISHER_URL, (Exception) null);
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("Could not open URL."));
        }
        Optional a = C133456e.m216614a(Uri.parse(str));
        if (a.isEmpty()) {
            iVar.f379120b.mo114942b(C139423b.CANNOT_DERIVE_CACHE_URL, (Exception) null);
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("Could not open URL."));
        }
        C139323e eVar = (C139323e) C139324f.f378925k.createBuilder();
        C56198r rVar = iVar.f379122d;
        String str2 = rVar.f149729b;
        C58128a aVar = (C58128a) C58129b.f155400a.createBuilder();
        C62940bt btVar = C64627b.f175182d;
        C64626a aVar2 = (C64626a) C64627b.f175181c.createBuilder();
        aVar2.copyOnWrite();
        C64627b bVar = (C64627b) aVar2.instance;
        bVar.f175184a |= 512;
        bVar.f175185b = true;
        aVar.mo58885m(btVar, (C64627b) aVar2.build());
        C59326i iVar2 = C59326i.f157517e;
        byte[] byteArray = ((C58129b) aVar.build()).toByteArray();
        String l = iVar2.mo56837l(byteArray, byteArray.length);
        C133459h a2 = C133460i.m216626a((Uri) a.get());
        a2.mo111166d("usqp", l);
        Uri a3 = a2.mo111163a();
        C56609a aVar3 = (C56609a) C56610b.f151140k.createBuilder();
        String uri = a3.toString();
        aVar3.copyOnWrite();
        C56610b bVar2 = (C56610b) aVar3.instance;
        uri.getClass();
        bVar2.f151142a |= 2;
        bVar2.f151144c = uri;
        aVar3.copyOnWrite();
        C56610b bVar3 = (C56610b) aVar3.instance;
        str2.getClass();
        bVar3.f151142a |= 1;
        bVar3.f151143b = str2;
        aVar3.copyOnWrite();
        C56610b bVar4 = (C56610b) aVar3.instance;
        bVar4.f151142a |= 1024;
        bVar4.f151151j = true;
        if ((rVar.f149728a & 4) != 0) {
            C56621m mVar = (C56621m) C56622n.f151177e.createBuilder();
            C56182b bVar5 = rVar.f149731d;
            if (bVar5 == null) {
                bVar5 = C56182b.f149689f;
            }
            C56182b a4 = C139425d.m226559a(bVar5);
            mVar.copyOnWrite();
            C56622n nVar = (C56622n) mVar.instance;
            a4.getClass();
            nVar.f151180b = a4;
            nVar.f151179a |= 1;
            aVar3.copyOnWrite();
            C56610b bVar6 = (C56610b) aVar3.instance;
            C56622n nVar2 = (C56622n) mVar.build();
            nVar2.getClass();
            bVar6.f151150i = nVar2;
            bVar6.f151142a |= 512;
        }
        if ((rVar.f149728a & 2) != 0 && C45611a.f119974a.mo49710a(str2)) {
            C56192l lVar = rVar.f149730c;
            if (lVar == null) {
                lVar = C56192l.f149716c;
            }
            aVar3.copyOnWrite();
            C56610b bVar7 = (C56610b) aVar3.instance;
            lVar.getClass();
            bVar7.f151149h = lVar;
            bVar7.f151142a |= 256;
        }
        eVar.mo114903b((C56610b) aVar3.build());
        amk amk = (amk) aml.f159155c.createBuilder();
        amk.copyOnWrite();
        aml aml = (aml) amk.instance;
        aml.f159157a |= 1;
        aml.f159158b = "and.gsa.deeplink.stampviewer.shareurl";
        eVar.copyOnWrite();
        C139324f fVar = (C139324f) eVar.instance;
        aml aml2 = (aml) amk.build();
        aml2.getClass();
        fVar.f378931e = aml2;
        fVar.f378927a |= 4;
        eVar.copyOnWrite();
        C139324f fVar2 = (C139324f) eVar.instance;
        fVar2.f378932f = 4;
        fVar2.f378927a |= 8;
        C139325g gVar = (C139325g) C139326h.f378938c.createBuilder();
        boolean z = iVar.f379121c;
        gVar.copyOnWrite();
        C139326h hVar = (C139326h) gVar.instance;
        hVar.f378940a |= 1;
        hVar.f378941b = z;
        eVar.copyOnWrite();
        C139324f fVar3 = (C139324f) eVar.instance;
        C139326h hVar2 = (C139326h) gVar.build();
        hVar2.getClass();
        fVar3.f378933g = hVar2;
        fVar3.f378927a |= 16;
        eVar.copyOnWrite();
        C139324f fVar4 = (C139324f) eVar.instance;
        fVar4.f378927a |= 32;
        fVar4.f378934h = true;
        try {
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(iVar.f379119a.mo114907a((C139324f) eVar.build(), kVar.f123336a)));
        } catch (C139322d | RuntimeException e) {
            iVar.f379120b.mo114942b(C139423b.STAMP_VIEWER_FAILED_TO_OPEN, e);
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("Could not open URL."));
        }
    }
}
