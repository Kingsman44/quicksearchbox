package com.google.p4181bi;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.i */
/* compiled from: PG */
public final class C55847i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55847i f147358c;

    /* renamed from: e */
    private static volatile C63010eb f147359e;

    /* renamed from: a */
    public int f147360a = 0;

    /* renamed from: b */
    public Object f147361b;

    /* renamed from: d */
    private byte f147362d = 2;

    static {
        C55847i iVar = new C55847i();
        f147358c = iVar;
        C62942bv.registerDefaultInstance(C55847i.class, iVar);
    }

    private C55847i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147362d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147362d = b;
                return null;
            case 2:
                return newMessageInfo(f147358c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C55815ay.class, C55794ad.class, C55853o.class});
            case 3:
                return new C55847i();
            case 4:
                return new C55845g();
            case 5:
                return f147358c;
            case 6:
                C63010eb ebVar = f147359e;
                if (ebVar == null) {
                    synchronized (C55847i.class) {
                        ebVar = f147359e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147358c);
                            f147359e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
