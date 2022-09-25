package com.google.p4172bg.p4174b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.h */
/* compiled from: PG */
public final class C55719h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55719h f147013b;

    /* renamed from: d */
    private static volatile C63010eb f147014d;

    /* renamed from: a */
    public C62971cq f147015a = emptyProtobufList();

    /* renamed from: c */
    private byte f147016c = 2;

    static {
        C55719h hVar = new C55719h();
        f147013b = hVar;
        C62942bv.registerDefaultInstance(C55719h.class, hVar);
    }

    private C55719h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147016c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147016c = b;
                return null;
            case 2:
                return newMessageInfo(f147013b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55717f.class});
            case 3:
                return new C55719h();
            case 4:
                return new C55718g();
            case 5:
                return f147013b;
            case 6:
                C63010eb ebVar = f147014d;
                if (ebVar == null) {
                    synchronized (C55719h.class) {
                        ebVar = f147014d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147013b);
                            f147014d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
