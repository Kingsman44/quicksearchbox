package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.n */
/* compiled from: PG */
final class C79316n extends C79298f {

    /* renamed from: a */
    public final String f217814a;

    /* renamed from: b */
    public final C58485gu f217815b;

    public C79316n(String str, C58485gu guVar) {
        if (str != null) {
            this.f217814a = str;
            if (guVar != null) {
                this.f217815b = guVar;
                return;
            }
            throw new NullPointerException("Null annotations");
        }
        throw new NullPointerException("Null text");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79298f) {
            C79298f fVar = (C79298f) obj;
            return this.f217814a.equals(fVar.mo73864j()) && C58597ky.m90218i(this.f217815b, fVar.mo73862h());
        }
    }

    /* renamed from: h */
    public final C58485gu mo73862h() {
        return this.f217815b;
    }

    public final int hashCode() {
        return ((this.f217814a.hashCode() ^ 1000003) * 1000003) ^ this.f217815b.hashCode();
    }

    /* renamed from: j */
    public final String mo73864j() {
        return this.f217814a;
    }

    public final String toString() {
        String str = this.f217814a;
        String obj = this.f217815b.toString();
        return "AnnotatedString{text=" + str + ", annotations=" + obj + "}";
    }
}
