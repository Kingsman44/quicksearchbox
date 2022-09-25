package com.google.p4181bi;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.ab */
/* compiled from: PG */
public final class C55792ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55792ab f147218c;

    /* renamed from: e */
    private static volatile C63010eb f147219e;

    /* renamed from: a */
    public boolean f147220a;

    /* renamed from: b */
    public boolean f147221b;

    /* renamed from: d */
    private int f147222d;

    static {
        C55792ab abVar = new C55792ab();
        f147218c = abVar;
        C62942bv.registerDefaultInstance(C55792ab.class, abVar);
    }

    private C55792ab() {
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
                return newMessageInfo(f147218c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C55792ab();
            case 4:
                return new C55791aa();
            case 5:
                return f147218c;
            case 6:
                C63010eb ebVar = f147219e;
                if (ebVar == null) {
                    synchronized (C55792ab.class) {
                        ebVar = f147219e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147218c);
                            f147219e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
