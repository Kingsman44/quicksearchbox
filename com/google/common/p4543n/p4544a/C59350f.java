package com.google.common.p4543n.p4544a;

/* renamed from: com.google.common.n.a.f */
/* compiled from: PG */
final class C59350f extends C59356l {

    /* renamed from: a */
    final /* synthetic */ C59356l f157548a;

    public C59350f(C59356l lVar) {
        this.f157548a = lVar;
    }

    /* renamed from: lG */
    public final C59354j mo56871lG(String str) {
        C59354j lG = this.f157548a.mo56871lG(str);
        if (lG == null) {
            return null;
        }
        return new C59354j(str, 0, lG.f157553c, lG.f157554d);
    }

    public final String toString() {
        String obj = this.f157548a.toString();
        return "upToIncluding(" + obj + ")";
    }
}
