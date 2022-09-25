package com.google.p4176bh.p4177a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bh.a.h */
/* compiled from: PG */
public final class C55773h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55773h f147172a;

    /* renamed from: g */
    private static volatile C63010eb f147173g;

    /* renamed from: b */
    private int f147174b;

    /* renamed from: c */
    private C55775j f147175c;

    /* renamed from: d */
    private C55769d f147176d;

    /* renamed from: e */
    private C55777l f147177e;

    /* renamed from: f */
    private byte f147178f = 2;

    static {
        C55773h hVar = new C55773h();
        f147172a = hVar;
        C62942bv.registerDefaultInstance(C55773h.class, hVar);
    }

    private C55773h() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147178f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147178f = b;
                return null;
            case 2:
                return newMessageInfo(f147172a, "\u0001\u0003\u0000\u0001\u0001\u0014\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0003\u0014ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C55773h();
            case 4:
                return new C55772g();
            case 5:
                return f147172a;
            case 6:
                C63010eb ebVar = f147173g;
                if (ebVar == null) {
                    synchronized (C55773h.class) {
                        ebVar = f147173g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147172a);
                            f147173g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
