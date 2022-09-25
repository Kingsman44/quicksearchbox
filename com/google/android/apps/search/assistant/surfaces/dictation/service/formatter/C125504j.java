package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71003bc;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.j */
/* compiled from: PG */
public final class C125504j extends C125510p {

    /* renamed from: a */
    public final C125065at f346083a;

    /* renamed from: b */
    public final C125065at f346084b;

    /* renamed from: c */
    private final C125513s f346085c;

    /* renamed from: d */
    private final C71003bc f346086d;

    public C125504j(C125065at atVar, C125065at atVar2, C125513s sVar, C71003bc bcVar) {
        this.f346083a = atVar;
        this.f346084b = atVar2;
        this.f346085c = sVar;
        this.f346086d = bcVar;
    }

    /* renamed from: a */
    public final C125065at mo106995a() {
        return this.f346084b;
    }

    /* renamed from: b */
    public final C125065at mo106996b() {
        return this.f346083a;
    }

    /* renamed from: c */
    public final C125513s mo106997c() {
        return this.f346085c;
    }

    /* renamed from: d */
    public final C71003bc mo106998d() {
        return this.f346086d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C125510p) {
            C125510p pVar = (C125510p) obj;
            return this.f346083a.equals(pVar.mo106996b()) && this.f346084b.equals(pVar.mo106995a()) && this.f346085c.equals(pVar.mo106997c()) && this.f346086d.equals(pVar.mo106998d());
        }
    }

    public final int hashCode() {
        return ((((((this.f346083a.hashCode() ^ 1000003) * 1000003) ^ this.f346084b.hashCode()) * 1000003) ^ this.f346085c.hashCode()) * 1000003) ^ this.f346086d.hashCode();
    }

    public final String toString() {
        String obj = this.f346083a.toString();
        String obj2 = this.f346084b.toString();
        String obj3 = this.f346085c.toString();
        String obj4 = this.f346086d.toString();
        return "FormattedCommit{textToCommit=" + obj + ", composingText=" + obj2 + ", newState=" + obj3 + ", formattingLog=" + obj4 + "}";
    }
}
