package com.google.android.libraries.home.coreui.devicetile.p1954a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.a.c */
/* compiled from: PG */
public final class C23641c {

    /* renamed from: a */
    public final boolean f64657a;

    /* renamed from: b */
    public final CharSequence f64658b;

    public C23641c(boolean z, CharSequence charSequence) {
        C69664n.m101061g(charSequence, "actionDescription");
        this.f64657a = z;
        this.f64658b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23641c)) {
            return false;
        }
        C23641c cVar = (C23641c) obj;
        return this.f64657a == cVar.f64657a && C69664n.m101066l(this.f64658b, cVar.f64658b);
    }

    public final int hashCode() {
        return ((this.f64657a ? 1 : 0) * true) + this.f64658b.hashCode();
    }

    public final String toString() {
        boolean z = this.f64657a;
        CharSequence charSequence = this.f64658b;
        return "ControlButton(isChecked=" + z + ", actionDescription=" + charSequence + ")";
    }
}
