package com.google.common.p4543n.p4544a;

/* renamed from: com.google.common.n.a.g */
/* compiled from: PG */
final class C59351g extends C59356l {

    /* renamed from: a */
    final /* synthetic */ String f157549a;

    public C59351g(String str) {
        this.f157549a = str;
    }

    /* renamed from: lG */
    public final C59354j mo56871lG(String str) {
        int indexOf = str.indexOf(this.f157549a, 0);
        if (indexOf >= 0) {
            return C59354j.m92246d(str, indexOf, this.f157549a.length());
        }
        return null;
    }

    public final String toString() {
        String str = this.f157549a;
        return "first('" + str + "')";
    }
}
