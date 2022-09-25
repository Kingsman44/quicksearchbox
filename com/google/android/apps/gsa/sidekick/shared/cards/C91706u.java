package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9167bc;
import com.google.android.apps.p489g.p494d.C9171bg;
import com.google.android.apps.p489g.p494d.C9172bh;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62971cq;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64630a;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import com.google.protos.p5146w.p5147a.p5148a.C65925c;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import com.google.protos.p5146w.p5147a.p5148a.C65927e;
import com.google.protos.p5146w.p5147a.p5148a.C65928f;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.u */
/* compiled from: PG */
public final class C91706u implements C91680ai {

    /* renamed from: a */
    private final Context f255793a;

    /* renamed from: b */
    private final C91748d f255794b;

    public C91706u(Context context, C91748d dVar) {
        this.f255793a = context;
        this.f255794b = dVar;
    }

    /* renamed from: a */
    public static C65928f m150211a(C9167bc bcVar) {
        C65927e eVar = (C65927e) C65928f.f179293f.createBuilder();
        if ((bcVar.f31660a & 4) != 0) {
            int i = bcVar.f31663d;
            eVar.copyOnWrite();
            C65928f fVar = (C65928f) eVar.instance;
            fVar.f179295a |= 4;
            fVar.f179298d = i;
        }
        if ((bcVar.f31660a & 2) != 0) {
            int i2 = bcVar.f31662c;
            eVar.copyOnWrite();
            C65928f fVar2 = (C65928f) eVar.instance;
            fVar2.f179295a |= 2;
            fVar2.f179297c = i2;
        }
        if ((bcVar.f31660a & 1) != 0) {
            String str = bcVar.f31661b;
            eVar.copyOnWrite();
            C65928f fVar3 = (C65928f) eVar.instance;
            str.getClass();
            fVar3.f179295a |= 1;
            fVar3.f179296b = str;
        }
        return (C65928f) eVar.build();
    }

    /* renamed from: b */
    public final void mo86157b(C9141ad adVar) {
        C9172bh bhVar = adVar.f31529G;
        if (bhVar == null) {
            bhVar = C9172bh.f31680g;
        }
        C90332a aVar = C90332a.TRANSPARENT;
        C23129y yVar = new C23129y("images.superviewer");
        C64630a aVar2 = (C64630a) C64631b.f175197n.createBuilder();
        if ((bhVar.f31682a & 1) != 0) {
            int i = bhVar.f31684c;
            aVar2.copyOnWrite();
            C64631b bVar = (C64631b) aVar2.instance;
            bVar.f175199a |= 2;
            bVar.f175201c = i;
        }
        C62971cq cqVar = bhVar.f31683b;
        C65925c cVar = (C65925c) C65926d.f179289b.createBuilder();
        cVar.mo59439a((Iterable) Collection.EL.stream(cqVar).map(C91705t.f255792a).collect(Collectors.toList()));
        C65926d dVar = (C65926d) cVar.build();
        aVar2.copyOnWrite();
        C64631b bVar2 = (C64631b) aVar2.instance;
        dVar.getClass();
        bVar2.f175200b = dVar;
        bVar2.f175199a |= 1;
        if ((bhVar.f31682a & 2) != 0) {
            C9171bg bgVar = bhVar.f31685d;
            if (bgVar == null) {
                bgVar = C9171bg.f31674e;
            }
            if ((bgVar.f31676a & 1) != 0) {
                String str = bgVar.f31677b;
                aVar2.copyOnWrite();
                C64631b bVar3 = (C64631b) aVar2.instance;
                str.getClass();
                bVar3.f175199a |= 4;
                bVar3.f175202d = str;
            }
            if ((bgVar.f31676a & 4) != 0) {
                boolean z = bgVar.f31679d;
                aVar2.copyOnWrite();
                C64631b bVar4 = (C64631b) aVar2.instance;
                bVar4.f175199a |= 128;
                bVar4.f175206h = z;
            }
            if ((bgVar.f31676a & 2) != 0) {
                boolean z2 = bgVar.f31678c;
                aVar2.copyOnWrite();
                C64631b bVar5 = (C64631b) aVar2.instance;
                bVar5.f175199a |= 64;
                bVar5.f175205g = z2;
            }
        }
        if ((bhVar.f31682a & 4) != 0) {
            String str2 = bhVar.f31686e;
            aVar2.copyOnWrite();
            C64631b bVar6 = (C64631b) aVar2.instance;
            str2.getClass();
            bVar6.f175199a |= 8;
            bVar6.f175203e = str2;
        }
        if ((bhVar.f31682a & 8) != 0) {
            boolean z3 = bhVar.f31687f;
            aVar2.copyOnWrite();
            C64631b bVar7 = (C64631b) aVar2.instance;
            bVar7.f175199a |= 4096;
            bVar7.f175211m = z3;
        }
        Intent a = C90334c.m146886a(aVar.f252281i, yVar, C23245b.m43556a((C64631b) aVar2.build()));
        a.addFlags(65536);
        this.f255794b.mo86240d(this.f255793a, a);
    }
}
