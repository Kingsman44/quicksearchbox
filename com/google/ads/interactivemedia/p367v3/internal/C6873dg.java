package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dg */
/* compiled from: PG */
public final class C6873dg {

    /* renamed from: a */
    public final String f21857a;

    /* renamed from: b */
    public final C6872df f21858b;

    /* renamed from: c */
    public final C6871de f21859c;

    /* renamed from: d */
    public final C6874dh f21860d;

    /* renamed from: e */
    public final C6869dc f21861e;

    public /* synthetic */ C6873dg(String str, C6869dc dcVar, C6872df dfVar, C6871de deVar, C6874dh dhVar) {
        this.f21857a = str;
        this.f21858b = dfVar;
        this.f21859c = deVar;
        this.f21860d = dhVar;
        this.f21861e = dcVar;
    }

    /* renamed from: a */
    public final C6868db mo15665a() {
        return new C6868db(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6873dg)) {
            return false;
        }
        C6873dg dgVar = (C6873dg) obj;
        return aeu.m18533c(this.f21857a, dgVar.f21857a) && this.f21861e.equals(dgVar.f21861e) && aeu.m18533c(this.f21858b, dgVar.f21858b) && aeu.m18533c(this.f21859c, dgVar.f21859c) && aeu.m18533c(this.f21860d, dgVar.f21860d);
    }

    public final int hashCode() {
        int hashCode = this.f21857a.hashCode() * 31;
        C6872df dfVar = this.f21858b;
        return (((((hashCode + (dfVar != null ? dfVar.hashCode() : 0)) * 31) + this.f21859c.hashCode()) * 31) + this.f21861e.hashCode()) * 31;
    }
}
