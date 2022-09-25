package com.google.p4181bi;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.ar */
/* compiled from: PG */
public final class C55808ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55808ar f147261b;

    /* renamed from: d */
    private static volatile C63010eb f147262d;

    /* renamed from: a */
    public C62971cq f147263a = emptyProtobufList();

    /* renamed from: c */
    private byte f147264c = 2;

    static {
        C55808ar arVar = new C55808ar();
        f147261b = arVar;
        C62942bv.registerDefaultInstance(C55808ar.class, arVar);
    }

    private C55808ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147264c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147264c = b;
                return null;
            case 2:
                return newMessageInfo(f147261b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55807aq.class});
            case 3:
                return new C55808ar();
            case 4:
                return new C55803am();
            case 5:
                return f147261b;
            case 6:
                C63010eb ebVar = f147262d;
                if (ebVar == null) {
                    synchronized (C55808ar.class) {
                        ebVar = f147262d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147261b);
                            f147262d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
