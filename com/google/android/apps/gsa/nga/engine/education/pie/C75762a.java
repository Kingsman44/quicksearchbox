package com.google.android.apps.gsa.nga.engine.education.pie;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a */
/* compiled from: PG */
public final class C75762a extends C75912m {

    /* renamed from: a */
    public Optional f210250a = Optional.empty();

    /* renamed from: b */
    public Optional f210251b = Optional.empty();

    /* renamed from: c */
    public String f210252c;

    /* renamed from: d */
    public int f210253d;

    /* renamed from: e */
    private C80248co f210254e;

    /* renamed from: a */
    public final C75913n mo71870a() {
        String str;
        C80248co coVar;
        int i = this.f210253d;
        if (i != 0 && (str = this.f210252c) != null && (coVar = this.f210254e) != null) {
            return new C75798b(i, this.f210250a, this.f210251b, str, coVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f210253d == 0) {
            sb.append(" triggerSource");
        }
        if (this.f210252c == null) {
            sb.append(" selectedQuery");
        }
        if (this.f210254e == null) {
            sb.append(" usecaseType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo71871b(C80248co coVar) {
        if (coVar != null) {
            this.f210254e = coVar;
            return;
        }
        throw new NullPointerException("Null usecaseType");
    }
}
