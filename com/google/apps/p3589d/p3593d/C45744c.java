package com.google.apps.p3589d.p3593d;

/* renamed from: com.google.apps.d.d.c */
/* compiled from: PG */
final class C45744c extends C45747f {

    /* renamed from: a */
    private final C45748g f120263a;

    /* renamed from: b */
    private final C45748g f120264b;

    public C45744c(C45748g gVar, C45748g gVar2) {
        if (gVar != null) {
            this.f120263a = gVar;
            if (gVar2 != null) {
                this.f120264b = gVar2;
                return;
            }
            throw new NullPointerException("Null right");
        }
        throw new NullPointerException("Null left");
    }

    /* renamed from: a */
    public final C45748g mo49870a() {
        return this.f120263a;
    }

    /* renamed from: b */
    public final C45748g mo49871b() {
        return this.f120264b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45747f) {
            C45747f fVar = (C45747f) obj;
            return this.f120263a.equals(fVar.mo49870a()) && this.f120264b.equals(fVar.mo49871b());
        }
    }

    public final int hashCode() {
        return ((this.f120263a.hashCode() ^ 1000003) * 1000003) ^ this.f120264b.hashCode();
    }

    public final String toString() {
        String obj = this.f120263a.toString();
        String obj2 = this.f120264b.toString();
        return "Pair{left=" + obj + ", right=" + obj2 + "}";
    }
}
