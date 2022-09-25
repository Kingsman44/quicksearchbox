package com.google.protos.p5127o.p5128a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.a.f */
/* compiled from: PG */
public final class C65625f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65625f f178332e;

    /* renamed from: g */
    private static volatile C63010eb f178333g;

    /* renamed from: a */
    public int f178334a;

    /* renamed from: b */
    public int f178335b = 0;

    /* renamed from: c */
    public Object f178336c;

    /* renamed from: d */
    public int f178337d;

    /* renamed from: f */
    private byte f178338f = 2;

    static {
        C65625f fVar = new C65625f();
        f178332e = fVar;
        C62942bv.registerDefaultInstance(C65625f.class, fVar);
    }

    private C65625f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178338f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178338f = b;
                return null;
            case 2:
                return newMessageInfo(f178332e, "\u0001\u0003\u0001\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐼ\u0000\u0003ဌ\u0004\u0005ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C55093fp.class, "d", C65607a.f178311a, C65631l.class});
            case 3:
                return new C65625f();
            case 4:
                return new C65624e();
            case 5:
                return f178332e;
            case 6:
                C63010eb ebVar = f178333g;
                if (ebVar == null) {
                    synchronized (C65625f.class) {
                        ebVar = f178333g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178332e);
                            f178333g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
