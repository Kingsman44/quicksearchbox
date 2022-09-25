package com.google.android.libraries.search.p2871b.p2899m;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.b.m.d */
/* compiled from: PG */
final class C37290d extends C37293g {

    /* renamed from: a */
    private final C58485gu f99090a;

    /* renamed from: b */
    private final int f99091b;

    public C37290d(C58485gu guVar, int i) {
        this.f99090a = guVar;
        this.f99091b = i;
    }

    /* renamed from: a */
    public final C58485gu mo40835a() {
        return this.f99090a;
    }

    /* renamed from: b */
    public final int mo40836b() {
        return this.f99091b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37293g) {
            C37293g gVar = (C37293g) obj;
            return C58597ky.m90218i(this.f99090a, gVar.mo40835a()) && this.f99091b == gVar.mo40836b();
        }
    }

    public final int hashCode() {
        return ((this.f99090a.hashCode() ^ 1000003) * 1000003) ^ this.f99091b;
    }

    public final String toString() {
        String obj = this.f99090a.toString();
        String num = Integer.toString(this.f99091b - 1);
        return "FlowRecordsData{records=" + obj + ", status=" + num + "}";
    }
}
