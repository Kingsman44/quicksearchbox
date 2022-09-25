package com.google.android.apps.auto.p450a.p451a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.x */
/* compiled from: PG */
public final class C8931x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8931x f30967b;

    /* renamed from: d */
    private static volatile C63010eb f30968d;

    /* renamed from: a */
    public boolean f30969a;

    /* renamed from: c */
    private int f30970c;

    static {
        C8931x xVar = new C8931x();
        f30967b = xVar;
        C62942bv.registerDefaultInstance(C8931x.class, xVar);
    }

    private C8931x() {
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
                return newMessageInfo(f30967b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8931x();
            case 4:
                return new C8930w();
            case 5:
                return f30967b;
            case 6:
                C63010eb ebVar = f30968d;
                if (ebVar == null) {
                    synchronized (C8931x.class) {
                        ebVar = f30968d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30967b);
                            f30968d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
