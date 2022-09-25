package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4799ag.p4803c.p4804a.p4805a.p4806a.p4807a.C63165a;

/* renamed from: com.google.common.o.i.bz */
/* compiled from: PG */
public final class C59917bz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59917bz f161945d;

    /* renamed from: e */
    private static volatile C63010eb f161946e;

    /* renamed from: a */
    public int f161947a;

    /* renamed from: b */
    public C59891b f161948b;

    /* renamed from: c */
    public int f161949c;

    static {
        C59917bz bzVar = new C59917bz();
        f161945d = bzVar;
        C62942bv.registerDefaultInstance(C59917bz.class, bzVar);
    }

    private C59917bz() {
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
                return newMessageInfo(f161945d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C63165a.f170560a});
            case 3:
                return new C59917bz();
            case 4:
                return new C59916by();
            case 5:
                return f161945d;
            case 6:
                C63010eb ebVar = f161946e;
                if (ebVar == null) {
                    synchronized (C59917bz.class) {
                        ebVar = f161946e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161945d);
                            f161946e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
