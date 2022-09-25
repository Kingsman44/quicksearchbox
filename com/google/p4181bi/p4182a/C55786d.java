package com.google.p4181bi.p4182a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.a.d */
/* compiled from: PG */
public final class C55786d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55786d f147207b;

    /* renamed from: c */
    private static volatile C63010eb f147208c;

    /* renamed from: a */
    public C62971cq f147209a = emptyProtobufList();

    static {
        C55786d dVar = new C55786d();
        f147207b = dVar;
        C62942bv.registerDefaultInstance(C55786d.class, dVar);
    }

    private C55786d() {
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
                return newMessageInfo(f147207b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C55785c.class});
            case 3:
                return new C55786d();
            case 4:
                return new C55783a();
            case 5:
                return f147207b;
            case 6:
                C63010eb ebVar = f147208c;
                if (ebVar == null) {
                    synchronized (C55786d.class) {
                        ebVar = f147208c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147207b);
                            f147208c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
