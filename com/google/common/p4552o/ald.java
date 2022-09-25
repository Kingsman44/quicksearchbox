package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ald */
/* compiled from: PG */
public final class ald extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ald f159014d;

    /* renamed from: e */
    private static volatile C63010eb f159015e;

    /* renamed from: a */
    public int f159016a;

    /* renamed from: b */
    public int f159017b;

    /* renamed from: c */
    public C62971cq f159018c = emptyProtobufList();

    static {
        ald ald = new ald();
        f159014d = ald;
        C62942bv.registerDefaultInstance(ald.class, ald);
    }

    private ald() {
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
                return newMessageInfo(f159014d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, alc.class});
            case 3:
                return new ald();
            case 4:
                return new ala();
            case 5:
                return f159014d;
            case 6:
                C63010eb ebVar = f159015e;
                if (ebVar == null) {
                    synchronized (ald.class) {
                        ebVar = f159015e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159014d);
                            f159015e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
