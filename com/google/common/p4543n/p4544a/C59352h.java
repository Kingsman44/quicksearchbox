package com.google.common.p4543n.p4544a;

/* renamed from: com.google.common.n.a.h */
/* compiled from: PG */
final class C59352h extends C59356l {

    /* renamed from: a */
    final /* synthetic */ char f157550a;

    public C59352h(char c) {
        this.f157550a = c;
    }

    /* renamed from: lG */
    public final C59354j mo56871lG(String str) {
        int indexOf = str.indexOf(this.f157550a, 0);
        if (indexOf >= 0) {
            return C59354j.m92246d(str, indexOf, 1);
        }
        return null;
    }

    public final String toString() {
        char c = this.f157550a;
        return "first('" + c + "')";
    }
}
