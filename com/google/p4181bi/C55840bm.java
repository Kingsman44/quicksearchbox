package com.google.p4181bi;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.bm */
/* compiled from: PG */
public final class C55840bm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55840bm f147344a;

    /* renamed from: b */
    private static volatile C63010eb f147345b;

    static {
        C55840bm bmVar = new C55840bm();
        f147344a = bmVar;
        C62942bv.registerDefaultInstance(C55840bm.class, bmVar);
    }

    private C55840bm() {
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
                return newMessageInfo(f147344a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55840bm();
            case 4:
                return new C55839bl();
            case 5:
                return f147344a;
            case 6:
                C63010eb ebVar = f147345b;
                if (ebVar == null) {
                    synchronized (C55840bm.class) {
                        ebVar = f147345b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147344a);
                            f147345b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
