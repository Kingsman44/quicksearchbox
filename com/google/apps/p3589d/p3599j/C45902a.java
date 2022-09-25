package com.google.apps.p3589d.p3599j;

import com.google.apps.p3589d.p3592c.C45731g;

/* renamed from: com.google.apps.d.j.a */
/* compiled from: PG */
final class C45902a extends C45916g {

    /* renamed from: a */
    public final C45731g f120668a;

    public C45902a(C45731g gVar) {
        this.f120668a = gVar;
    }

    /* renamed from: a */
    public final C45731g mo50019a() {
        return this.f120668a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45916g) {
            return this.f120668a.equals(((C45916g) obj).mo50019a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f120668a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f120668a.toString();
        return "ParseResult{selection=" + obj + "}";
    }
}
