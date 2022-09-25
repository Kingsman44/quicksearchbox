package com.google.lens.p4708k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62205ar;
import com.google.lens.p4707j.C62493dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.h */
/* compiled from: PG */
public final class C62600h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62600h f169012d;

    /* renamed from: e */
    private static volatile C63010eb f169013e;

    /* renamed from: a */
    public int f169014a;

    /* renamed from: b */
    public C62493dp f169015b;

    /* renamed from: c */
    public C62205ar f169016c;

    static {
        C62600h hVar = new C62600h();
        f169012d = hVar;
        C62942bv.registerDefaultInstance(C62600h.class, hVar);
    }

    private C62600h() {
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
                return newMessageInfo(f169012d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62600h();
            case 4:
                return new C62599g();
            case 5:
                return f169012d;
            case 6:
                C63010eb ebVar = f169013e;
                if (ebVar == null) {
                    synchronized (C62600h.class) {
                        ebVar = f169013e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169012d);
                            f169013e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
