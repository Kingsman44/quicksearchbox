package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.ay */
/* compiled from: PG */
public final class C56244ay extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56244ay f149802e;

    /* renamed from: f */
    private static volatile C63010eb f149803f;

    /* renamed from: a */
    public int f149804a;

    /* renamed from: b */
    public long f149805b;

    /* renamed from: c */
    public long f149806c;

    /* renamed from: d */
    public long f149807d;

    static {
        C56244ay ayVar = new C56244ay();
        f149802e = ayVar;
        C62942bv.registerDefaultInstance(C56244ay.class, ayVar);
    }

    private C56244ay() {
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
                return newMessageInfo(f149802e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001\u0003စ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56244ay();
            case 4:
                return new C56243ax();
            case 5:
                return f149802e;
            case 6:
                C63010eb ebVar = f149803f;
                if (ebVar == null) {
                    synchronized (C56244ay.class) {
                        ebVar = f149803f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149802e);
                            f149803f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
