package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qp */
/* compiled from: PG */
final class C7233qp {

    /* renamed from: a */
    public final String f23663a;

    /* renamed from: b */
    public final boolean f23664b;

    /* renamed from: c */
    public final boolean f23665c;

    public C7233qp(String str, boolean z, boolean z2) {
        this.f23663a = str;
        this.f23664b = z;
        this.f23665c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C7233qp.class) {
            C7233qp qpVar = (C7233qp) obj;
            return TextUtils.equals(this.f23663a, qpVar.f23663a) && this.f23664b == qpVar.f23664b && this.f23665c == qpVar.f23665c;
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f23663a.hashCode() + 31) * 31) + (true != this.f23664b ? 1237 : 1231)) * 31;
        if (true == this.f23665c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
