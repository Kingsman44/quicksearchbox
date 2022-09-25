package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import dagger.p5295b.C68282c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.al */
/* compiled from: PG */
final class C103476al extends C103518bw {

    /* renamed from: a */
    private final C68282c f288352a;

    /* renamed from: b */
    private final C58485gu f288353b;

    public C103476al(C68282c cVar, C58485gu guVar) {
        if (cVar != null) {
            this.f288352a = cVar;
            if (guVar != null) {
                this.f288353b = guVar;
                return;
            }
            throw new NullPointerException("Null authTokensUsed");
        }
        throw new NullPointerException("Null responseSource");
    }

    /* renamed from: a */
    public final C58485gu mo93790a() {
        return this.f288353b;
    }

    /* renamed from: b */
    public final C68282c mo93791b() {
        return this.f288352a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103518bw) {
            C103518bw bwVar = (C103518bw) obj;
            return this.f288352a.equals(bwVar.mo93791b()) && C58597ky.m90218i(this.f288353b, bwVar.mo93790a());
        }
    }

    public final int hashCode() {
        return ((this.f288352a.hashCode() ^ 1000003) * 1000003) ^ this.f288353b.hashCode();
    }

    public final String toString() {
        String obj = this.f288352a.toString();
        String obj2 = this.f288353b.toString();
        return "NetworkAttemptResult{responseSource=" + obj + ", authTokensUsed=" + obj2 + "}";
    }
}
