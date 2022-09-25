package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.assistant.p3897e.p3921j.C51697ay;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.m */
/* compiled from: PG */
final class C102590m extends C102548aj {

    /* renamed from: a */
    public C58833ax f286339a;

    /* renamed from: b */
    public C58833ax f286340b;

    /* renamed from: c */
    private C58485gu f286341c;

    /* renamed from: d */
    private C51697ay f286342d;

    public C102590m() {
        C58836b bVar = C58836b.f156633a;
        this.f286339a = bVar;
        this.f286340b = bVar;
    }

    /* renamed from: a */
    public final C102549ak mo93320a() {
        C51697ay ayVar;
        C58485gu guVar = this.f286341c;
        if (guVar != null && (ayVar = this.f286342d) != null) {
            return new C102591n(guVar, ayVar, this.f286339a, this.f286340b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f286341c == null) {
            sb.append(" customClientOps");
        }
        if (this.f286342d == null) {
            sb.append(" audioEnvironment");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo93321b(C51697ay ayVar) {
        if (ayVar != null) {
            this.f286342d = ayVar;
            return;
        }
        throw new NullPointerException("Null audioEnvironment");
    }

    /* renamed from: c */
    public final void mo93322c(C58485gu guVar) {
        if (guVar != null) {
            this.f286341c = guVar;
            return;
        }
        throw new NullPointerException("Null customClientOps");
    }
}
