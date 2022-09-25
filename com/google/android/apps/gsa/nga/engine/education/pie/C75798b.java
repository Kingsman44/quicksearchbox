package com.google.android.apps.gsa.nga.engine.education.pie;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b */
/* compiled from: PG */
final class C75798b extends C75913n {

    /* renamed from: a */
    private final Optional f210360a;

    /* renamed from: b */
    private final Optional f210361b;

    /* renamed from: c */
    private final String f210362c;

    /* renamed from: d */
    private final C80248co f210363d;

    /* renamed from: e */
    private final int f210364e;

    public C75798b(int i, Optional optional, Optional optional2, String str, C80248co coVar) {
        this.f210364e = i;
        this.f210360a = optional;
        this.f210361b = optional2;
        this.f210362c = str;
        this.f210363d = coVar;
    }

    /* renamed from: a */
    public final C80248co mo71893a() {
        return this.f210363d;
    }

    /* renamed from: b */
    public final Optional mo71894b() {
        return this.f210361b;
    }

    /* renamed from: c */
    public final Optional mo71895c() {
        return this.f210360a;
    }

    /* renamed from: d */
    public final String mo71896d() {
        return this.f210362c;
    }

    /* renamed from: e */
    public final int mo71897e() {
        return this.f210364e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C75913n) {
            C75913n nVar = (C75913n) obj;
            return this.f210364e == nVar.mo71897e() && this.f210360a.equals(nVar.mo71895c()) && this.f210361b.equals(nVar.mo71894b()) && this.f210362c.equals(nVar.mo71896d()) && this.f210363d.equals(nVar.mo71893a());
        }
    }

    public final int hashCode() {
        return ((((((((this.f210364e ^ 1000003) * 1000003) ^ this.f210360a.hashCode()) * 1000003) ^ this.f210361b.hashCode()) * 1000003) ^ this.f210362c.hashCode()) * 1000003) ^ this.f210363d.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f210364e - 1);
        String valueOf = String.valueOf(this.f210360a);
        String valueOf2 = String.valueOf(this.f210361b);
        String str = this.f210362c;
        String num2 = Integer.toString(this.f210363d.f220171g);
        return "TriggerMetadata{triggerSource=" + num + ", notificationTitle=" + valueOf + ", notificationDescription=" + valueOf2 + ", selectedQuery=" + str + ", usecaseType=" + num2 + "}";
    }
}
