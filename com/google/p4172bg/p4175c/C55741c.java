package com.google.p4172bg.p4175c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.c.c */
/* compiled from: PG */
public final class C55741c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55741c f147098a;

    /* renamed from: e */
    private static volatile C63010eb f147099e;

    /* renamed from: b */
    private int f147100b;

    /* renamed from: c */
    private String f147101c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f147102d = 2;

    static {
        C55741c cVar = new C55741c();
        f147098a = cVar;
        C62942bv.registerDefaultInstance(C55741c.class, cVar);
    }

    private C55741c() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147102d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147102d = b;
                return null;
            case 2:
                return newMessageInfo(f147098a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᔈ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55741c();
            case 4:
                return new C55740b();
            case 5:
                return f147098a;
            case 6:
                C63010eb ebVar = f147099e;
                if (ebVar == null) {
                    synchronized (C55741c.class) {
                        ebVar = f147099e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147098a);
                            f147099e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
