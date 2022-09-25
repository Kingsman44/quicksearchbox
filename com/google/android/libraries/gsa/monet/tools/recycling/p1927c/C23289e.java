package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.e */
/* compiled from: PG */
public final class C23289e {

    /* renamed from: a */
    public final C23290f f63761a;

    /* renamed from: b */
    public final String f63762b;

    /* renamed from: c */
    public C23293i f63763c;

    public C23289e(C23290f fVar, String str) {
        this.f63761a = fVar;
        this.f63762b = str;
    }

    /* renamed from: a */
    public final int mo28767a() {
        C23290f fVar = this.f63761a;
        if (fVar == null) {
            return 1;
        }
        int i = 0;
        for (C23289e a : fVar.f63764D) {
            i += a.mo28767a();
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23289e)) {
            return false;
        }
        return ((C23289e) obj).f63762b.equals(this.f63762b);
    }

    public final int hashCode() {
        return this.f63762b.hashCode();
    }
}
