package com.google.common.p4522b;

import com.google.common.base.C58839bc;
import com.google.common.base.C58846bj;
import java.util.Collection;

/* renamed from: com.google.common.b.cr */
/* compiled from: PG */
public final class C58374cr {
    /* renamed from: a */
    static StringBuilder m89409a(int i) {
        C58371co.m89408c(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824));
    }

    /* renamed from: b */
    public static Collection m89410b(Collection collection, C58839bc bcVar) {
        if (collection instanceof C58372cp) {
            C58372cp cpVar = (C58372cp) collection;
            return new C58372cp(cpVar.f155948a, C58846bj.m90899a(cpVar.f155949b, bcVar));
        }
        collection.getClass();
        bcVar.getClass();
        return new C58372cp(collection, bcVar);
    }

    /* renamed from: c */
    public static boolean m89411c(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    static boolean m89412d(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: e */
    static boolean m89413e(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
