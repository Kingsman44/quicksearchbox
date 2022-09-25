package com.google.p4449cd.p4452c;

import com.google.common.base.C58833ax;
import com.google.p4449cd.p4453d.C57958d;

/* renamed from: com.google.cd.c.a */
/* compiled from: PG */
final class C57941a extends C57953m {

    /* renamed from: a */
    private final C57958d f154955a;

    /* renamed from: b */
    private final C58833ax f154956b;

    /* renamed from: c */
    private final C58833ax f154957c;

    /* renamed from: d */
    private final C58833ax f154958d;

    /* renamed from: e */
    private final C58833ax f154959e;

    /* renamed from: f */
    private final C58833ax f154960f;

    /* renamed from: g */
    private final C58833ax f154961g;

    /* renamed from: h */
    private final C58833ax f154962h;

    /* renamed from: i */
    private final C58833ax f154963i;

    /* renamed from: j */
    private final C58833ax f154964j;

    public C57941a(C57958d dVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6, C58833ax axVar7, C58833ax axVar8, C58833ax axVar9) {
        this.f154955a = dVar;
        if (axVar != null) {
            this.f154956b = axVar;
            if (axVar2 != null) {
                this.f154957c = axVar2;
                if (axVar3 != null) {
                    this.f154958d = axVar3;
                    if (axVar4 != null) {
                        this.f154959e = axVar4;
                        if (axVar5 != null) {
                            this.f154960f = axVar5;
                            if (axVar6 != null) {
                                this.f154961g = axVar6;
                                if (axVar7 != null) {
                                    this.f154962h = axVar7;
                                    if (axVar8 != null) {
                                        this.f154963i = axVar8;
                                        if (axVar9 != null) {
                                            this.f154964j = axVar9;
                                            return;
                                        }
                                        throw new NullPointerException("Null error");
                                    }
                                    throw new NullPointerException("Null futureFinishedAtNanos");
                                }
                                throw new NullPointerException("Null finishedAtNanos");
                            }
                            throw new NullPointerException("Null startedAtNanos");
                        }
                        throw new NullPointerException("Null queuedAtNanos");
                    }
                    throw new NullPointerException("Null requestedAtNanos");
                }
                throw new NullPointerException("Null parentTaskId");
            }
            throw new NullPointerException("Null taskId");
        }
        throw new NullPointerException("Null componentId");
    }

    /* renamed from: a */
    public final C58833ax mo54543a() {
        return this.f154956b;
    }

    /* renamed from: b */
    public final C58833ax mo54544b() {
        return this.f154964j;
    }

    /* renamed from: c */
    public final C58833ax mo54545c() {
        return this.f154962h;
    }

    /* renamed from: d */
    public final C58833ax mo54546d() {
        return this.f154963i;
    }

    /* renamed from: e */
    public final C58833ax mo54547e() {
        return this.f154958d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C57953m) {
            C57953m mVar = (C57953m) obj;
            return this.f154955a.equals(mVar.mo54554j()) && this.f154956b.equals(mVar.mo54543a()) && this.f154957c.equals(mVar.mo54553i()) && this.f154958d.equals(mVar.mo54547e()) && this.f154959e.equals(mVar.mo54550g()) && this.f154960f.equals(mVar.mo54549f()) && this.f154961g.equals(mVar.mo54551h()) && this.f154962h.equals(mVar.mo54545c()) && this.f154963i.equals(mVar.mo54546d()) && this.f154964j.equals(mVar.mo54544b());
        }
    }

    /* renamed from: f */
    public final C58833ax mo54549f() {
        return this.f154960f;
    }

    /* renamed from: g */
    public final C58833ax mo54550g() {
        return this.f154959e;
    }

    /* renamed from: h */
    public final C58833ax mo54551h() {
        return this.f154961g;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f154955a.hashCode() ^ 1000003) * 1000003) ^ this.f154956b.hashCode()) * 1000003) ^ this.f154957c.hashCode()) * 1000003) ^ this.f154958d.hashCode()) * 1000003) ^ this.f154959e.hashCode()) * 1000003) ^ this.f154960f.hashCode()) * 1000003) ^ this.f154961g.hashCode()) * 1000003) ^ this.f154962h.hashCode()) * 1000003) ^ this.f154963i.hashCode()) * 1000003) ^ this.f154964j.hashCode();
    }

    /* renamed from: i */
    public final C58833ax mo54553i() {
        return this.f154957c;
    }

    /* renamed from: j */
    public final C57958d mo54554j() {
        return this.f154955a;
    }

    public final String toString() {
        String obj = this.f154955a.toString();
        String obj2 = this.f154956b.toString();
        String obj3 = this.f154957c.toString();
        String obj4 = this.f154958d.toString();
        String obj5 = this.f154959e.toString();
        String obj6 = this.f154960f.toString();
        String obj7 = this.f154961g.toString();
        String obj8 = this.f154962h.toString();
        String obj9 = this.f154963i.toString();
        String obj10 = this.f154964j.toString();
        return "TaskInfo{description=" + obj + ", componentId=" + obj2 + ", taskId=" + obj3 + ", parentTaskId=" + obj4 + ", requestedAtNanos=" + obj5 + ", queuedAtNanos=" + obj6 + ", startedAtNanos=" + obj7 + ", finishedAtNanos=" + obj8 + ", futureFinishedAtNanos=" + obj9 + ", error=" + obj10 + "}";
    }
}
