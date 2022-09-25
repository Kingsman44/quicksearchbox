package com.google.p4172bg.p4174b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.l */
/* compiled from: PG */
public final class C55723l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55723l f147032f;

    /* renamed from: g */
    private static volatile C63010eb f147033g;

    /* renamed from: a */
    public int f147034a;

    /* renamed from: b */
    public float f147035b;

    /* renamed from: c */
    public float f147036c;

    /* renamed from: d */
    public float f147037d;

    /* renamed from: e */
    public float f147038e;

    static {
        C55723l lVar = new C55723l();
        f147032f = lVar;
        C62942bv.registerDefaultInstance(C55723l.class, lVar);
    }

    private C55723l() {
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
                return newMessageInfo(f147032f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55723l();
            case 4:
                return new C55722k();
            case 5:
                return f147032f;
            case 6:
                C63010eb ebVar = f147033g;
                if (ebVar == null) {
                    synchronized (C55723l.class) {
                        ebVar = f147033g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147032f);
                            f147033g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
