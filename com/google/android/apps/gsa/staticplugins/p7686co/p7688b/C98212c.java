package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.android.apps.gsa.store.C118316g;
import com.google.android.apps.gsa.store.C118329t;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.c */
/* compiled from: PG */
final class C98212c extends C98210bk {

    /* renamed from: a */
    public final C118329t f274233a;

    /* renamed from: b */
    public final C118316g f274234b;

    public C98212c(C118329t tVar, C118316g gVar) {
        if (tVar != null) {
            this.f274233a = tVar;
            if (gVar != null) {
                this.f274234b = gVar;
                return;
            }
            throw new NullPointerException("Null deleteOperation");
        }
        throw new NullPointerException("Null insertOperation");
    }

    /* renamed from: a */
    public final C118316g mo91021a() {
        return this.f274234b;
    }

    /* renamed from: b */
    public final C118329t mo91022b() {
        return this.f274233a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C98210bk) {
            C98210bk bkVar = (C98210bk) obj;
            return this.f274233a.equals(bkVar.mo91022b()) && this.f274234b.equals(bkVar.mo91021a());
        }
    }

    public final int hashCode() {
        return ((this.f274233a.hashCode() ^ 1000003) * 1000003) ^ this.f274234b.hashCode();
    }

    public final String toString() {
        String obj = this.f274233a.toString();
        String obj2 = this.f274234b.toString();
        return "PopulatedOperations{insertOperation=" + obj + ", deleteOperation=" + obj2 + "}";
    }
}
