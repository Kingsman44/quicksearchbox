package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aay */
/* compiled from: PG */
public final class aay extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aay f158169d;

    /* renamed from: e */
    private static volatile C63010eb f158170e;

    /* renamed from: a */
    public int f158171a;

    /* renamed from: b */
    public long f158172b;

    /* renamed from: c */
    public long f158173c;

    static {
        aay aay = new aay();
        f158169d = aay;
        C62942bv.registerDefaultInstance(aay.class, aay);
    }

    private aay() {
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
                return newMessageInfo(f158169d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aay();
            case 4:
                return new aax();
            case 5:
                return f158169d;
            case 6:
                C63010eb ebVar = f158170e;
                if (ebVar == null) {
                    synchronized (aay.class) {
                        ebVar = f158170e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158169d);
                            f158170e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
