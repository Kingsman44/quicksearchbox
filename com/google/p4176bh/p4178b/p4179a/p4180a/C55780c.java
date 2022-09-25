package com.google.p4176bh.p4178b.p4179a.p4180a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bh.b.a.a.c */
/* compiled from: PG */
public final class C55780c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55780c f147192a;

    /* renamed from: e */
    private static volatile C63010eb f147193e;

    /* renamed from: b */
    private int f147194b;

    /* renamed from: c */
    private C8242v f147195c;

    /* renamed from: d */
    private byte f147196d = 2;

    static {
        C55780c cVar = new C55780c();
        f147192a = cVar;
        C62942bv.registerDefaultInstance(C55780c.class, cVar);
    }

    private C55780c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147196d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147196d = b;
                return null;
            case 2:
                return newMessageInfo(f147192a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C55780c();
            case 4:
                return new C55779b();
            case 5:
                return f147192a;
            case 6:
                C63010eb ebVar = f147193e;
                if (ebVar == null) {
                    synchronized (C55780c.class) {
                        ebVar = f147193e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147192a);
                            f147193e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
