package com.google.p4176bh.p4178b.p4179a.p4180a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bh.b.a.a.d */
/* compiled from: PG */
public final class C55781d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55781d f147197a;

    /* renamed from: e */
    private static volatile C63010eb f147198e;

    /* renamed from: b */
    private int f147199b;

    /* renamed from: c */
    private C55780c f147200c;

    /* renamed from: d */
    private byte f147201d = 2;

    static {
        C55781d dVar = new C55781d();
        f147197a = dVar;
        C62942bv.registerDefaultInstance(C55781d.class, dVar);
    }

    private C55781d() {
        emptyIntList();
        C62942bv.emptyProtobufList();
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
                return Byte.valueOf(this.f147201d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147201d = b;
                return null;
            case 2:
                return newMessageInfo(f147197a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\n", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55781d();
            case 4:
                return new C55778a();
            case 5:
                return f147197a;
            case 6:
                C63010eb ebVar = f147198e;
                if (ebVar == null) {
                    synchronized (C55781d.class) {
                        ebVar = f147198e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147197a);
                            f147198e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
