package com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12223e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.d.a.a */
/* compiled from: PG */
public final class C13830a extends C13832c {

    /* renamed from: a */
    private final C12223e f42127a;

    public C13830a(C12223e eVar) {
        this.f42127a = eVar;
    }

    /* renamed from: a */
    public final C12223e mo21275a() {
        return this.f42127a;
    }

    /* renamed from: b */
    public final int mo21276b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13840k) {
            C13840k kVar = (C13840k) obj;
            if (kVar.mo21276b() != 1 || !this.f42127a.equals(kVar.mo21275a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f42127a.hashCode();
    }

    public final String toString() {
        String obj = this.f42127a.toString();
        return "FetchRequestParams{hybridTextRequestParams=" + obj + "}";
    }
}
