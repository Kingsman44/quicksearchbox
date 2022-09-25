package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.bn */
/* compiled from: PG */
public final class C48522bn extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48522bn f125342f;

    /* renamed from: g */
    private static volatile C63010eb f125343g;

    /* renamed from: a */
    public int f125344a;

    /* renamed from: b */
    public int f125345b;

    /* renamed from: c */
    public int f125346c;

    /* renamed from: d */
    public int f125347d;

    /* renamed from: e */
    public int f125348e;

    static {
        C48522bn bnVar = new C48522bn();
        f125342f = bnVar;
        C62942bv.registerDefaultInstance(C48522bn.class, bnVar);
    }

    private C48522bn() {
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
                return newMessageInfo(f125342f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48522bn();
            case 4:
                return new C48521bm();
            case 5:
                return f125342f;
            case 6:
                C63010eb ebVar = f125343g;
                if (ebVar == null) {
                    synchronized (C48522bn.class) {
                        ebVar = f125343g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125342f);
                            f125343g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
