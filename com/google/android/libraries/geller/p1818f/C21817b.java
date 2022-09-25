package com.google.android.libraries.geller.p1818f;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.f.b */
/* compiled from: PG */
final class C21817b extends C21858h {

    /* renamed from: a */
    private final C65753ak f60196a;

    /* renamed from: b */
    private final C58485gu f60197b;

    /* renamed from: c */
    private final C58485gu f60198c;

    public C21817b(C65753ak akVar, C58485gu guVar, C58485gu guVar2) {
        if (akVar != null) {
            this.f60196a = akVar;
            if (guVar != null) {
                this.f60197b = guVar;
                if (guVar2 != null) {
                    this.f60198c = guVar2;
                    return;
                }
                throw new NullPointerException("Null elementsToDelete");
            }
            throw new NullPointerException("Null elementsToUpdate");
        }
        throw new NullPointerException("Null corpus");
    }

    /* renamed from: a */
    public final C58485gu mo27121a() {
        return this.f60198c;
    }

    /* renamed from: b */
    public final C58485gu mo27122b() {
        return this.f60197b;
    }

    /* renamed from: c */
    public final C65753ak mo27123c() {
        return this.f60196a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21858h) {
            C21858h hVar = (C21858h) obj;
            return this.f60196a.equals(hVar.mo27123c()) && C58597ky.m90218i(this.f60197b, hVar.mo27122b()) && C58597ky.m90218i(this.f60198c, hVar.mo27121a());
        }
    }

    public final int hashCode() {
        return ((((this.f60196a.hashCode() ^ 1000003) * 1000003) ^ this.f60197b.hashCode()) * 1000003) ^ this.f60198c.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f60196a.f178757bE);
        String obj = this.f60197b.toString();
        String obj2 = this.f60198c.toString();
        return "CorpusUploadMutation{corpus=" + num + ", elementsToUpdate=" + obj + ", elementsToDelete=" + obj2 + "}";
    }
}
