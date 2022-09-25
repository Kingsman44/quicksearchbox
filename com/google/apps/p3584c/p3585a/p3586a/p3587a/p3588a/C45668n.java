package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.n */
/* compiled from: PG */
public final class C45668n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45668n f120134b;

    /* renamed from: d */
    private static volatile C63010eb f120135d;

    /* renamed from: a */
    public int f120136a = 1;

    /* renamed from: c */
    private int f120137c;

    static {
        C45668n nVar = new C45668n();
        f120134b = nVar;
        C62942bv.registerDefaultInstance(C45668n.class, nVar);
    }

    private C45668n() {
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
                return newMessageInfo(f120134b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0003", new Object[]{C45240c.f118157a, "a", C45665k.f120133a});
            case 3:
                return new C45668n();
            case 4:
                return new C45667m();
            case 5:
                return f120134b;
            case 6:
                C63010eb ebVar = f120135d;
                if (ebVar == null) {
                    synchronized (C45668n.class) {
                        ebVar = f120135d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120134b);
                            f120135d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
