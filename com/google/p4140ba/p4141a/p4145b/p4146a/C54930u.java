package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.u */
/* compiled from: PG */
public final class C54930u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54930u f144407e;

    /* renamed from: f */
    private static volatile C63010eb f144408f;

    /* renamed from: a */
    public int f144409a;

    /* renamed from: b */
    public C54924o f144410b;

    /* renamed from: c */
    public C54927r f144411c;

    /* renamed from: d */
    public C54929t f144412d;

    static {
        C54930u uVar = new C54930u();
        f144407e = uVar;
        C62942bv.registerDefaultInstance(C54930u.class, uVar);
    }

    private C54930u() {
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
                return newMessageInfo(f144407e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54930u();
            case 4:
                return new C54925p();
            case 5:
                return f144407e;
            case 6:
                C63010eb ebVar = f144408f;
                if (ebVar == null) {
                    synchronized (C54930u.class) {
                        ebVar = f144408f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144407e);
                            f144408f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
