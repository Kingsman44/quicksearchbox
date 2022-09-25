package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.f */
/* compiled from: PG */
final class C27889f extends C27855al {

    /* renamed from: a */
    private final boolean f76000a;

    /* renamed from: b */
    private final C58485gu f76001b;

    public C27889f(boolean z, C58485gu guVar) {
        this.f76000a = z;
        this.f76001b = guVar;
    }

    /* renamed from: a */
    public final C58485gu mo33339a() {
        return this.f76001b;
    }

    /* renamed from: b */
    public final boolean mo33340b() {
        return this.f76000a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27855al) {
            C27855al alVar = (C27855al) obj;
            return this.f76000a == alVar.mo33340b() && C58597ky.m90218i(this.f76001b, alVar.mo33339a());
        }
    }

    public final int hashCode() {
        return (((true != this.f76000a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f76001b.hashCode();
    }

    public final String toString() {
        boolean z = this.f76000a;
        String obj = this.f76001b.toString();
        return "ContextCascadePreferences{requiresPreloading=" + z + ", cascadesOrderedByPreference=" + obj + "}";
    }
}
