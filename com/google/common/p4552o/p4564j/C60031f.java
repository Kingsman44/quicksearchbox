package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.f */
/* compiled from: PG */
public final class C60031f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60031f f162259a;

    /* renamed from: f */
    private static volatile C63010eb f162260f;

    /* renamed from: b */
    private int f162261b;

    /* renamed from: c */
    private int f162262c;

    /* renamed from: d */
    private int f162263d;

    /* renamed from: e */
    private byte f162264e = 2;

    static {
        C60031f fVar = new C60031f();
        f162259a = fVar;
        C62942bv.registerDefaultInstance(C60031f.class, fVar);
    }

    private C60031f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162264e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162264e = b;
                return null;
            case 2:
                return newMessageInfo(f162259a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C60031f();
            case 4:
                return new C60030e();
            case 5:
                return f162259a;
            case 6:
                C63010eb ebVar = f162260f;
                if (ebVar == null) {
                    synchronized (C60031f.class) {
                        ebVar = f162260f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162259a);
                            f162260f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
