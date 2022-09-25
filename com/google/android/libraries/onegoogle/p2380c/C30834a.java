package com.google.android.libraries.onegoogle.p2380c;

import android.content.Context;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.common.base.C58838bb;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.protos.p4868ao.p4869a.p4870a.C63643a;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import com.google.protos.p4868ao.p4869a.p4870a.C63645c;
import com.google.protos.p4868ao.p4869a.p4870a.C63646d;
import com.google.protos.p4868ao.p4871b.p4872a.C63648b;
import com.google.protos.p4868ao.p4871b.p4872a.C63650d;
import com.google.protos.p4868ao.p4871b.p4872a.C63653g;

/* renamed from: com.google.android.libraries.onegoogle.c.a */
/* compiled from: PG */
public final class C30834a extends C30860b {

    /* renamed from: a */
    private final C30158c f83171a;

    /* renamed from: b */
    private final C143658k f83172b;

    /* renamed from: c */
    private final C143658k f83173c;

    /* renamed from: d */
    private final String f83174d;

    public C30834a(C30158c cVar, Context context) {
        C143658k a = C143658k.m233373b(context, "ONEGOOGLE_MOBILE").mo118952a();
        C143658k a2 = C143658k.m233374c(context, "ONEGOOGLE_MOBILE").mo118952a();
        this.f83172b = a;
        this.f83173c = a2;
        this.f83171a = cVar;
        this.f83174d = context.getApplicationContext().getPackageName();
    }

    /* renamed from: c */
    private final void m57591c(int i, Object obj, C63644b bVar) {
        C143657j jVar;
        int a = C63653g.m96269a(bVar.f172122b);
        boolean z = false;
        int i2 = 1;
        C58838bb.m90868c((a == 0 || a == 1) ? false : true);
        int a2 = C63650d.m96268a(bVar.f172123c);
        C58838bb.m90868c((a2 == 0 || a2 == 1) ? false : true);
        int a3 = C63648b.m96267a(bVar.f172125e);
        if (!(a3 == 0 || a3 == 1)) {
            z = true;
        }
        C58838bb.m90868c(z);
        C63645c cVar = (C63645c) C63646d.f172127c.createBuilder();
        C63643a aVar = (C63643a) bVar.toBuilder();
        String str = this.f83174d;
        aVar.copyOnWrite();
        C63644b bVar2 = (C63644b) aVar.instance;
        str.getClass();
        bVar2.f172121a |= 64;
        bVar2.f172126f = str;
        C63644b bVar3 = (C63644b) aVar.build();
        cVar.copyOnWrite();
        C63646d dVar = (C63646d) cVar.instance;
        bVar3.getClass();
        dVar.f172130b = bVar3;
        dVar.f172129a |= 1;
        C63646d dVar2 = (C63646d) cVar.build();
        int i3 = i - 1;
        if (i3 == 0) {
            jVar = this.f83172b.mo118999d(dVar2);
            jVar.mo118996e(String.valueOf(this.f83171a.mo35553d(obj)));
        } else if (i3 != 1) {
            jVar = this.f83173c.mo118999d(dVar2);
        } else {
            jVar = this.f83172b.mo118999d(dVar2);
        }
        int a4 = C63653g.m96269a(bVar.f172122b);
        if (a4 != 0) {
            i2 = a4;
        }
        C58149a aVar2 = jVar.f389461c;
        aVar2.copyOnWrite();
        C58150b bVar4 = (C58150b) aVar2.instance;
        C58150b bVar5 = C58150b.f155459k;
        bVar4.f155461a |= 16;
        bVar4.f155464d = i2 - 1;
        jVar.mo118992a();
    }

    /* renamed from: a */
    public final void mo35875a(Object obj, C63644b bVar) {
        int i = this.f83171a.mo35550a(obj).f76911b;
        if (i != 4) {
            if (i == 1 && (obj == null || !this.f83171a.mo35558i(obj))) {
                i = 2;
            }
            m57591c(i, obj, bVar);
        }
    }

    /* renamed from: b */
    public final void mo35876b(C63644b bVar) {
        m57591c(3, (Object) null, bVar);
    }
}
