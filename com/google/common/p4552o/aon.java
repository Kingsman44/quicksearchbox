package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aon */
/* compiled from: PG */
public final class aon extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final aon f159495e;

    /* renamed from: f */
    private static volatile C63010eb f159496f;

    /* renamed from: a */
    public int f159497a;

    /* renamed from: b */
    public boolean f159498b;

    /* renamed from: c */
    public boolean f159499c;

    /* renamed from: d */
    public boolean f159500d;

    static {
        aon aon = new aon();
        f159495e = aon;
        C62942bv.registerDefaultInstance(aon.class, aon);
    }

    private aon() {
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
                return newMessageInfo(f159495e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new aon();
            case 4:
                return new aom();
            case 5:
                return f159495e;
            case 6:
                C63010eb ebVar = f159496f;
                if (ebVar == null) {
                    synchronized (aon.class) {
                        ebVar = f159496f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159495e);
                            f159496f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
