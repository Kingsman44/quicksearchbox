package com.google.android.libraries.assistant.auto.jumpboost.p691h.p692a;

import com.google.android.apps.auto.p450a.p451a.C8893bk;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.C11634j;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4553a.C59470au;
import com.google.common.p4552o.p4553a.C59473ax;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.h.a.f */
/* compiled from: PG */
class C11811f implements C46440f {

    /* renamed from: a */
    final /* synthetic */ C11812g f37976a;

    public C11811f(C11812g gVar) {
        this.f37976a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
        Void voidR = (Void) obj;
        C59104x d = C11812g.f37977a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AsProjectedFP");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(43483)).mo56386p("Failed to retrieve session data from Gearhead.");
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        C59473ax b = C11634j.m27336b((C8893bk) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C8893bk.f30858l, this.f37976a.f37985i));
        String str = this.f37976a.f37993q.f37595e;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1527;
        C59470au auVar = (C59470au) C59473ax.f157780o.createBuilder(b);
        auVar.copyOnWrite();
        C59473ax axVar = (C59473ax) auVar.instance;
        axVar.f157782a |= 512;
        axVar.f157793l = true;
        String g = C58837ba.m90858g(str);
        auVar.copyOnWrite();
        C59473ax axVar2 = (C59473ax) auVar.instance;
        axVar2.f157782a |= 1024;
        axVar2.f157794m = g;
        C59473ax axVar3 = (C59473ax) auVar.build();
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        axVar3.getClass();
        ufVar2.f164263r = axVar3;
        ufVar2.f164093a |= 128;
        Long l = this.f37976a.f37993q.f37597g;
        if (l != null) {
            String b2 = C39191a.m68623b(l.longValue());
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            b2.getClass();
            ufVar3.f164093a |= 4;
            ufVar3.f164259n = b2;
            this.f37976a.f37993q.f37597g = null;
        }
        long longValue = ((Long) this.f37976a.f37992p.mo17428b()).longValue();
        if (longValue > 0) {
            C46459k.m82829b(this.f37976a.f37993q.mo20093a(b, longValue), "Failed to save recent session telemetry.", new Object[0]);
        }
        this.f37976a.f37991o.mo41601m(tzVar);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo18068i(Object obj) {
    }
}
