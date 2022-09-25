package com.google.p4172bg.p4175c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.c.d */
/* compiled from: PG */
public final class C55742d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C55742d f147103a;

    /* renamed from: e */
    private static volatile C63010eb f147104e;

    /* renamed from: b */
    private int f147105b;

    /* renamed from: c */
    private C55741c f147106c;

    /* renamed from: d */
    private byte f147107d = 2;

    static {
        C55742d dVar = new C55742d();
        f147103a = dVar;
        C62942bv.registerDefaultInstance(C55742d.class, dVar);
    }

    private C55742d() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147107d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147107d = b;
                return null;
            case 2:
                return newMessageInfo(f147103a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔑ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55742d();
            case 4:
                return new C55739a();
            case 5:
                return f147103a;
            case 6:
                C63010eb ebVar = f147104e;
                if (ebVar == null) {
                    synchronized (C55742d.class) {
                        ebVar = f147104e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147103a);
                            f147104e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
