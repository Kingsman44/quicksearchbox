package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95732aw;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bi */
/* compiled from: PG */
public final class C95358bi implements AutoCloseable {

    /* renamed from: a */
    public final C95362bm f266790a;

    /* renamed from: b */
    public final Map f266791b = new ConcurrentHashMap();

    /* renamed from: c */
    private final C95372bw f266792c;

    /* renamed from: d */
    private final C95365bp f266793d;

    /* renamed from: e */
    private final C95370bu f266794e;

    /* renamed from: f */
    private final C95026a f266795f;

    public C95358bi(C95372bw bwVar, C95365bp bpVar, C95362bm bmVar, C95370bu buVar, C95850a aVar, C95026a aVar2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f266792c = bwVar;
        this.f266793d = bpVar;
        this.f266790a = bmVar;
        this.f266794e = buVar;
        this.f266795f = aVar2;
        aVar.f268408a.add(this);
    }

    /* renamed from: a */
    public final C95355bf mo89297a(String str) {
        return (C95355bf) this.f266791b.get(str);
    }

    /* renamed from: b */
    public final C95364bo mo89298b() {
        C95355bf bfVar = (C95355bf) this.f266791b.get("wired");
        if (bfVar != null && (bfVar instanceof C95364bo)) {
            return (C95364bo) bfVar;
        }
        C95365bp bpVar = this.f266793d;
        Context context = (Context) bpVar.f266817a.mo17428b();
        context.getClass();
        C22871g gVar = (C22871g) bpVar.f266818b.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) bpVar.f266819c.mo17428b();
        gVar2.getClass();
        C95432eb ebVar = (C95432eb) bpVar.f266820d.mo17428b();
        ebVar.getClass();
        C95850a aVar = (C95850a) bpVar.f266821e.mo17428b();
        aVar.getClass();
        ((C95397cu) bpVar.f266822f.mo17428b()).getClass();
        C68214a a = C68219e.m98518a(((C68226l) bpVar.f266823g).f184585a);
        a.getClass();
        C89656k kVar = (C89656k) bpVar.f266824h.mo17428b();
        kVar.getClass();
        C95188c cVar = (C95188c) bpVar.f266825i.mo17428b();
        cVar.getClass();
        C95428dy dyVar = (C95428dy) bpVar.f266826j.mo17428b();
        dyVar.getClass();
        C95364bo boVar = new C95364bo(context, gVar, gVar2, ebVar, aVar, a, kVar, cVar, dyVar);
        this.f266791b.put("wired", boVar);
        return boVar;
    }

    /* renamed from: c */
    public final C95371bv mo89299c(UsbDevice usbDevice, String str) {
        C95355bf bfVar = (C95355bf) this.f266791b.get(str);
        if (bfVar != null && (bfVar instanceof C95371bv)) {
            return (C95371bv) bfVar;
        }
        C95372bw bwVar = this.f266792c;
        usbDevice.getClass();
        Context context = (Context) bwVar.f266862a.mo17428b();
        context.getClass();
        C22871g gVar = (C22871g) bwVar.f266863b.mo17428b();
        gVar.getClass();
        C22871g gVar2 = (C22871g) bwVar.f266864c.mo17428b();
        gVar2.getClass();
        C95432eb ebVar = (C95432eb) bwVar.f266865d.mo17428b();
        ebVar.getClass();
        C95850a aVar = (C95850a) bwVar.f266866e.mo17428b();
        aVar.getClass();
        C95397cu cuVar = (C95397cu) bwVar.f266867f.mo17428b();
        cuVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) bwVar.f266868g).f184585a);
        a.getClass();
        C89656k kVar = (C89656k) bwVar.f266869h.mo17428b();
        kVar.getClass();
        C95188c cVar = (C95188c) bwVar.f266870i.mo17428b();
        cVar.getClass();
        C95371bv bvVar = new C95371bv(usbDevice, context, gVar, gVar2, ebVar, aVar, cuVar, a, kVar, cVar);
        this.f266791b.put(str, bvVar);
        return bvVar;
    }

    public final void close() {
        this.f266791b.clear();
    }

    /* renamed from: d */
    public final Map mo89301d() {
        return new HashMap(this.f266791b);
    }

    /* renamed from: e */
    public final C95345aw mo89302e(C124539a aVar) {
        String address = aVar.f343619a.getAddress();
        C95355bf bfVar = (C95355bf) this.f266791b.get(address);
        if (bfVar != null && (bfVar instanceof C95345aw)) {
            return (C95345aw) bfVar;
        }
        C95370bu buVar = this.f266794e;
        C95026a aVar2 = this.f266795f;
        C95026a aVar3 = aVar2;
        C68214a a = C68219e.m98518a(((C68226l) buVar.f266843a).f184585a);
        C68214a aVar4 = a;
        a.getClass();
        C95349b bVar = (C95349b) buVar.f266844b.mo17428b();
        C95349b bVar2 = bVar;
        bVar.getClass();
        C22871g gVar = (C22871g) buVar.f266845c.mo17428b();
        C22871g gVar2 = gVar;
        gVar.getClass();
        C22871g gVar3 = (C22871g) buVar.f266846d.mo17428b();
        C22871g gVar4 = gVar3;
        gVar3.getClass();
        C90821bm bmVar = (C90821bm) buVar.f266847e.mo17428b();
        C90821bm bmVar2 = bmVar;
        bmVar.getClass();
        C95295ag agVar = (C95295ag) buVar.f266848f.mo17428b();
        C95295ag agVar2 = agVar;
        agVar.getClass();
        C95426dw dwVar = (C95426dw) buVar.f266849g.mo17428b();
        C95426dw dwVar2 = dwVar;
        dwVar.getClass();
        C95850a aVar5 = (C95850a) buVar.f266850h.mo17428b();
        C95850a aVar6 = aVar5;
        aVar5.getClass();
        C95357bh bhVar = (C95357bh) buVar.f266851i.mo17428b();
        C95357bh bhVar2 = bhVar;
        bhVar.getClass();
        C95732aw awVar = (C95732aw) buVar.f266852j.mo17428b();
        C95369bt btVar = r1;
        C95732aw awVar2 = awVar;
        awVar.getClass();
        C95026a aVar7 = aVar2;
        C89656k kVar = (C89656k) buVar.f266853k.mo17428b();
        C89656k kVar2 = kVar;
        kVar.getClass();
        String str = address;
        C95391co coVar = (C95391co) buVar.f266854l.mo17428b();
        C95370bu buVar2 = buVar;
        coVar.getClass();
        C95416dm dmVar = (C95416dm) buVar2.f266855m.mo17428b();
        String str2 = str;
        dmVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) buVar2.f266856n).f184585a);
        a2.getClass();
        aVar.getClass();
        aVar7.getClass();
        C95369bt btVar2 = new C95369bt(aVar4, bVar2, gVar2, gVar4, bmVar2, agVar2, dwVar2, aVar6, bhVar2, awVar2, kVar2, coVar, dmVar, a2, aVar, aVar3);
        C95369bt btVar3 = btVar;
        this.f266791b.put(str2, btVar3);
        return btVar3;
    }
}
