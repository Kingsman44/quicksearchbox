package com.google.android.apps.gsa.staticplugins.bubble.p7575b;

import android.util.Base64;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88465o;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.C96982b;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97015t;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7593b.C97036b;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7593b.C97037c;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40090a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40101b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40114d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.C40126e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4060h.p4071c.p4072a.C54205a;
import com.google.p4017at.p4060h.p4071c.p4072a.C54206b;
import com.google.p4017at.p4060h.p4071c.p4072a.C54207c;
import com.google.p4017at.p4060h.p4071c.p4072a.C54208d;
import com.google.p4017at.p4060h.p4071c.p4072a.C54209e;
import com.google.p4017at.p4060h.p4071c.p4072a.C54210f;
import com.google.p4283bv.p4287b.p4342b.C56946j;
import com.google.p4283bv.p4287b.p4342b.C56947k;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.b.d */
/* compiled from: PG */
public final class C96950d implements C96948b {

    /* renamed from: a */
    private static final C59071e f270966a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.b.d");

    /* renamed from: b */
    private final C97037c f270967b;

    /* renamed from: c */
    private final C88474x f270968c;

    public C96950d(C97036b bVar, C88474x xVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C96982b.f271035e);
        xVar.mo58887l(r0);
        Object l = xVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C96982b bVar2 = (C96982b) obj;
        this.f270967b = bVar.mo65585a(bVar2 == null ? C96982b.f271034d : bVar2);
        this.f270968c = xVar;
    }

    /* renamed from: a */
    public final Optional mo90383a() {
        Object obj;
        C88465o a = C88465o.m142813a(this.f270968c.f239180g);
        if (a == null) {
            a = C88465o.UNKNOWN_CLIENT;
        }
        if (a != C88465o.SPORTS_CLIENT) {
            ((C59052c) ((C59052c) f270966a.mo56225c()).mo56372aa(18331)).mo56386p("Client is not Sports, cannot build bubble launch params.");
            return Optional.empty();
        }
        C88474x xVar = this.f270968c;
        C62940bt r1 = C62942bv.checkIsLite(C97015t.f271115m);
        xVar.mo58887l(r1);
        Object l = xVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C97015t tVar = (C97015t) obj;
        C63088z zVar = tVar.f271120d;
        C63088z zVar2 = tVar.f271121e;
        if (zVar.mo59173M()) {
            ((C59052c) ((C59052c) f270966a.mo56225c()).mo56372aa(18330)).mo56386p("Missing bubble id to build bubble launch params.");
            return Optional.empty();
        }
        C54206b bVar = (C54206b) C54207c.f142263d.createBuilder();
        bVar.copyOnWrite();
        C54207c cVar = (C54207c) bVar.instance;
        zVar.getClass();
        cVar.f142265a |= 1;
        cVar.f142266b = zVar;
        bVar.copyOnWrite();
        C54207c cVar2 = (C54207c) bVar.instance;
        zVar2.getClass();
        cVar2.f142265a |= 2;
        cVar2.f142267c = zVar2;
        C40090a aVar = (C40090a) C40101b.f105326c.createBuilder();
        String str = tVar.f271125i;
        aVar.copyOnWrite();
        C40101b bVar2 = (C40101b) aVar.instance;
        str.getClass();
        bVar2.f105328a |= 1;
        bVar2.f105329b = str;
        C40101b bVar3 = (C40101b) aVar.build();
        C54205a aVar2 = (C54205a) C54208d.f142268f.createBuilder();
        aVar2.copyOnWrite();
        C54208d dVar = (C54208d) aVar2.instance;
        zVar.getClass();
        dVar.f142270a |= 1;
        dVar.f142271b = zVar;
        String b = this.f270967b.mo90402b();
        aVar2.copyOnWrite();
        C54208d dVar2 = (C54208d) aVar2.instance;
        b.getClass();
        dVar2.f142270a |= 16;
        dVar2.f142273d = b;
        String c = this.f270967b.mo90403c();
        aVar2.copyOnWrite();
        C54208d dVar3 = (C54208d) aVar2.instance;
        c.getClass();
        dVar3.f142270a |= 8;
        dVar3.f142272c = c;
        String format = String.format("sp_bbl:%s,_fmt:pb", new Object[]{Base64.encodeToString(((C54207c) bVar.build()).toByteArray(), 10)});
        aVar2.copyOnWrite();
        C54208d dVar4 = (C54208d) aVar2.instance;
        format.getClass();
        dVar4.f142270a |= 32;
        dVar4.f142274e = format;
        C54208d dVar5 = (C54208d) aVar2.build();
        C56946j jVar = (C56946j) C56947k.f151990a.createBuilder();
        C62940bt btVar = C54210f.f142276d;
        C54209e eVar = (C54209e) C54210f.f142275c.createBuilder();
        eVar.copyOnWrite();
        C54210f fVar = (C54210f) eVar.instance;
        dVar5.getClass();
        fVar.f142279b = dVar5;
        fVar.f142278a |= 1;
        jVar.mo58885m(btVar, (C54210f) eVar.build());
        C56947k kVar = (C56947k) jVar.build();
        C40114d dVar6 = (C40114d) C40126e.f105385i.createBuilder();
        dVar6.copyOnWrite();
        C40126e eVar2 = (C40126e) dVar6.instance;
        kVar.getClass();
        eVar2.f105388b = kVar;
        eVar2.f105387a |= 1;
        dVar6.copyOnWrite();
        C40126e eVar3 = (C40126e) dVar6.instance;
        bVar3.getClass();
        eVar3.f105390d = bVar3;
        eVar3.f105387a |= 4;
        int i = this.f270968c.f239179f;
        dVar6.copyOnWrite();
        C40126e eVar4 = (C40126e) dVar6.instance;
        eVar4.f105387a |= 2;
        eVar4.f105389c = i;
        String c2 = this.f270967b.mo90403c();
        dVar6.copyOnWrite();
        C40126e eVar5 = (C40126e) dVar6.instance;
        c2.getClass();
        eVar5.f105387a |= 8;
        eVar5.f105391e = c2;
        String b2 = this.f270967b.mo90402b();
        dVar6.copyOnWrite();
        C40126e eVar6 = (C40126e) dVar6.instance;
        b2.getClass();
        eVar6.f105387a |= 16;
        eVar6.f105392f = b2;
        int a2 = this.f270967b.mo90401a();
        dVar6.copyOnWrite();
        C40126e eVar7 = (C40126e) dVar6.instance;
        eVar7.f105387a |= 32;
        eVar7.f105393g = a2;
        String str2 = dVar5.f142274e;
        dVar6.copyOnWrite();
        C40126e eVar8 = (C40126e) dVar6.instance;
        str2.getClass();
        eVar8.f105387a |= 64;
        eVar8.f105394h = str2;
        return Optional.m71637of((C40126e) dVar6.build());
    }
}
