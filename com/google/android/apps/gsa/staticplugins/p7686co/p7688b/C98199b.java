package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.b */
/* compiled from: PG */
final class C98199b extends C98203bd {

    /* renamed from: a */
    public final C58528ij f274189a;

    /* renamed from: b */
    public final C58485gu f274190b;

    /* renamed from: c */
    public final int f274191c;

    /* renamed from: d */
    public final boolean f274192d;

    public C98199b(C58528ij ijVar, C58485gu guVar, int i, boolean z) {
        this.f274189a = ijVar;
        this.f274190b = guVar;
        this.f274191c = i;
        this.f274192d = z;
    }

    /* renamed from: a */
    public final int mo91010a() {
        return this.f274191c;
    }

    /* renamed from: b */
    public final C98202bc mo91011b() {
        return new C98172a(this);
    }

    /* renamed from: c */
    public final C58485gu mo91012c() {
        return this.f274190b;
    }

    /* renamed from: d */
    public final C58528ij mo91013d() {
        return this.f274189a;
    }

    /* renamed from: e */
    public final boolean mo91014e() {
        return this.f274192d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98203bd) {
            C98203bd bdVar = (C98203bd) obj;
            return this.f274189a.equals(bdVar.mo91013d()) && C58597ky.m90218i(this.f274190b, bdVar.mo91012c()) && this.f274191c == bdVar.mo91010a() && this.f274192d == bdVar.mo91014e();
        }
    }

    public final int hashCode() {
        return ((((((this.f274189a.hashCode() ^ 1000003) * 1000003) ^ this.f274190b.hashCode()) * 1000003) ^ this.f274191c) * 1000003) ^ (true != this.f274192d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f274189a);
        String valueOf2 = String.valueOf(this.f274190b);
        int i = this.f274191c;
        boolean z = this.f274192d;
        return "ActionsToFlush{keys=" + valueOf + ", actions=" + valueOf2 + ", totalBytes=" + i + ", capacityReached=" + z + "}";
    }
}
