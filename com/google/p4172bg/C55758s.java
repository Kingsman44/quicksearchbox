package com.google.p4172bg;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.bg.s */
/* compiled from: PG */
public final class C55758s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55758s f147134c;

    /* renamed from: d */
    private static volatile C63010eb f147135d;

    /* renamed from: a */
    public int f147136a = 0;

    /* renamed from: b */
    public Object f147137b;

    static {
        C55758s sVar = new C55758s();
        f147134c = sVar;
        C62942bv.registerDefaultInstance(C55758s.class, sVar);
    }

    private C55758s() {
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
                return newMessageInfo(f147134c, "\u0000\u0004\u0001\u0000\u0001f\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000e<\u0000fȻ\u0000", new Object[]{"b", "a", C55753n.class, C63070h.class});
            case 3:
                return new C55758s();
            case 4:
                return new C55757r();
            case 5:
                return f147134c;
            case 6:
                C63010eb ebVar = f147135d;
                if (ebVar == null) {
                    synchronized (C55758s.class) {
                        ebVar = f147135d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147134c);
                            f147135d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
