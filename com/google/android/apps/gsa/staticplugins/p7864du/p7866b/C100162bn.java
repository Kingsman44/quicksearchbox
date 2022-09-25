package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.apps.gsa.store.C118327r;
import com.google.android.apps.gsa.store.C118336y;
import com.google.common.base.C58833ax;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.bn */
/* compiled from: PG */
final class C100162bn implements C100158bj {

    /* renamed from: a */
    private final C118327r f280078a;

    /* renamed from: b */
    private boolean f280079b;

    public C100162bn(C118327r rVar, boolean z) {
        this.f280078a = rVar;
        this.f280079b = z;
    }

    /* renamed from: a */
    public final void mo91779a(C58833ax axVar, C58833ax axVar2, StringBuilder sb, List list) {
        boolean z = this.f280079b && this.f280078a.f328454b != 13;
        this.f280079b = z;
        if (z) {
            sb.append("(");
        }
        int i = this.f280078a.f328454b;
        if (i == 4) {
            sb.append(C100164bp.m165990c(4));
            C100164bp.m165989b((C118336y) this.f280078a.f328453a.get(0), true).mo91779a(axVar, axVar2, sb, list);
        } else {
            String c = C100164bp.m165990c(i);
            for (int i2 = 0; i2 < this.f280078a.f328453a.size(); i2++) {
                C100164bp.m165989b((C118336y) this.f280078a.f328453a.get(i2), this.f280078a.f328454b != 13).mo91779a(axVar, axVar2, sb, list);
                if (i2 < this.f280078a.f328453a.size() - 1) {
                    sb.append(c);
                }
            }
            int i3 = this.f280078a.f328454b;
        }
        if (this.f280079b) {
            sb.append(")");
        }
    }
}
