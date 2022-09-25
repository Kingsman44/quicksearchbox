package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.a */
/* compiled from: PG */
public final class C128468a {

    /* renamed from: a */
    public final int f353326a;

    /* renamed from: b */
    public final int f353327b;

    public C128468a(int i, int i2) {
        this.f353326a = i;
        this.f353327b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128468a)) {
            return false;
        }
        C128468a aVar = (C128468a) obj;
        return this.f353326a == aVar.f353326a && this.f353327b == aVar.f353327b;
    }

    public final int hashCode() {
        return (this.f353326a * 31) + this.f353327b;
    }

    public final String toString() {
        int i = this.f353326a;
        int i2 = this.f353327b;
        return "DescriptionResources(descriptionId=" + i + ", contentDescriptionId=" + i2 + ")";
    }
}
