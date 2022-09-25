package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4126az.p4127a.p4128a.C54648b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.d */
/* compiled from: PG */
public final class C60029d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60029d f162254a;

    /* renamed from: e */
    private static volatile C63010eb f162255e;

    /* renamed from: b */
    private int f162256b;

    /* renamed from: c */
    private C54648b f162257c;

    /* renamed from: d */
    private byte f162258d = 2;

    static {
        C60029d dVar = new C60029d();
        f162254a = dVar;
        C62942bv.registerDefaultInstance(C60029d.class, dVar);
    }

    private C60029d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162258d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162258d = b;
                return null;
            case 2:
                return newMessageInfo(f162254a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60029d();
            case 4:
                return new C60028c();
            case 5:
                return f162254a;
            case 6:
                C63010eb ebVar = f162255e;
                if (ebVar == null) {
                    synchronized (C60029d.class) {
                        ebVar = f162255e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162254a);
                            f162255e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
