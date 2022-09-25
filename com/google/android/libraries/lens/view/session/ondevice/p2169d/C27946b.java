package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.b */
/* compiled from: PG */
public final class C27946b extends C27966v {

    /* renamed from: a */
    public final C56244ay f76101a;

    /* renamed from: b */
    public final C58485gu f76102b;

    public C27946b(C56244ay ayVar, C58485gu guVar) {
        this.f76101a = ayVar;
        if (guVar != null) {
            this.f76102b = guVar;
            return;
        }
        throw new NullPointerException("Null paragraphs");
    }

    /* renamed from: a */
    public final C58485gu mo33418a() {
        return this.f76102b;
    }

    /* renamed from: b */
    public final C56244ay mo33419b() {
        return this.f76101a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27966v) {
            C27966v vVar = (C27966v) obj;
            return this.f76101a.equals(vVar.mo33419b()) && C58597ky.m90218i(this.f76102b, vVar.mo33418a());
        }
    }

    public final int hashCode() {
        return ((this.f76101a.hashCode() ^ 1000003) * 1000003) ^ this.f76102b.hashCode();
    }

    public final String toString() {
        String obj = this.f76101a.toString();
        String obj2 = this.f76102b.toString();
        return "TranslationRequest{requestId=" + obj + ", paragraphs=" + obj2 + "}";
    }
}
