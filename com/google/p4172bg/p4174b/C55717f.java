package com.google.p4172bg.p4174b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bg.b.f */
/* compiled from: PG */
public final class C55717f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55717f f147006b;

    /* renamed from: g */
    private static volatile C63010eb f147007g;

    /* renamed from: a */
    public float f147008a;

    /* renamed from: c */
    private int f147009c;

    /* renamed from: d */
    private C55715d f147010d;

    /* renamed from: e */
    private C55715d f147011e;

    /* renamed from: f */
    private byte f147012f = 2;

    static {
        C55717f fVar = new C55717f();
        f147006b = fVar;
        C62942bv.registerDefaultInstance(C55717f.class, fVar);
    }

    private C55717f() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyFloatList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147012f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147012f = b;
                return null;
            case 2:
                return newMessageInfo(f147006b, "\u0001\u0003\u0000\u0001\u0001\u0019\u0003\u0000\u0000\u0002\u0001ᔉ\u0000\u0006ᐉ\u0004\u0019ခ\u0011", new Object[]{C45240c.f118157a, "d", "e", "a"});
            case 3:
                return new C55717f();
            case 4:
                return new C55716e();
            case 5:
                return f147006b;
            case 6:
                C63010eb ebVar = f147007g;
                if (ebVar == null) {
                    synchronized (C55717f.class) {
                        ebVar = f147007g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147006b);
                            f147007g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
