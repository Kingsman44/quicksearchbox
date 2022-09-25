package com.google.android.libraries.p10915aa.p10920b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.aa.b.v */
/* compiled from: PG */
public final class C146699v extends C146677ay {

    /* renamed from: a */
    private final C146679b f396142a;

    /* renamed from: b */
    private final C58485gu f396143b;

    public C146699v(C146679b bVar, C58485gu guVar) {
        this.f396142a = bVar;
        this.f396143b = guVar;
    }

    /* renamed from: a */
    public final C146679b mo123457a() {
        return this.f396142a;
    }

    /* renamed from: b */
    public final C58485gu mo123458b() {
        return this.f396143b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146677ay) {
            C146677ay ayVar = (C146677ay) obj;
            return this.f396142a.equals(ayVar.mo123457a()) && C58597ky.m90218i(this.f396143b, ayVar.mo123458b());
        }
    }

    public final int hashCode() {
        return ((this.f396142a.f396111a.hashCode() ^ 1000003) * 1000003) ^ this.f396143b.hashCode();
    }

    public final String toString() {
        String obj = this.f396142a.toString();
        String valueOf = String.valueOf(this.f396143b);
        return "InventoryExtractedFromNode{matchingNode=" + obj + ", extractedInventoryLabels=" + valueOf + "}";
    }
}
