package com.google.android.libraries.geller;

import com.google.android.libraries.geller.portable.Geller;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65028am;
import com.google.protos.p4985f.p5030q.p5032b.C65029an;
import com.google.protos.p4985f.p5030q.p5032b.C65030ao;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p5129p.p5130a.C65712ak;
import com.google.protos.p5129p.p5130a.C65716ao;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayDeque;

/* renamed from: com.google.android.libraries.geller.g */
/* compiled from: PG */
public final class C21877g {

    /* renamed from: a */
    public final ArrayDeque f60369a;

    /* renamed from: b */
    public final C60887da f60370b;

    /* renamed from: c */
    public C65712ak f60371c;

    /* renamed from: d */
    public int f60372d = 0;

    /* renamed from: e */
    private final Geller f60373e;

    /* renamed from: f */
    private final C65716ao f60374f;

    /* renamed from: g */
    private final C65753ak f60375g;

    /* renamed from: h */
    private final int f60376h;

    /* renamed from: i */
    private final C65031ap f60377i;

    public C21877g(C21784f fVar) {
        this.f60373e = fVar.f60095a;
        this.f60374f = fVar.f60096b;
        this.f60375g = fVar.f60097c;
        this.f60376h = fVar.f60098d;
        this.f60371c = fVar.f60100f;
        this.f60377i = fVar.f60101g;
        this.f60370b = fVar.f60099e;
        this.f60369a = new ArrayDeque();
    }

    /* renamed from: a */
    public final C60870cx mo27169a(int i) {
        Geller geller = this.f60373e;
        String str = this.f60374f.f178540c;
        C65753ak akVar = this.f60375g;
        C58833ax k = C58833ax.m90834k(Integer.valueOf(i));
        C65028am amVar = (C65028am) this.f60377i.toBuilder();
        amVar.copyOnWrite();
        C65031ap apVar = (C65031ap) amVar.instance;
        apVar.f176102a |= 4;
        apVar.f176105d = 5;
        if ((this.f60371c.f178533a & 1) != 0) {
            C65030ao aoVar = this.f60377i.f176106e;
            if (aoVar == null) {
                aoVar = C65030ao.f176095d;
            }
            C65029an anVar = (C65029an) aoVar.toBuilder();
            long j = this.f60371c.f178534b;
            anVar.copyOnWrite();
            C65030ao aoVar2 = (C65030ao) anVar.instance;
            aoVar2.f176097a |= 2;
            aoVar2.f176099c = j - 1;
            amVar.copyOnWrite();
            C65031ap apVar2 = (C65031ap) amVar.instance;
            C65030ao aoVar3 = (C65030ao) anVar.build();
            aoVar3.getClass();
            apVar2.f176106e = aoVar3;
            apVar2.f176102a |= 8;
        }
        int intValue = ((Integer) ((C58847bk) k).f156646a).intValue();
        amVar.copyOnWrite();
        C65031ap apVar3 = (C65031ap) amVar.instance;
        apVar3.f176102a |= 4;
        apVar3.f176105d = intValue;
        return C47633f.m84733g(geller.mo27182i(str, akVar, (String) null, (C65031ap) amVar.build(), C63662ac.f172144a)).mo51515h(new C21775e(this), this.f60370b);
    }

    /* renamed from: b */
    public final boolean mo27170b() {
        int i = this.f60376h;
        return i > 0 && this.f60372d >= i;
    }
}
