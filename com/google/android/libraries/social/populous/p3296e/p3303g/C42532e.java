package com.google.android.libraries.social.populous.p3296e.p3303g;

import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.p3289c.p3293d.C42239g;
import com.google.android.libraries.social.populous.storage.C42685f;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4181bi.C55794ad;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55844f;
import com.google.p4181bi.C55846h;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55858t;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.social.populous.e.g.e */
/* compiled from: PG */
public final /* synthetic */ class C42532e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C42540m f111541a;

    /* renamed from: b */
    public final /* synthetic */ C42576k f111542b;

    public /* synthetic */ C42532e(C42540m mVar, C42576k kVar) {
        this.f111541a = mVar;
        this.f111542b = kVar;
    }

    public final C60870cx apply(Object obj) {
        C55815ay ayVar;
        C55794ad adVar;
        C42540m mVar = this.f111541a;
        C42576k kVar = this.f111542b;
        C42239g gVar = (C42239g) obj;
        C58872ci b = mVar.f111567g.mo45632b();
        ArrayList arrayList = new ArrayList();
        C55844f fVar = gVar.f110584a;
        if (fVar == null) {
            fVar = C55844f.f147352c;
        }
        for (C55847i iVar : fVar.f147354a) {
            C42309ch b2 = C42309ch.m74493b(iVar);
            int i = iVar.f147360a;
            int a = C55846h.m87793a(i);
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i2 == 0) {
                if (i == 1) {
                    ayVar = (C55815ay) iVar.f147361b;
                } else {
                    ayVar = C55815ay.f147275f;
                }
                C55817b bVar = ayVar.f147278b;
                if (bVar == null) {
                    bVar = C55817b.f147283d;
                }
                C42685f fVar2 = new C42685f(0, bVar.f147287c, b2, iVar.toByteString());
                mVar.f111568h.mo45783b(fVar2, iVar);
                arrayList.add(fVar2);
            } else if (i2 == 1) {
                if (i == 2) {
                    adVar = (C55794ad) iVar.f147361b;
                } else {
                    adVar = C55794ad.f147223g;
                }
                C55858t tVar = adVar.f147226b;
                if (tVar == null) {
                    tVar = C55858t.f147392f;
                }
                C55817b bVar2 = tVar.f147397d;
                if (bVar2 == null) {
                    bVar2 = C55817b.f147283d;
                }
                C42685f fVar3 = new C42685f(0, bVar2.f147287c, b2, iVar.toByteString());
                mVar.f111568h.mo45783b(fVar3, iVar);
                arrayList.add(fVar3);
            }
        }
        C60870cx o = mVar.f111565e.mo45703o(new C42530c(mVar, arrayList, gVar));
        C60856cj.m92911t(o, new C42537j(mVar, b, kVar), C60826bg.f164896a);
        return o;
    }
}
