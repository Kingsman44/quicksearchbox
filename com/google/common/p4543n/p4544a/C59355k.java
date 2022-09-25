package com.google.common.p4543n.p4544a;

/* renamed from: com.google.common.n.a.k */
/* compiled from: PG */
public final class C59355k extends C59356l {

    /* renamed from: a */
    final /* synthetic */ C59356l f157555a;

    public C59355k(C59356l lVar) {
        this.f157555a = lVar;
    }

    /* renamed from: lG */
    public final C59354j mo56871lG(String str) {
        C59354j lG = this.f157555a.mo56871lG(str);
        if (lG == null) {
            return null;
        }
        if (lG.f157553c == lG.f157551a.length()) {
            return lG;
        }
        String str2 = lG.f157551a;
        int length = str2.length() - lG.f157552b;
        return C59354j.m92245a(str2, str2.length() - length, length);
    }

    public final String toString() {
        return this.f157555a.toString().concat(".toEnd()");
    }
}
