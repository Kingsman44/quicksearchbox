package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.by */
/* compiled from: PG */
public final class C63938by extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63938by f172910d;

    /* renamed from: f */
    private static volatile C63010eb f172911f;

    /* renamed from: a */
    public int f172912a;

    /* renamed from: b */
    public C63929bp f172913b;

    /* renamed from: c */
    public C63949m f172914c;

    /* renamed from: e */
    private byte f172915e = 2;

    static {
        C63938by byVar = new C63938by();
        f172910d = byVar;
        C62942bv.registerDefaultInstance(C63938by.class, byVar);
    }

    private C63938by() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172915e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172915e = b;
                return null;
            case 2:
                return newMessageInfo(f172910d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63938by();
            case 4:
                return new C63937bx();
            case 5:
                return f172910d;
            case 6:
                C63010eb ebVar = f172911f;
                if (ebVar == null) {
                    synchronized (C63938by.class) {
                        ebVar = f172911f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172910d);
                            f172911f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
