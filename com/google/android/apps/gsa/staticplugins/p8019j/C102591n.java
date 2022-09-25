package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.assistant.p3897e.p3921j.C51697ay;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.n */
/* compiled from: PG */
final class C102591n extends C102549ak {

    /* renamed from: a */
    private final C58485gu f286343a;

    /* renamed from: b */
    private final C51697ay f286344b;

    /* renamed from: c */
    private final C58833ax f286345c;

    /* renamed from: d */
    private final C58833ax f286346d;

    public C102591n(C58485gu guVar, C51697ay ayVar, C58833ax axVar, C58833ax axVar2) {
        this.f286343a = guVar;
        this.f286344b = ayVar;
        this.f286345c = axVar;
        this.f286346d = axVar2;
    }

    /* renamed from: a */
    public final C51697ay mo93323a() {
        return this.f286344b;
    }

    /* renamed from: b */
    public final C58833ax mo93324b() {
        return this.f286346d;
    }

    /* renamed from: c */
    public final C58833ax mo93325c() {
        return this.f286345c;
    }

    /* renamed from: d */
    public final C58485gu mo93326d() {
        return this.f286343a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102549ak) {
            C102549ak akVar = (C102549ak) obj;
            return C58597ky.m90218i(this.f286343a, akVar.mo93326d()) && this.f286344b.equals(akVar.mo93323a()) && this.f286345c.equals(akVar.mo93325c()) && this.f286346d.equals(akVar.mo93324b());
        }
    }

    public final int hashCode() {
        return ((((((this.f286343a.hashCode() ^ 1000003) * 1000003) ^ this.f286344b.hashCode()) * 1000003) ^ this.f286345c.hashCode()) * 1000003) ^ this.f286346d.hashCode();
    }

    public final String toString() {
        String obj = this.f286343a.toString();
        String num = Integer.toString(this.f286344b.f135627c);
        String valueOf = String.valueOf(this.f286345c);
        String valueOf2 = String.valueOf(this.f286346d);
        return "OpaAgsaSurfaceParams{customClientOps=" + obj + ", audioEnvironment=" + num + ", query=" + valueOf + ", appsDelta=" + valueOf2 + "}";
    }
}
