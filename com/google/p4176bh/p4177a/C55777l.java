package com.google.p4176bh.p4177a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bh.a.l */
/* compiled from: PG */
public final class C55777l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55777l f147186a;

    /* renamed from: f */
    private static volatile C63010eb f147187f;

    /* renamed from: b */
    private int f147188b;

    /* renamed from: c */
    private C55771f f147189c;

    /* renamed from: d */
    private C55771f f147190d;

    /* renamed from: e */
    private byte f147191e = 2;

    static {
        C55777l lVar = new C55777l();
        f147186a = lVar;
        C62942bv.registerDefaultInstance(C55777l.class, lVar);
    }

    private C55777l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147191e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147191e = b;
                return null;
            case 2:
                return newMessageInfo(f147186a, "\u0001\u0002\u0000\u0001\u0001\u0017\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0017ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C55777l();
            case 4:
                return new C55776k();
            case 5:
                return f147186a;
            case 6:
                C63010eb ebVar = f147187f;
                if (ebVar == null) {
                    synchronized (C55777l.class) {
                        ebVar = f147187f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147186a);
                            f147187f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
