package com.google.android.libraries.gsa.actionusermodel;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.protos.p4985f.p4986a.C64683bj;
import com.google.protos.p4985f.p5001d.C64820b;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.by */
/* compiled from: PG */
public final class C22095by extends C22021a {

    /* renamed from: a */
    private final String f60901a;

    /* renamed from: b */
    private final boolean f60902b;

    /* renamed from: c */
    private final C64683bj f60903c;

    /* renamed from: d */
    private final C64820b f60904d;

    /* renamed from: e */
    private final C58485gu f60905e;

    public C22095by(String str, boolean z, C64683bj bjVar, C64820b bVar, C58485gu guVar) {
        if (str != null) {
            this.f60901a = str;
            this.f60902b = z;
            if (bjVar != null) {
                this.f60903c = bjVar;
                if (bVar != null) {
                    this.f60904d = bVar;
                    if (guVar != null) {
                        this.f60905e = guVar;
                        return;
                    }
                    throw new NullPointerException("Null affinities");
                }
                throw new NullPointerException("Null matchedNameType");
            }
            throw new NullPointerException("Null recognitionAlternateSignals");
        }
        throw new NullPointerException("Null contactName");
    }

    /* renamed from: b */
    public final C58485gu mo27330b() {
        return this.f60905e;
    }

    /* renamed from: c */
    public final C64683bj mo27331c() {
        return this.f60903c;
    }

    /* renamed from: d */
    public final C64820b mo27332d() {
        return this.f60904d;
    }

    /* renamed from: e */
    public final String mo27333e() {
        return this.f60901a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22021a) {
            C22021a aVar = (C22021a) obj;
            return this.f60901a.equals(aVar.mo27333e()) && this.f60902b == aVar.mo27334f() && this.f60903c.equals(aVar.mo27331c()) && this.f60904d.equals(aVar.mo27332d()) && C58597ky.m90218i(this.f60905e, aVar.mo27330b());
        }
    }

    /* renamed from: f */
    public final boolean mo27334f() {
        return this.f60902b;
    }

    public final int hashCode() {
        return ((((((((this.f60901a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f60902b ? 1237 : 1231)) * 1000003) ^ this.f60903c.hashCode()) * 1000003) ^ this.f60904d.hashCode()) * 1000003) ^ this.f60905e.hashCode();
    }

    public final String toString() {
        String str = this.f60901a;
        boolean z = this.f60902b;
        String obj = this.f60903c.toString();
        String num = Integer.toString(this.f60904d.getNumber());
        String obj2 = this.f60905e.toString();
        return "AumContactInfo{contactName=" + str + ", isStarred=" + z + ", recognitionAlternateSignals=" + obj + ", matchedNameType=" + num + ", affinities=" + obj2 + "}";
    }
}
