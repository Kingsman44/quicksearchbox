package com.google.common.p4543n.p4544a;

/* renamed from: com.google.common.n.a.d */
/* compiled from: PG */
final class C59348d extends C59353i {
    /* renamed from: a */
    public final C59354j mo56869a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(46, i - 1);
        if (lastIndexOf >= 0) {
            return C59354j.m92245a(str, lastIndexOf, 1);
        }
        return null;
    }

    public final String toString() {
        return "last('.')";
    }
}
