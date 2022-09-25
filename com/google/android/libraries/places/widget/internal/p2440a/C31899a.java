package com.google.android.libraries.places.widget.internal.p2440a;

import com.google.android.gms.tasks.C146024d;

/* renamed from: com.google.android.libraries.places.widget.internal.a.a */
/* compiled from: PG */
final class C31899a extends C31904f {

    /* renamed from: a */
    public final C146024d f85783a;

    /* renamed from: b */
    public final String f85784b;

    public C31899a(C146024d dVar, String str) {
        this.f85783a = dVar;
        if (str != null) {
            this.f85784b = str;
            return;
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final C146024d mo37640a() {
        return this.f85783a;
    }

    /* renamed from: b */
    public final String mo37641b() {
        return this.f85784b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C31904f) {
            C31904f fVar = (C31904f) obj;
            return this.f85783a.equals(fVar.mo37640a()) && this.f85784b.equals(fVar.mo37641b());
        }
    }

    public final int hashCode() {
        return ((this.f85783a.hashCode() ^ 1000003) * 1000003) ^ this.f85784b.hashCode();
    }

    public final String toString() {
        String obj = this.f85783a.toString();
        String str = this.f85784b;
        return "AutocompleteRequest{source=" + obj + ", query=" + str + "}";
    }
}
