package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.g */
/* compiled from: PG */
final class C103278g extends C103245bk {

    /* renamed from: a */
    private final C58485gu f288071a;

    /* renamed from: b */
    private final int f288072b;

    /* renamed from: c */
    private final boolean f288073c;

    public C103278g(C58485gu guVar, int i, boolean z) {
        if (guVar != null) {
            this.f288071a = guVar;
            this.f288072b = i;
            this.f288073c = z;
            return;
        }
        throw new NullPointerException("Null dataChunks");
    }

    /* renamed from: a */
    public final int mo93726a() {
        return this.f288072b;
    }

    /* renamed from: b */
    public final C58485gu mo93727b() {
        return this.f288071a;
    }

    /* renamed from: c */
    public final boolean mo93728c() {
        return this.f288073c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103245bk) {
            C103245bk bkVar = (C103245bk) obj;
            return C58597ky.m90218i(this.f288071a, bkVar.mo93727b()) && this.f288072b == bkVar.mo93726a() && this.f288073c == bkVar.mo93728c();
        }
    }

    public final int hashCode() {
        return ((((this.f288071a.hashCode() ^ 1000003) * 1000003) ^ this.f288072b) * 1000003) ^ (true != this.f288073c ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f288071a.toString();
        int i = this.f288072b;
        boolean z = this.f288073c;
        return "IcingQueryResultsCollector{dataChunks=" + obj + ", resultsCount=" + i + ", shouldContinue=" + z + "}";
    }
}
