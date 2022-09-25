package com.google.android.libraries.notifications.p2268e.p2281g.p2282a;

import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2268e.p2271b.C29834a;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2281g.C29895f;
import com.google.android.libraries.notifications.p2268e.p2281g.C29896g;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2318f.p2328d.C30131a;
import com.google.android.libraries.notifications.platform.p2318f.p2328d.C30135b;
import com.google.p4160bf.p4164b.p4165a.C55625bh;
import com.google.p4160bf.p4164b.p4165a.C55626bi;
import com.google.p4160bf.p4164b.p4165a.C55637bt;
import com.google.p4160bf.p4164b.p4165a.C55638bu;
import com.google.p4160bf.p4164b.p4165a.C55639bv;
import com.google.p4160bf.p4164b.p4165a.C55640bw;
import com.google.p4160bf.p4164b.p4165a.C55653ci;
import com.google.p4160bf.p4164b.p4165a.C55657cm;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.e.g.a.ac */
/* compiled from: PG */
public final class C29864ac {

    /* renamed from: a */
    private final C30075e f80961a;

    /* renamed from: b */
    private final C30131a f80962b;

    /* renamed from: c */
    private final C29895f f80963c;

    /* renamed from: d */
    private final C29896g f80964d;

    /* renamed from: e */
    private final C29889y f80965e;

    /* renamed from: f */
    private final C29835a f80966f;

    public C29864ac(C30075e eVar, C30131a aVar, C29895f fVar, C29896g gVar, C29889y yVar, C29835a aVar2) {
        this.f80961a = eVar;
        this.f80962b = aVar;
        this.f80963c = fVar;
        this.f80964d = gVar;
        this.f80965e = yVar;
        this.f80966f = aVar2;
    }

    /* renamed from: a */
    public final C55626bi mo35182a(C29820k kVar, C55540at atVar, C55543aw awVar) {
        C55637bt btVar = (C55637bt) C55640bw.f146805c.createBuilder();
        String h = kVar.mo35009h();
        try {
            C55638bu buVar = (C55638bu) C55639bv.f146800d.createBuilder();
            long parseLong = Long.parseLong(((C30071a) this.f80961a).f81356b);
            buVar.copyOnWrite();
            C55639bv bvVar = (C55639bv) buVar.instance;
            bvVar.f146802a |= 1;
            bvVar.f146803b = parseLong;
            String c = this.f80962b.mo35526c();
            buVar.copyOnWrite();
            C55639bv bvVar2 = (C55639bv) buVar.instance;
            c.getClass();
            bvVar2.f146802a |= 2;
            bvVar2.f146804c = c;
            C55639bv bvVar3 = (C55639bv) buVar.build();
            btVar.copyOnWrite();
            C55640bw bwVar = (C55640bw) btVar.instance;
            bvVar3.getClass();
            bwVar.f146808b = bvVar3;
            bwVar.f146807a |= 1;
            C55625bh bhVar = (C55625bh) C55626bi.f146768k.createBuilder();
            String str = ((C30071a) this.f80961a).f81355a;
            bhVar.copyOnWrite();
            C55626bi biVar = (C55626bi) bhVar.instance;
            biVar.f146770a |= 2;
            biVar.f146772c = str;
            C55657cm b = this.f80964d.mo35184b(kVar);
            bhVar.copyOnWrite();
            C55626bi biVar2 = (C55626bi) bhVar.instance;
            b.getClass();
            biVar2.f146773d = b;
            biVar2.f146770a |= 4;
            C55653ci a = this.f80963c.mo35195a(h);
            bhVar.copyOnWrite();
            C55626bi biVar3 = (C55626bi) bhVar.instance;
            a.getClass();
            biVar3.f146775f = a;
            biVar3.f146770a |= 8;
            bhVar.copyOnWrite();
            C55626bi biVar4 = (C55626bi) bhVar.instance;
            biVar4.f146771b = atVar.f146563m;
            biVar4.f146770a |= 1;
            C55640bw bwVar2 = (C55640bw) btVar.build();
            bhVar.copyOnWrite();
            C55626bi biVar5 = (C55626bi) bhVar.instance;
            bwVar2.getClass();
            biVar5.f146776g = bwVar2;
            biVar5.f146770a |= 16;
            bhVar.copyOnWrite();
            C55626bi biVar6 = (C55626bi) bhVar.instance;
            awVar.getClass();
            biVar6.f146777h = awVar;
            biVar6.f146770a |= 32;
            if (C68958v.m100021d()) {
                String i = kVar.mo35011i();
                bhVar.copyOnWrite();
                C55626bi biVar7 = (C55626bi) bhVar.instance;
                i.getClass();
                biVar7.f146770a |= 64;
                biVar7.f146778i = i;
            }
            List a2 = this.f80965e.mo35197a();
            if (a2 != null) {
                bhVar.copyOnWrite();
                C55626bi biVar8 = (C55626bi) bhVar.instance;
                C62971cq cqVar = biVar8.f146774e;
                if (!cqVar.mo58948c()) {
                    biVar8.f146774e = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) a2, (List) biVar8.f146774e);
            }
            return (C55626bi) bhVar.build();
        } catch (C30135b e) {
            C29834a b2 = this.f80966f.mo35160b(24);
            b2.mo35145j(kVar);
            b2.mo35136a();
            throw e;
        }
    }
}
