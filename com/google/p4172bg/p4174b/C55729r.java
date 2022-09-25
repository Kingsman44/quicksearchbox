package com.google.p4172bg.p4174b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.r */
/* compiled from: PG */
public final class C55729r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55729r f147055d;

    /* renamed from: f */
    private static volatile C63010eb f147056f;

    /* renamed from: a */
    public int f147057a;

    /* renamed from: b */
    public C55715d f147058b;

    /* renamed from: c */
    public C62961ch f147059c = emptyIntList();

    /* renamed from: e */
    private byte f147060e = 2;

    static {
        C55729r rVar = new C55729r();
        f147055d = rVar;
        C62942bv.registerDefaultInstance(C55729r.class, rVar);
    }

    private C55729r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147060e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147060e = b;
                return null;
            case 2:
                return newMessageInfo(f147055d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u0016", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55729r();
            case 4:
                return new C55728q();
            case 5:
                return f147055d;
            case 6:
                C63010eb ebVar = f147056f;
                if (ebVar == null) {
                    synchronized (C55729r.class) {
                        ebVar = f147056f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147055d);
                            f147056f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
