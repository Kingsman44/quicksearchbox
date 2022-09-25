package com.google.android.libraries.social.populous;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.logging.C42562a;
import com.google.android.libraries.social.populous.logging.C42584s;
import com.google.android.libraries.social.populous.logging.C42586u;
import com.google.android.libraries.social.populous.logging.LogEntity;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55847i;
import com.google.protobuf.C62972cr;

/* renamed from: com.google.android.libraries.social.populous.g */
/* compiled from: PG */
public final class C42556g {

    /* renamed from: a */
    private final ClientConfigInternal f111636a;

    /* renamed from: b */
    private final long f111637b;

    /* renamed from: c */
    private final C42586u f111638c;

    public C42556g(ClientConfigInternal clientConfigInternal, long j, C42586u uVar) {
        this.f111636a = clientConfigInternal;
        this.f111637b = j;
        this.f111638c = uVar;
    }

    /* renamed from: a */
    public final C42384e mo45559a(C58485gu guVar) {
        C55815ay ayVar;
        C58485gu guVar2 = guVar;
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        C42160an anVar = new C42160an(this.f111636a, BuildConfig.FLAVOR, this.f111637b);
        int i = ((C58724pq) guVar2).f156474d;
        boolean z = false;
        int i2 = 0;
        while (i2 < i) {
            C42405ab abVar = (C42405ab) guVar2.get(i2);
            Autocompletion a = anVar.mo44852a(abVar);
            if (((Boolean) abVar.mo45402d(abVar.mo45405g()).mo56106b(C42555f.f111635a).mo56109e(Boolean.valueOf(z))).booleanValue()) {
                e.mo55395g(a);
            }
            e2.mo55395g(a);
            if (this.f111638c != null) {
                ContactMethodField[] g = a.mo44828g();
                int length = g.length;
                int i3 = 0;
                while (i3 < length) {
                    ContactMethodField contactMethodField = g[i3];
                    C42584s z2 = LogEntity.m75053z(contactMethodField, a.mo44773b().mo44830a(), z);
                    C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
                    if (iVar.f147360a == 1) {
                        ayVar = (C55815ay) iVar.f147361b;
                    } else {
                        ayVar = C55815ay.f147275f;
                    }
                    C55817b bVar = ayVar.f147278b;
                    if (bVar == null) {
                        bVar = C55817b.f147283d;
                    }
                    ((C42562a) z2).f111674a = bVar.f147286b.mo59170I(C62972cr.f170009a);
                    z2.mo45615c().addAll(a.mo44773b().f110365a.mo44798b());
                    z2.mo45625m(true);
                    LogEntity.m75051B(z2);
                    this.f111638c.putIfAbsent(contactMethodField.mo45119n(), z2.mo45613a());
                    i3++;
                    C58485gu guVar3 = guVar;
                    z = false;
                }
            }
            i2++;
            guVar2 = guVar;
            z = false;
        }
        C58485gu f = e.mo55394f();
        C58485gu f2 = e2.mo55394f();
        int i4 = ((C58724pq) f).f156474d;
        C58480gp f3 = C58485gu.m89838f(((C58724pq) f2).f156474d + i4);
        f3.mo55396h(f);
        f3.mo55396h(f2);
        return new C42384e(i4, f3.mo55394f());
    }
}
