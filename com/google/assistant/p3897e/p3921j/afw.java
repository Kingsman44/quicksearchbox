package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afw */
/* compiled from: PG */
public final class afw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final afw f135019d;

    /* renamed from: e */
    private static volatile C63010eb f135020e;

    /* renamed from: a */
    public int f135021a = 0;

    /* renamed from: b */
    public Object f135022b;

    /* renamed from: c */
    public int f135023c;

    static {
        afw afw = new afw();
        f135019d = afw;
        C62942bv.registerDefaultInstance(afw.class, afw);
    }

    private afw() {
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
                return newMessageInfo(f135019d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, aft.class, afy.class, C51675aga.class, afr.class});
            case 3:
                return new afw();
            case 4:
                return new afu();
            case 5:
                return f135019d;
            case 6:
                C63010eb ebVar = f135020e;
                if (ebVar == null) {
                    synchronized (afw.class) {
                        ebVar = f135020e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135019d);
                            f135020e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
