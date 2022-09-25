package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.f */
/* compiled from: PG */
public final class C59770f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59770f f161501d;

    /* renamed from: e */
    private static volatile C63010eb f161502e;

    /* renamed from: a */
    public int f161503a;

    /* renamed from: b */
    public int f161504b;

    /* renamed from: c */
    public int f161505c;

    static {
        C59770f fVar = new C59770f();
        f161501d = fVar;
        C62942bv.registerDefaultInstance(C59770f.class, fVar);
    }

    private C59770f() {
    }

    /* renamed from: a */
    public static C59742e m92503a() {
        return (C59742e) f161501d.createBuilder();
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
                return newMessageInfo(f161501d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59770f();
            case 4:
                return new C59742e();
            case 5:
                return f161501d;
            case 6:
                C63010eb ebVar = f161502e;
                if (ebVar == null) {
                    synchronized (C59770f.class) {
                        ebVar = f161502e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161501d);
                            f161502e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
