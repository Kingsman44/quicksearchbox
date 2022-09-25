package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.al */
/* compiled from: PG */
public final class C80656al extends C80694bw {

    /* renamed from: a */
    public String f221414a;

    /* renamed from: b */
    public int f221415b;

    /* renamed from: c */
    private C80831aj f221416c;

    /* renamed from: a */
    public final C80696by mo74424a() {
        if (this.f221414a != null && this.f221416c != null && this.f221415b != 0) {
            return new C80657am(this.f221414a, this.f221416c, this.f221415b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221414a == null) {
            sb.append(" text");
        }
        if (this.f221416c == null) {
            sb.append(" clickAction");
        }
        if (this.f221415b == 0) {
            sb.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74425b(C80831aj ajVar) {
        if (ajVar != null) {
            this.f221416c = ajVar;
            return;
        }
        throw new NullPointerException("Null clickAction");
    }

    /* renamed from: c */
    public final void mo74426c(String str) {
        if (str != null) {
            this.f221414a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
