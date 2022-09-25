package com.google.android.libraries.onegoogle.accountmenu.p2356d;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.d.i */
/* compiled from: PG */
final class C30468i extends C30463d {

    /* renamed from: a */
    private final String f82312a;

    /* renamed from: b */
    private final C58833ax f82313b;

    public C30468i(String str, C58833ax axVar) {
        if (str != null) {
            this.f82312a = str;
            this.f82313b = axVar;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: b */
    public final C58833ax mo36059b() {
        return this.f82313b;
    }

    /* renamed from: c */
    public final String mo36060c() {
        return this.f82312a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30463d) {
            C30463d dVar = (C30463d) obj;
            return this.f82312a.equals(dVar.mo36060c()) && this.f82313b.equals(dVar.mo36059b());
        }
    }

    public final int hashCode() {
        return ((this.f82312a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String str = this.f82312a;
        return "TrailingTextContent{text=" + str + ", contentDescription=Optional.absent()}";
    }
}
