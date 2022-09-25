package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14242bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.a */
/* compiled from: PG */
final class C14750a extends C14773s {

    /* renamed from: a */
    private final C14242bz f44522a;

    /* renamed from: b */
    private final int f44523b;

    /* renamed from: c */
    private final int f44524c;

    public C14750a(C14242bz bzVar, int i, int i2) {
        if (bzVar != null) {
            this.f44522a = bzVar;
            this.f44523b = i;
            this.f44524c = i2;
            return;
        }
        throw new NullPointerException("Null icon");
    }

    /* renamed from: a */
    public final int mo21719a() {
        return this.f44523b;
    }

    /* renamed from: b */
    public final C14242bz mo21720b() {
        return this.f44522a;
    }

    /* renamed from: c */
    public final int mo21721c() {
        return this.f44524c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14773s) {
            C14773s sVar = (C14773s) obj;
            return this.f44522a.equals(sVar.mo21720b()) && this.f44523b == sVar.mo21719a() && this.f44524c == sVar.mo21721c();
        }
    }

    public final int hashCode() {
        return ((((this.f44522a.hashCode() ^ 1000003) * 1000003) ^ this.f44523b) * 1000003) ^ this.f44524c;
    }

    public final String toString() {
        String num = Integer.toString(this.f44522a.getNumber());
        int i = this.f44523b;
        int i2 = this.f44524c;
        String str = i2 != 1 ? i2 != 2 ? "RIGHT_SLOT" : "CENTER_SLOT" : "LEFT_SLOT";
        return "IconMetadata{icon=" + num + ", priority=" + i + ", slot=" + str + "}";
    }
}
