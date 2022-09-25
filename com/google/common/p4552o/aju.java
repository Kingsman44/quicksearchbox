package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aju */
/* compiled from: PG */
public final class aju extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aju f158911c;

    /* renamed from: d */
    private static volatile C63010eb f158912d;

    /* renamed from: a */
    public int f158913a;

    /* renamed from: b */
    public boolean f158914b;

    static {
        aju aju = new aju();
        f158911c = aju;
        C62942bv.registerDefaultInstance(aju.class, aju);
    }

    private aju() {
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
                return newMessageInfo(f158911c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aju();
            case 4:
                return new ajt();
            case 5:
                return f158911c;
            case 6:
                C63010eb ebVar = f158912d;
                if (ebVar == null) {
                    synchronized (aju.class) {
                        ebVar = f158912d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158911c);
                            f158912d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
