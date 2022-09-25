package com.google.android.libraries.search.p2871b.p2899m;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.b.m.c */
/* compiled from: PG */
final class C37289c extends C37292f {

    /* renamed from: a */
    public int f99088a;

    /* renamed from: b */
    private C58485gu f99089b;

    /* renamed from: a */
    public final C37293g mo40833a() {
        int i;
        C58485gu guVar = this.f99089b;
        if (guVar != null && (i = this.f99088a) != 0) {
            return new C37290d(guVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f99089b == null) {
            sb.append(" records");
        }
        if (this.f99088a == 0) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40834b(C58485gu guVar) {
        if (guVar != null) {
            this.f99089b = guVar;
            return;
        }
        throw new NullPointerException("Null records");
    }
}
