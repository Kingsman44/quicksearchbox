package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.a */
/* compiled from: PG */
final class C131433a extends C131443ac {

    /* renamed from: a */
    private final C58148f f359250a;

    /* renamed from: b */
    private final String f359251b;

    /* renamed from: c */
    private final String f359252c;

    /* renamed from: d */
    private final Instant f359253d;

    public C131433a(C58148f fVar, String str, String str2, Instant instant) {
        this.f359250a = fVar;
        this.f359251b = str;
        if (str2 != null) {
            this.f359252c = str2;
            if (instant != null) {
                this.f359253d = instant;
                return;
            }
            throw new NullPointerException("Null dateModified");
        }
        throw new NullPointerException("Null noteText");
    }

    /* renamed from: a */
    public final C58148f mo110161a() {
        return this.f359250a;
    }

    /* renamed from: b */
    public final Instant mo110162b() {
        return this.f359253d;
    }

    /* renamed from: c */
    public final String mo110163c() {
        return this.f359251b;
    }

    /* renamed from: d */
    public final String mo110164d() {
        return this.f359252c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131443ac) {
            C131443ac acVar = (C131443ac) obj;
            return this.f359250a.equals(acVar.mo110161a()) && this.f359251b.equals(acVar.mo110163c()) && this.f359252c.equals(acVar.mo110164d()) && this.f359253d.equals(acVar.mo110162b());
        }
    }

    public final int hashCode() {
        return ((((((this.f359250a.hashCode() ^ 1000003) * 1000003) ^ this.f359251b.hashCode()) * 1000003) ^ this.f359252c.hashCode()) * 1000003) ^ this.f359253d.hashCode();
    }

    public final String toString() {
        String obj = this.f359250a.toString();
        String str = this.f359251b;
        String str2 = this.f359252c;
        String obj2 = this.f359253d.toString();
        return "KeepShoppingList{thing=" + obj + ", noteName=" + str + ", noteText=" + str2 + ", dateModified=" + obj2 + "}";
    }
}
