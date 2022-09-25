package com.google.p395al.p408c.p414c.p416b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.ae */
/* compiled from: PG */
public final class C8462ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8462ae f29386b;

    /* renamed from: d */
    private static volatile C63010eb f29387d;

    /* renamed from: a */
    public C8464ag f29388a;

    /* renamed from: c */
    private int f29389c;

    static {
        C8462ae aeVar = new C8462ae();
        f29386b = aeVar;
        C62942bv.registerDefaultInstance(C8462ae.class, aeVar);
    }

    private C8462ae() {
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
                return newMessageInfo(f29386b, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0006", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8462ae();
            case 4:
                return new C8461ad();
            case 5:
                return f29386b;
            case 6:
                C63010eb ebVar = f29387d;
                if (ebVar == null) {
                    synchronized (C8462ae.class) {
                        ebVar = f29387d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29386b);
                            f29387d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
