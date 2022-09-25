package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.f */
/* compiled from: PG */
final class C16690f extends C16679al {

    /* renamed from: a */
    private final C50936ah f48852a;

    /* renamed from: b */
    private final String f48853b;

    public C16690f(C50936ah ahVar, String str) {
        if (ahVar != null) {
            this.f48852a = ahVar;
            if (str != null) {
                this.f48853b = str;
                return;
            }
            throw new NullPointerException("Null buttonId");
        }
        throw new NullPointerException("Null button");
    }

    /* renamed from: a */
    public final C50936ah mo22964a() {
        return this.f48852a;
    }

    /* renamed from: b */
    public final String mo22965b() {
        return this.f48853b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16679al) {
            C16679al alVar = (C16679al) obj;
            return this.f48852a.equals(alVar.mo22964a()) && this.f48853b.equals(alVar.mo22965b());
        }
    }

    public final int hashCode() {
        return ((this.f48852a.hashCode() ^ 1000003) * 1000003) ^ this.f48853b.hashCode();
    }

    public final String toString() {
        String obj = this.f48852a.toString();
        String str = this.f48853b;
        return "ButtonWithId{button=" + obj + ", buttonId=" + str + "}";
    }
}
