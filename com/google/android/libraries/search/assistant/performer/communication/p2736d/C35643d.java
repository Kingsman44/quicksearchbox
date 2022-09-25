package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a.C35606g;
import com.google.assistant.p3897e.p3921j.aeq;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.d */
/* compiled from: PG */
final class C35643d extends C35663x {

    /* renamed from: a */
    private final C35606g f93504a;

    /* renamed from: b */
    private final C35665z f93505b;

    /* renamed from: c */
    private final aeq f93506c;

    public C35643d(C35606g gVar, C35665z zVar, aeq aeq) {
        this.f93504a = gVar;
        this.f93505b = zVar;
        this.f93506c = aeq;
    }

    /* renamed from: a */
    public final C35665z mo39770a() {
        return this.f93505b;
    }

    /* renamed from: b */
    public final C35606g mo39771b() {
        return this.f93504a;
    }

    /* renamed from: c */
    public final aeq mo39772c() {
        return this.f93506c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35663x) {
            C35663x xVar = (C35663x) obj;
            return this.f93504a.equals(xVar.mo39771b()) && this.f93505b.equals(xVar.mo39770a()) && this.f93506c.equals(xVar.mo39772c());
        }
    }

    public final int hashCode() {
        return ((((this.f93504a.hashCode() ^ 1000003) * 1000003) ^ this.f93505b.hashCode()) * 1000003) ^ this.f93506c.hashCode();
    }

    public final String toString() {
        String obj = this.f93504a.toString();
        String obj2 = this.f93505b.toString();
        String obj3 = this.f93506c.toString();
        return "MarkAsReadConfig{messageSnapshotCache=" + obj + ", markAsReadSender=" + obj2 + ", markNotificationAsReadArgs=" + obj3 + "}";
    }
}
