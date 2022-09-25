package com.google.p4181bi;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.t */
/* compiled from: PG */
public final class C55858t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55858t f147392f;

    /* renamed from: g */
    private static volatile C63010eb f147393g;

    /* renamed from: a */
    public int f147394a;

    /* renamed from: b */
    public C55832be f147395b;

    /* renamed from: c */
    public C55810at f147396c;

    /* renamed from: d */
    public C55817b f147397d;

    /* renamed from: e */
    public boolean f147398e;

    static {
        C55858t tVar = new C55858t();
        f147392f = tVar;
        C62942bv.registerDefaultInstance(C55858t.class, tVar);
    }

    private C55858t() {
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
                return newMessageInfo(f147392f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C55858t();
            case 4:
                return new C55857s();
            case 5:
                return f147392f;
            case 6:
                C63010eb ebVar = f147393g;
                if (ebVar == null) {
                    synchronized (C55858t.class) {
                        ebVar = f147393g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147392f);
                            f147393g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
