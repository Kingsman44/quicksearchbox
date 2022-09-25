package com.google.p4181bi.p4182a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.a.c */
/* compiled from: PG */
public final class C55785c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55785c f147202c;

    /* renamed from: e */
    private static volatile C63010eb f147203e;

    /* renamed from: a */
    public int f147204a;

    /* renamed from: b */
    public int f147205b;

    /* renamed from: d */
    private int f147206d;

    static {
        C55785c cVar = new C55785c();
        f147202c = cVar;
        C62942bv.registerDefaultInstance(C55785c.class, cVar);
    }

    private C55785c() {
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
                return newMessageInfo(f147202c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", C55787e.f147210a, "b", C55790h.m87734b()});
            case 3:
                return new C55785c();
            case 4:
                return new C55784b();
            case 5:
                return f147202c;
            case 6:
                C63010eb ebVar = f147203e;
                if (ebVar == null) {
                    synchronized (C55785c.class) {
                        ebVar = f147203e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147202c);
                            f147203e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
