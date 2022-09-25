package com.google.android.libraries.logging.p2185ve.p2193e.p2196c;

import com.google.android.libraries.logging.p2182b.C28279j;
import com.google.android.libraries.logging.p2182b.C28282m;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.p2192d.C28352e;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4552o.p4566l.C60202dm;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.List;
import java.util.Set;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71214ax;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71215ay;

/* renamed from: com.google.android.libraries.logging.ve.e.c.a */
/* compiled from: PG */
public final class C28406a implements C28279j {

    /* renamed from: a */
    private final C28407b f77173a;

    public C28406a(C28407b bVar) {
        this.f77173a = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo33778a(C28282m mVar) {
        C28352e eVar = (C28352e) mVar.f76963a;
        C71214ax axVar = (C71214ax) C71215ay.f190101e.createBuilder();
        int a = C60202dm.m92544a(eVar.f77076c.f77225a.f77229b);
        if (a == 0) {
            a = 1;
        }
        axVar.copyOnWrite();
        C71215ay ayVar = (C71215ay) axVar.instance;
        ayVar.f190104b = a - 1;
        ayVar.f190103a |= 1;
        List list = eVar.f77075b;
        int i = 0;
        while (i < list.size()) {
            C60214n nVar = ((C28481u) list.get(i)).f77290c;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            int i2 = nVar.f162918c;
            if (i == 0) {
                axVar.copyOnWrite();
                C71215ay ayVar2 = (C71215ay) axVar.instance;
                ayVar2.f190103a |= 2;
                ayVar2.f190105c = i2;
                i = 0;
            } else {
                axVar.copyOnWrite();
                C71215ay ayVar3 = (C71215ay) axVar.instance;
                C62961ch chVar = ayVar3.f190106d;
                if (!chVar.mo58948c()) {
                    ayVar3.f190106d = C62942bv.mutableCopy(chVar);
                }
                ayVar3.f190106d.mo58916g(i2);
            }
            i++;
        }
        C28407b bVar = this.f77173a;
        C71215ay ayVar4 = (C71215ay) axVar.build();
        synchronized (bVar.f77174a) {
            bVar.f77174a.add(ayVar4);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: b */
    public final /* synthetic */ Set mo33779b() {
        return new C58759qy(C28352e.class);
    }
}
