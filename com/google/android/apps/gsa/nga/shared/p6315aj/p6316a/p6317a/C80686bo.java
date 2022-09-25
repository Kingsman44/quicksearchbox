package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bo */
/* compiled from: PG */
public final class C80686bo extends C80780fa {

    /* renamed from: a */
    public String f221531a;

    /* renamed from: b */
    public String f221532b;

    /* renamed from: c */
    private C58485gu f221533c;

    /* renamed from: a */
    public final C80787fh mo74590a() {
        String str;
        C58485gu guVar = this.f221533c;
        if (guVar != null && (str = this.f221531a) != null) {
            return new C80687bp(guVar, str, this.f221532b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221533c == null) {
            sb.append(" chips");
        }
        if (this.f221531a == null) {
            sb.append(" headerText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74591b(C58485gu guVar) {
        if (guVar != null) {
            this.f221533c = guVar;
            return;
        }
        throw new NullPointerException("Null chips");
    }

    /* renamed from: c */
    public final void mo74592c(String str) {
        if (str != null) {
            this.f221531a = str;
            return;
        }
        throw new NullPointerException("Null headerText");
    }
}
