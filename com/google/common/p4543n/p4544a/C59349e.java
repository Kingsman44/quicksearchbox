package com.google.common.p4543n.p4544a;

/* renamed from: com.google.common.n.a.e */
/* compiled from: PG */
final class C59349e extends C59356l {

    /* renamed from: a */
    final /* synthetic */ C59356l f157547a;

    public C59349e(C59356l lVar) {
        this.f157547a = lVar;
    }

    /* renamed from: lG */
    public final C59354j mo56871lG(String str) {
        C59354j a = ((C59353i) this.f157547a).mo56869a(str, str.length());
        if (a == null) {
            return null;
        }
        String str2 = a.f157551a;
        int length = str2.length() - a.f157553c;
        return C59354j.m92245a(str2, str2.length() - length, length);
    }

    public final String toString() {
        return "after(last('.'))";
    }
}
