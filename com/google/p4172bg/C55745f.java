package com.google.p4172bg;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.f */
/* compiled from: PG */
public final class C55745f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55745f f147108d;

    /* renamed from: f */
    private static volatile C63010eb f147109f;

    /* renamed from: a */
    public int f147110a;

    /* renamed from: b */
    public int f147111b;

    /* renamed from: c */
    public int f147112c = 2;

    /* renamed from: e */
    private int f147113e;

    static {
        C55745f fVar = new C55745f();
        f147108d = fVar;
        C62942bv.registerDefaultInstance(C55745f.class, fVar);
    }

    private C55745f() {
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
                return newMessageInfo(f147108d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", C55738c.f147097a, "b", C55750k.f147124a, C45240c.f118157a, C55748i.f147123a});
            case 3:
                return new C55745f();
            case 4:
                return new C55744e();
            case 5:
                return f147108d;
            case 6:
                C63010eb ebVar = f147109f;
                if (ebVar == null) {
                    synchronized (C55745f.class) {
                        ebVar = f147109f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147108d);
                            f147109f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
