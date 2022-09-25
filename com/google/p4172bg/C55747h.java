package com.google.p4172bg;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.h */
/* compiled from: PG */
public final class C55747h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55747h f147114g;

    /* renamed from: i */
    private static volatile C63010eb f147115i;

    /* renamed from: a */
    public int f147116a;

    /* renamed from: b */
    public int f147117b;

    /* renamed from: c */
    public int f147118c;

    /* renamed from: d */
    public int f147119d;

    /* renamed from: e */
    public int f147120e;

    /* renamed from: f */
    public float f147121f;

    /* renamed from: h */
    private byte f147122h = 2;

    static {
        C55747h hVar = new C55747h();
        f147114g = hVar;
        C62942bv.registerDefaultInstance(C55747h.class, hVar);
    }

    private C55747h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147122h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147122h = b;
                return null;
            case 2:
                return newMessageInfo(f147114g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C55747h();
            case 4:
                return new C55746g();
            case 5:
                return f147114g;
            case 6:
                C63010eb ebVar = f147115i;
                if (ebVar == null) {
                    synchronized (C55747h.class) {
                        ebVar = f147115i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147114g);
                            f147115i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
