package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.p1914a.C23195a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.z */
/* compiled from: PG */
final class C23229z implements C23207d {

    /* renamed from: a */
    final /* synthetic */ C23227x f63671a;

    /* renamed from: b */
    final /* synthetic */ C23198ac f63672b;

    /* renamed from: c */
    private final List f63673c = new ArrayList();

    public C23229z(C23198ac acVar, C23227x xVar) {
        this.f63672b = acVar;
        this.f63671a = xVar;
    }

    /* renamed from: a */
    public final void mo28659a(int i, int i2) {
        C22939d dVar = (C22939d) this.f63673c.remove(i);
        this.f63673c.add(i2, dVar);
        this.f63671a.mo28671b(i, i2, dVar);
    }

    /* renamed from: b */
    public final void mo28660b(int i, int i2) {
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 >= i) {
                C22939d dVar = (C22939d) this.f63673c.remove(i3);
                dVar.getClass();
                this.f63671a.mo28672c(i3, dVar);
                this.f63672b.f63618a.mo28308v(dVar);
                this.f63672b.f63618a.mo28307r(dVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo28661c(int i) {
        for (int i2 = i; i2 < i + 1; i2++) {
            C23198ac acVar = this.f63672b;
            C22939d i3 = acVar.f63618a.mo28305i(acVar.f63619b.mo28663b(i2));
            this.f63672b.f63619b.mo28664c(new C23195a(i3), i2);
            this.f63673c.add(i2, i3);
            this.f63671a.mo28670a(i2, i3);
        }
    }
}
