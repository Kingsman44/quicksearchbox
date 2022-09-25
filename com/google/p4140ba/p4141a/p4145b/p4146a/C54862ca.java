package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.ca */
/* compiled from: PG */
public final class C54862ca extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54862ca f144103e;

    /* renamed from: f */
    private static volatile C63010eb f144104f;

    /* renamed from: a */
    public int f144105a;

    /* renamed from: b */
    public float f144106b = 0.5f;

    /* renamed from: c */
    public C54859by f144107c;

    /* renamed from: d */
    public C54874cm f144108d;

    static {
        C54862ca caVar = new C54862ca();
        f144103e = caVar;
        C62942bv.registerDefaultInstance(C54862ca.class, caVar);
    }

    private C54862ca() {
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
                return newMessageInfo(f144103e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54862ca();
            case 4:
                return new C54860bz();
            case 5:
                return f144103e;
            case 6:
                C63010eb ebVar = f144104f;
                if (ebVar == null) {
                    synchronized (C54862ca.class) {
                        ebVar = f144104f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144103e);
                            f144104f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
