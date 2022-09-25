package com.google.p4172bg.p4174b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.d */
/* compiled from: PG */
public final class C55715d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55715d f146997g;

    /* renamed from: i */
    private static volatile C63010eb f146998i;

    /* renamed from: a */
    public int f146999a;

    /* renamed from: b */
    public int f147000b;

    /* renamed from: c */
    public int f147001c;

    /* renamed from: d */
    public int f147002d;

    /* renamed from: e */
    public int f147003e;

    /* renamed from: f */
    public float f147004f;

    /* renamed from: h */
    private byte f147005h = 2;

    static {
        C55715d dVar = new C55715d();
        f146997g = dVar;
        C62942bv.registerDefaultInstance(C55715d.class, dVar);
    }

    private C55715d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147005h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147005h = b;
                return null;
            case 2:
                return newMessageInfo(f146997g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C55715d();
            case 4:
                return new C55714c();
            case 5:
                return f146997g;
            case 6:
                C63010eb ebVar = f146998i;
                if (ebVar == null) {
                    synchronized (C55715d.class) {
                        ebVar = f146998i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146997g);
                            f146998i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
