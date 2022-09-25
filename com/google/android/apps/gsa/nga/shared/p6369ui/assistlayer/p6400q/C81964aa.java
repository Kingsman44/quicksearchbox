package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81809b;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81826s;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.aa */
/* compiled from: PG */
public final class C81964aa extends C81978ao {

    /* renamed from: a */
    private final C81809b f224098a;

    /* renamed from: b */
    private final C81826s f224099b;

    /* renamed from: c */
    private final boolean f224100c;

    public C81964aa(C81809b bVar, C81826s sVar, boolean z) {
        if (bVar != null) {
            this.f224098a = bVar;
            if (sVar != null) {
                this.f224099b = sVar;
                this.f224100c = z;
                return;
            }
            throw new NullPointerException("Null windowInsets");
        }
        throw new NullPointerException("Null androidConfiguration");
    }

    /* renamed from: a */
    public final C81809b mo75411a() {
        return this.f224098a;
    }

    /* renamed from: b */
    public final C81826s mo75412b() {
        return this.f224099b;
    }

    /* renamed from: c */
    public final boolean mo75413c() {
        return this.f224100c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81978ao) {
            C81978ao aoVar = (C81978ao) obj;
            return this.f224098a.equals(aoVar.mo75411a()) && this.f224099b.equals(aoVar.mo75412b()) && this.f224100c == aoVar.mo75413c();
        }
    }

    public final int hashCode() {
        return ((((this.f224098a.hashCode() ^ 1000003) * 1000003) ^ this.f224099b.hashCode()) * 1000003) ^ (true != this.f224100c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f224098a.toString();
        String obj2 = this.f224099b.toString();
        boolean z = this.f224100c;
        return "InputPlateLayoutConfig{androidConfiguration=" + obj + ", windowInsets=" + obj2 + ", bigScreenOptimizationEnabled=" + z + "}";
    }
}
