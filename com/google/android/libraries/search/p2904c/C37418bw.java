package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.bw */
/* compiled from: PG */
public final class C37418bw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37418bw f99351d;

    /* renamed from: e */
    private static volatile C63010eb f99352e;

    /* renamed from: a */
    public int f99353a;

    /* renamed from: b */
    public C37514du f99354b;

    /* renamed from: c */
    public int f99355c;

    static {
        C37418bw bwVar = new C37418bw();
        f99351d = bwVar;
        C62942bv.registerDefaultInstance(C37418bw.class, bwVar);
    }

    private C37418bw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f99351d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C37565ef.m66574b()});
            case 3:
                return new C37418bw();
            case 4:
                return new C37417bv();
            case 5:
                return f99351d;
            case 6:
                C63010eb ebVar = f99352e;
                if (ebVar == null) {
                    synchronized (C37418bw.class) {
                        ebVar = f99352e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99351d);
                            f99352e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
