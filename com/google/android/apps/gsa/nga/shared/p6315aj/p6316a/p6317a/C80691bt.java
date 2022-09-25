package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bt */
/* compiled from: PG */
final class C80691bt extends C80789fj {

    /* renamed from: a */
    private String f221554a;

    /* renamed from: b */
    private C80831aj f221555b;

    /* renamed from: a */
    public final C80790fk mo74618a() {
        C80831aj ajVar;
        String str = this.f221554a;
        if (str != null && (ajVar = this.f221555b) != null) {
            return new C80692bu(str, ajVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221554a == null) {
            sb.append(" text");
        }
        if (this.f221555b == null) {
            sb.append(" clickUiAction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74619b(C80831aj ajVar) {
        if (ajVar != null) {
            this.f221555b = ajVar;
            return;
        }
        throw new NullPointerException("Null clickUiAction");
    }

    /* renamed from: c */
    public final void mo74620c(String str) {
        if (str != null) {
            this.f221554a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
