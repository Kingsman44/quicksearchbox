package com.google.android.libraries.home.coreui.devicetile.model;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.model.y */
/* compiled from: PG */
public final class C23750y extends C23730e {

    /* renamed from: a */
    private final String f65099a;

    public C23750y(String str) {
        C69664n.m101061g(str, "pin");
        this.f65099a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C23750y) && C69664n.m101066l(this.f65099a, ((C23750y) obj).f65099a);
    }

    public final int hashCode() {
        return this.f65099a.hashCode();
    }

    public final String toString() {
        String str = this.f65099a;
        return "PinChallengeValue(pin=" + str + ")";
    }
}
