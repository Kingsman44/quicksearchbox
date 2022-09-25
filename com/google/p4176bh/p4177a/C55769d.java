package com.google.p4176bh.p4177a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bh.a.d */
/* compiled from: PG */
public final class C55769d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55769d f147162a;

    /* renamed from: e */
    private static volatile C63010eb f147163e;

    /* renamed from: b */
    private int f147164b;

    /* renamed from: c */
    private C8242v f147165c;

    /* renamed from: d */
    private byte f147166d = 2;

    static {
        C55769d dVar = new C55769d();
        f147162a = dVar;
        C62942bv.registerDefaultInstance(C55769d.class, dVar);
    }

    private C55769d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147166d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147166d = b;
                return null;
            case 2:
                return newMessageInfo(f147162a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55769d();
            case 4:
                return new C55768c();
            case 5:
                return f147162a;
            case 6:
                C63010eb ebVar = f147163e;
                if (ebVar == null) {
                    synchronized (C55769d.class) {
                        ebVar = f147163e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147162a);
                            f147163e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
