package com.google.p4181bi;

import com.google.p4420by.p4421a.p4422a.C57866c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.k */
/* compiled from: PG */
public final class C55849k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55849k f147363c;

    /* renamed from: d */
    private static volatile C63010eb f147364d;

    /* renamed from: a */
    public int f147365a;

    /* renamed from: b */
    public int f147366b;

    static {
        C55849k kVar = new C55849k();
        f147363c = kVar;
        C62942bv.registerDefaultInstance(C55849k.class, kVar);
    }

    private C55849k() {
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
                return newMessageInfo(f147363c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C57866c.f154586a});
            case 3:
                return new C55849k();
            case 4:
                return new C55848j();
            case 5:
                return f147363c;
            case 6:
                C63010eb ebVar = f147364d;
                if (ebVar == null) {
                    synchronized (C55849k.class) {
                        ebVar = f147364d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147363c);
                            f147364d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
