package com.google.p4181bi;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bi.aq */
/* compiled from: PG */
public final class C55807aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55807aq f147254d;

    /* renamed from: g */
    private static volatile C63010eb f147255g;

    /* renamed from: a */
    public int f147256a = 0;

    /* renamed from: b */
    public Object f147257b;

    /* renamed from: c */
    public C55800aj f147258c;

    /* renamed from: e */
    private int f147259e;

    /* renamed from: f */
    private byte f147260f = 2;

    static {
        C55807aq aqVar = new C55807aq();
        f147254d = aqVar;
        C62942bv.registerDefaultInstance(C55807aq.class, aqVar);
    }

    private C55807aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147260f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147260f = b;
                return null;
            case 2:
                return newMessageInfo(f147254d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐼ\u0000\u0003ဿ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C55847i.class, C55805ao.f147253a});
            case 3:
                return new C55807aq();
            case 4:
                return new C55804an();
            case 5:
                return f147254d;
            case 6:
                C63010eb ebVar = f147255g;
                if (ebVar == null) {
                    synchronized (C55807aq.class) {
                        ebVar = f147255g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147254d);
                            f147255g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
