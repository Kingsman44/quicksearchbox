package com.google.apps.p3589d.p3590a;

import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3600k.C45941f;

/* renamed from: com.google.apps.d.a.e */
/* compiled from: PG */
final class C45688e extends C45707x {

    /* renamed from: a */
    private final boolean f120178a;

    /* renamed from: b */
    private final C45941f f120179b;

    /* renamed from: c */
    private final C45941f f120180c;

    public C45688e(boolean z, C45941f fVar, C45941f fVar2) {
        this.f120178a = z;
        this.f120179b = fVar;
        this.f120180c = fVar2;
    }

    /* renamed from: a */
    public final C45723n mo49756a() {
        return null;
    }

    /* renamed from: b */
    public final C45941f mo49757b() {
        return this.f120180c;
    }

    /* renamed from: c */
    public final C45941f mo49758c() {
        return this.f120179b;
    }

    /* renamed from: d */
    public final boolean mo49759d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49760e() {
        return this.f120178a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45707x) {
            C45707x xVar = (C45707x) obj;
            return !xVar.mo49759d() && xVar.mo49756a() == null && this.f120178a == xVar.mo49760e() && this.f120179b.equals(xVar.mo49758c()) && this.f120180c.equals(xVar.mo49757b());
        }
    }

    public final int hashCode() {
        return (((((true != this.f120178a ? 1237 : 1231) ^ 880198726) * 1000003) ^ this.f120179b.hashCode()) * 1000003) ^ this.f120180c.hashCode();
    }

    public final String toString() {
        boolean z = this.f120178a;
        String valueOf = String.valueOf(this.f120179b);
        String valueOf2 = String.valueOf(this.f120180c);
        return "Options{autocorrectInvalidInput=false, debugOutput=null, showPlaceholders=" + z + ", placeholderColor=" + valueOf + ", defaultColor=" + valueOf2 + "}";
    }
}
