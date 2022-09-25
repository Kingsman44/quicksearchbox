package com.google.p4181bi;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bi.b */
/* compiled from: PG */
public final class C55817b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55817b f147283d;

    /* renamed from: e */
    private static volatile C63010eb f147284e;

    /* renamed from: a */
    public int f147285a;

    /* renamed from: b */
    public C63088z f147286b = C63088z.f170246b;

    /* renamed from: c */
    public double f147287c;

    static {
        C55817b bVar = new C55817b();
        f147283d = bVar;
        C62942bv.registerDefaultInstance(C55817b.class, bVar);
    }

    private C55817b() {
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
                return newMessageInfo(f147283d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55817b();
            case 4:
                return new C55782a();
            case 5:
                return f147283d;
            case 6:
                C63010eb ebVar = f147284e;
                if (ebVar == null) {
                    synchronized (C55817b.class) {
                        ebVar = f147284e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147283d);
                            f147284e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
