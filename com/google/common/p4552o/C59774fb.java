package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fb */
/* compiled from: PG */
public final class C59774fb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59774fb f161511c;

    /* renamed from: e */
    private static volatile C63010eb f161512e;

    /* renamed from: a */
    public C62971cq f161513a = emptyProtobufList();

    /* renamed from: b */
    public long f161514b;

    /* renamed from: d */
    private int f161515d;

    static {
        C59774fb fbVar = new C59774fb();
        f161511c = fbVar;
        C62942bv.registerDefaultInstance(C59774fb.class, fbVar);
    }

    private C59774fb() {
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
                return newMessageInfo(f161511c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"d", "a", C59767ex.class, "b"});
            case 3:
                return new C59774fb();
            case 4:
                return new C59773fa();
            case 5:
                return f161511c;
            case 6:
                C63010eb ebVar = f161512e;
                if (ebVar == null) {
                    synchronized (C59774fb.class) {
                        ebVar = f161512e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161511c);
                            f161512e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
