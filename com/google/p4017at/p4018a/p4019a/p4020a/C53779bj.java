package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.bj */
/* compiled from: PG */
public final class C53779bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53779bj f141156d;

    /* renamed from: e */
    private static volatile C63010eb f141157e;

    /* renamed from: a */
    public int f141158a;

    /* renamed from: b */
    public C53789bt f141159b;

    /* renamed from: c */
    public int f141160c;

    static {
        C53779bj bjVar = new C53779bj();
        f141156d = bjVar;
        C62942bv.registerDefaultInstance(C53779bj.class, bjVar);
    }

    private C53779bj() {
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
                return newMessageInfo(f141156d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C53777bh.f141155a});
            case 3:
                return new C53779bj();
            case 4:
                return new C53776bg();
            case 5:
                return f141156d;
            case 6:
                C63010eb ebVar = f141157e;
                if (ebVar == null) {
                    synchronized (C53779bj.class) {
                        ebVar = f141157e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141156d);
                            f141157e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
