package com.google.android.libraries.p579ar.faceviewer.p580a.p581a;

import com.google.android.libraries.p579ar.faceviewer.p588c.C10652c;
import com.google.android.libraries.p579ar.faceviewer.p588c.C10653d;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.p363ad.p364a.C6693q;
import com.google.p363ad.p364a.C6694r;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.a.a */
/* compiled from: PG */
public final class C10565a implements C10652c {

    /* renamed from: a */
    public final C58872ci f35346a;

    /* renamed from: b */
    public final C10566b f35347b;

    /* renamed from: c */
    public final ArrayList f35348c = new ArrayList(Collections.nCopies(1800, 0));

    /* renamed from: d */
    public int f35349d = 0;

    public C10565a(C58889cz czVar) {
        C58872ci ciVar = new C58872ci(czVar);
        this.f35346a = ciVar;
        ciVar.mo56160e();
        this.f35347b = new C10566b();
    }

    /* renamed from: d */
    private final int m25533d(double d) {
        ArrayList arrayList = this.f35348c;
        double d2 = (double) (this.f35349d % 1800);
        Double.isNaN(d2);
        return ((Integer) arrayList.get((int) (d2 * (1.0d - d)))).intValue();
    }

    /* renamed from: a */
    public final C6693q mo18626a() {
        C6693q qVar = (C6693q) C6694r.f19986j.createBuilder();
        int i = this.f35349d;
        qVar.copyOnWrite();
        C6694r rVar = (C6694r) qVar.instance;
        rVar.f19988a |= 1;
        rVar.f19989b = i;
        Collections.sort(this.f35348c, Collections.reverseOrder());
        int d = m25533d(0.5d);
        qVar.copyOnWrite();
        C6694r rVar2 = (C6694r) qVar.instance;
        rVar2.f19988a |= 2;
        rVar2.f19990c = d;
        int d2 = m25533d(0.9d);
        qVar.copyOnWrite();
        C6694r rVar3 = (C6694r) qVar.instance;
        rVar3.f19988a |= 32;
        rVar3.f19994g = d2;
        int d3 = m25533d(0.95d);
        qVar.copyOnWrite();
        C6694r rVar4 = (C6694r) qVar.instance;
        rVar4.f19988a |= 4;
        rVar4.f19991d = d3;
        int d4 = m25533d(0.99d);
        qVar.copyOnWrite();
        C6694r rVar5 = (C6694r) qVar.instance;
        rVar5.f19988a |= 8;
        rVar5.f19992e = d4;
        int min = Math.min(1800, this.f35349d);
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            i2 += ((Integer) this.f35348c.get(i3)).intValue();
            this.f35348c.set(i3, 0);
        }
        if (min == 0) {
            qVar.copyOnWrite();
            C6694r rVar6 = (C6694r) qVar.instance;
            rVar6.f19988a |= 16;
            rVar6.f19993f = 0;
        } else {
            int i4 = i2 / min;
            qVar.copyOnWrite();
            C6694r rVar7 = (C6694r) qVar.instance;
            rVar7.f19988a |= 16;
            rVar7.f19993f = i4;
        }
        this.f35349d = 0;
        return qVar;
    }

    /* renamed from: b */
    public final void mo18627b() {
    }

    /* renamed from: c */
    public final void mo18628c(C10653d dVar) {
    }
}
