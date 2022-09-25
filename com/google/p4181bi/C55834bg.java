package com.google.p4181bi;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.bg */
/* compiled from: PG */
public final class C55834bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55834bg f147334c;

    /* renamed from: d */
    private static volatile C63010eb f147335d;

    /* renamed from: a */
    public int f147336a = 0;

    /* renamed from: b */
    public Object f147337b;

    static {
        C55834bg bgVar = new C55834bg();
        f147334c = bgVar;
        C62942bv.registerDefaultInstance(C55834bg.class, bgVar);
    }

    private C55834bg() {
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
                return newMessageInfo(f147334c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C55834bg();
            case 4:
                return new C55833bf();
            case 5:
                return f147334c;
            case 6:
                C63010eb ebVar = f147335d;
                if (ebVar == null) {
                    synchronized (C55834bg.class) {
                        ebVar = f147335d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147334c);
                            f147335d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
