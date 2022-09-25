package com.google.common.p4526f.p4531c;

import java.util.Comparator;

/* renamed from: com.google.common.f.c.e */
/* compiled from: PG */
final class C59057e implements Comparator {
    public final int compare(Object obj, Object obj2) {
        C59063k a = C59063k.m91324a(obj);
        C59063k a2 = C59063k.m91324a(obj2);
        if (a != a2) {
            return a.compareTo(a2);
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (ordinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (ordinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (ordinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
