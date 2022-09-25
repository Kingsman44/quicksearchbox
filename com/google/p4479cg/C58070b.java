package com.google.p4479cg;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62931bk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cg.b */
/* compiled from: PG */
public final class C58070b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C58070b f155212e;

    /* renamed from: f */
    private static volatile C63010eb f155213f;

    /* renamed from: a */
    public float f155214a;

    /* renamed from: b */
    public float f155215b;

    /* renamed from: c */
    public float f155216c;

    /* renamed from: d */
    public C62931bk f155217d;

    static {
        C58070b bVar = new C58070b();
        f155212e = bVar;
        C62942bv.registerDefaultInstance(C58070b.class, bVar);
    }

    private C58070b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f155212e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C58070b();
            case 4:
                return new C58063a();
            case 5:
                return f155212e;
            case 6:
                C63010eb ebVar = f155213f;
                if (ebVar == null) {
                    synchronized (C58070b.class) {
                        ebVar = f155213f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155212e);
                            f155213f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
