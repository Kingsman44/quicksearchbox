package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ade */
/* compiled from: PG */
public final class ade extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final ade f158354e;

    /* renamed from: f */
    private static volatile C63010eb f158355f;

    /* renamed from: a */
    public int f158356a;

    /* renamed from: b */
    public add f158357b;

    /* renamed from: c */
    public acy f158358c;

    /* renamed from: d */
    public adb f158359d;

    static {
        ade ade = new ade();
        f158354e = ade;
        C62942bv.registerDefaultInstance(ade.class, ade);
    }

    private ade() {
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
                return newMessageInfo(f158354e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new ade();
            case 4:
                return new acz();
            case 5:
                return f158354e;
            case 6:
                C63010eb ebVar = f158355f;
                if (ebVar == null) {
                    synchronized (ade.class) {
                        ebVar = f158355f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158354e);
                            f158355f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
