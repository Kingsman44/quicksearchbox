package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bp */
/* compiled from: PG */
public final class C60151bp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60151bp f162720e;

    /* renamed from: f */
    private static volatile C63010eb f162721f;

    /* renamed from: a */
    public int f162722a;

    /* renamed from: b */
    public C62971cq f162723b = emptyProtobufList();

    /* renamed from: c */
    public long f162724c;

    /* renamed from: d */
    public long f162725d;

    static {
        C60151bp bpVar = new C60151bp();
        f162720e = bpVar;
        C62942bv.registerDefaultInstance(C60151bp.class, bpVar);
    }

    private C60151bp() {
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
                return newMessageInfo(f162720e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000\u0003ဃ\u0001", new Object[]{"a", "b", C60150bo.class, C45240c.f118157a, "d"});
            case 3:
                return new C60151bp();
            case 4:
                return new C60148bm();
            case 5:
                return f162720e;
            case 6:
                C63010eb ebVar = f162721f;
                if (ebVar == null) {
                    synchronized (C60151bp.class) {
                        ebVar = f162721f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162720e);
                            f162721f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
