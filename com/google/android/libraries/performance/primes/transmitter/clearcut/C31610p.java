package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.C31619k;
import com.google.android.libraries.performance.primes.transmitter.C31620l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71284dm;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71285dn;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71286do;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71293dv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71294dw;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.p */
/* compiled from: PG */
public final class C31610p implements C31620l {

    /* renamed from: a */
    public final Context f85077a;

    /* renamed from: b */
    public final ClearcutMetricSnapshotTransmitter f85078b;

    /* renamed from: c */
    private final C58881cr f85079c;

    /* renamed from: d */
    private final boolean f85080d;

    /* renamed from: e */
    private final C31598d f85081e;

    public C31610p(Context context, C58833ax axVar, C31598d dVar, ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.f85077a = context;
        this.f85079c = C58886cw.m90973a(new C31606l(context));
        this.f85080d = ((Boolean) axVar.mo56109e(false)).booleanValue();
        this.f85081e = dVar;
        this.f85078b = clearcutMetricSnapshotTransmitter;
    }

    /* renamed from: a */
    public final C31619k mo37276a() {
        return new C31619k(9);
    }

    /* renamed from: b */
    public final C60870cx mo37277b(C71308ej ejVar) {
        int i;
        if (this.f85080d) {
            C71278dg dgVar = ejVar.f190423h;
            if (dgVar == null) {
                dgVar = C71278dg.f190307j;
            }
            if ((dgVar.f190309a & 1) != 0) {
                return C60922j.m93044g(this.f85081e.mo37274a(), new C31608n(this, ejVar), C60826bg.f164896a);
            }
        }
        if ((ejVar.f190416a & 1024) != 0 && ((Boolean) this.f85079c.mo6453a()).booleanValue()) {
            C71307ei eiVar = (C71307ei) ejVar.toBuilder();
            C71286do doVar = ejVar.f190426k;
            if (doVar == null) {
                doVar = C71286do.f190335o;
            }
            C62971cq<C71284dm> cqVar = doVar.f190346j;
            if (!cqVar.isEmpty()) {
                C71293dv dvVar = (C71293dv) C71294dw.f190376c.createBuilder();
                C71284dm dmVar = null;
                for (C71284dm dmVar2 : cqVar) {
                    if (!(dmVar == null || (i = dmVar.f190334d + 1) == dmVar2.f190333c)) {
                        dvVar.mo62665b(0);
                        dvVar.mo62664a(i);
                    }
                    dvVar.mo62665b(dmVar2.f190332b);
                    dvVar.mo62664a(dmVar2.f190333c);
                    dmVar = dmVar2;
                }
                if (!(dmVar == null || (dmVar.f190331a & 4) == 0)) {
                    int i2 = dmVar.f190334d;
                    dvVar.mo62665b(0);
                    dvVar.mo62664a(i2 + 1);
                }
                C71285dn dnVar = (C71285dn) doVar.toBuilder();
                dnVar.copyOnWrite();
                ((C71286do) dnVar.instance).f190346j = C71286do.emptyProtobufList();
                dnVar.copyOnWrite();
                C71286do doVar2 = (C71286do) dnVar.instance;
                C71294dw dwVar = (C71294dw) dvVar.build();
                dwVar.getClass();
                doVar2.f190345i = dwVar;
                doVar2.f190337a |= 128;
                doVar = (C71286do) dnVar.build();
            }
            eiVar.copyOnWrite();
            C71308ej ejVar2 = (C71308ej) eiVar.instance;
            doVar.getClass();
            ejVar2.f190426k = doVar;
            ejVar2.f190416a |= 1024;
            ejVar = (C71308ej) eiVar.build();
        }
        C60870cx h = C60922j.m93045h(this.f85081e.mo37274a(), new C31607m(this, ejVar), C60826bg.f164896a);
        if (Log.isLoggable("ClearcutMetricXmitter", 4)) {
            C60856cj.m92911t(h, new C31609o(), C60826bg.f164896a);
        }
        return h;
    }
}
