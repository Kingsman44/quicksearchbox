package com.google.apps.p3589d.p3599j;

import com.google.apps.p3589d.p3592c.C45731g;
import com.google.apps.p3589d.p3593d.C45747f;

/* renamed from: com.google.apps.d.j.b */
/* compiled from: PG */
final class C45911b extends C45907ae {

    /* renamed from: a */
    public final C45916g f120691a;

    /* renamed from: b */
    public final C45731g f120692b;

    /* renamed from: c */
    private final C45747f f120693c;

    public C45911b(C45916g gVar, C45731g gVar2, C45747f fVar) {
        this.f120691a = gVar;
        this.f120692b = gVar2;
        this.f120693c = fVar;
    }

    /* renamed from: a */
    public final C45731g mo50026a() {
        return this.f120692b;
    }

    /* renamed from: b */
    public final C45747f mo50027b() {
        return this.f120693c;
    }

    /* renamed from: c */
    public final C45916g mo50028c() {
        return this.f120691a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45907ae) {
            C45907ae aeVar = (C45907ae) obj;
            return this.f120691a.equals(aeVar.mo50028c()) && this.f120692b.equals(aeVar.mo50026a()) && this.f120693c.equals(aeVar.mo50027b());
        }
    }

    public final int hashCode() {
        return ((((this.f120691a.hashCode() ^ 1000003) * 1000003) ^ this.f120692b.hashCode()) * 1000003) ^ this.f120693c.hashCode();
    }

    public final String toString() {
        String obj = this.f120691a.toString();
        String obj2 = this.f120692b.toString();
        String obj3 = this.f120693c.toString();
        return "DelimitedParseResult{fullParseResult=" + obj + ", content=" + obj2 + ", delimiters=" + obj3 + "}";
    }
}
