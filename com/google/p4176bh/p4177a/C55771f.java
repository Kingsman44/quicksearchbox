package com.google.p4176bh.p4177a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4682d.C61991b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bh.a.f */
/* compiled from: PG */
public final class C55771f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55771f f147167a;

    /* renamed from: e */
    private static volatile C63010eb f147168e;

    /* renamed from: b */
    private int f147169b;

    /* renamed from: c */
    private C61991b f147170c;

    /* renamed from: d */
    private byte f147171d = 2;

    static {
        C55771f fVar = new C55771f();
        f147167a = fVar;
        C62942bv.registerDefaultInstance(C55771f.class, fVar);
    }

    private C55771f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147171d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147171d = b;
                return null;
            case 2:
                return newMessageInfo(f147167a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55771f();
            case 4:
                return new C55770e();
            case 5:
                return f147167a;
            case 6:
                C63010eb ebVar = f147168e;
                if (ebVar == null) {
                    synchronized (C55771f.class) {
                        ebVar = f147168e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147167a);
                            f147168e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
