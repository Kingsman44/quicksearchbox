package com.google.p4181bi;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.aj */
/* compiled from: PG */
public final class C55800aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55800aj f147243c;

    /* renamed from: d */
    private static volatile C63010eb f147244d;

    /* renamed from: a */
    public int f147245a = 0;

    /* renamed from: b */
    public Object f147246b;

    static {
        C55800aj ajVar = new C55800aj();
        f147243c = ajVar;
        C62942bv.registerDefaultInstance(C55800aj.class, ajVar);
    }

    private C55800aj() {
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
                return newMessageInfo(f147243c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C55800aj();
            case 4:
                return new C55798ah();
            case 5:
                return f147243c;
            case 6:
                C63010eb ebVar = f147244d;
                if (ebVar == null) {
                    synchronized (C55800aj.class) {
                        ebVar = f147244d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147243c);
                            f147244d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
