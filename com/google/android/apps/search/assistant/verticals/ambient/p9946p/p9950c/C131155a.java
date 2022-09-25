package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9950c;

import com.google.android.libraries.mdi.download.C28746bx;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.c.a */
/* compiled from: PG */
public final class C131155a extends C131160f {

    /* renamed from: a */
    public final String f358667a;

    /* renamed from: b */
    public final C28746bx f358668b;

    public C131155a(String str, C28746bx bxVar) {
        if (str != null) {
            this.f358667a = str;
            if (bxVar != null) {
                this.f358668b = bxVar;
                return;
            }
            throw new NullPointerException("Null populator");
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final C28746bx mo110099a() {
        return this.f358668b;
    }

    /* renamed from: b */
    public final String mo110100b() {
        return this.f358667a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131160f) {
            C131160f fVar = (C131160f) obj;
            return this.f358667a.equals(fVar.mo110100b()) && this.f358668b.equals(fVar.mo110099a());
        }
    }

    public final int hashCode() {
        return ((this.f358667a.hashCode() ^ 1000003) * 1000003) ^ this.f358668b.hashCode();
    }

    public final String toString() {
        String str = this.f358667a;
        String obj = this.f358668b.toString();
        return "NamedPopulator{name=" + str + ", populator=" + obj + "}";
    }
}
