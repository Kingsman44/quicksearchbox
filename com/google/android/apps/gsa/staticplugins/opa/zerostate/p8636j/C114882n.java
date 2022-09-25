package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.n */
/* compiled from: PG */
public final class C114882n extends C114892x {

    /* renamed from: a */
    private final String f318739a;

    /* renamed from: b */
    private final int f318740b;

    /* renamed from: c */
    private final int f318741c;

    /* renamed from: d */
    private final C114757k f318742d;

    /* renamed from: e */
    private final int f318743e;

    public C114882n(String str, int i, int i2, int i3, C114757k kVar) {
        if (str != null) {
            this.f318739a = str;
            this.f318743e = i;
            this.f318740b = i2;
            this.f318741c = i3;
            this.f318742d = kVar;
            return;
        }
        throw new NullPointerException("Null deepLinkId");
    }

    /* renamed from: a */
    public final int mo101674a() {
        return this.f318741c;
    }

    /* renamed from: b */
    public final int mo101675b() {
        return this.f318740b;
    }

    /* renamed from: c */
    public final C114757k mo101676c() {
        return this.f318742d;
    }

    /* renamed from: d */
    public final String mo101677d() {
        return this.f318739a;
    }

    /* renamed from: e */
    public final int mo101678e() {
        return this.f318743e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114892x) {
            C114892x xVar = (C114892x) obj;
            return this.f318739a.equals(xVar.mo101677d()) && this.f318743e == xVar.mo101678e() && this.f318740b == xVar.mo101675b() && this.f318741c == xVar.mo101674a() && this.f318742d.equals(xVar.mo101676c());
        }
    }

    public final int hashCode() {
        return ((((((((this.f318739a.hashCode() ^ 1000003) * 1000003) ^ this.f318743e) * 1000003) ^ this.f318740b) * 1000003) ^ this.f318741c) * 1000003) ^ this.f318742d.hashCode();
    }

    public final String toString() {
        String str = this.f318739a;
        String str2 = this.f318743e != 1 ? "CARD" : "SECTION";
        int i = this.f318740b;
        int i2 = this.f318741c;
        String obj = this.f318742d.toString();
        return "TargetInfo{deepLinkId=" + str + ", type=" + str2 + ", sectionIndex=" + i + ", cardIndex=" + i2 + ", sectionController=" + obj + "}";
    }
}
