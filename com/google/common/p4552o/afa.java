package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afa */
/* compiled from: PG */
public final class afa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final afa f158500e;

    /* renamed from: f */
    private static volatile C63010eb f158501f;

    /* renamed from: a */
    public int f158502a;

    /* renamed from: b */
    public long f158503b;

    /* renamed from: c */
    public double f158504c;

    /* renamed from: d */
    public double f158505d;

    static {
        afa afa = new afa();
        f158500e = afa;
        C62942bv.registerDefaultInstance(afa.class, afa);
    }

    private afa() {
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
                return newMessageInfo(f158500e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new afa();
            case 4:
                return new aez();
            case 5:
                return f158500e;
            case 6:
                C63010eb ebVar = f158501f;
                if (ebVar == null) {
                    synchronized (afa.class) {
                        ebVar = f158501f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158500e);
                            f158501f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
