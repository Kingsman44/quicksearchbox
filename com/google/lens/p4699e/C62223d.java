package com.google.lens.p4699e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.d */
/* compiled from: PG */
public final class C62223d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62223d f168005e;

    /* renamed from: g */
    private static volatile C63010eb f168006g;

    /* renamed from: a */
    public int f168007a = 0;

    /* renamed from: b */
    public Object f168008b;

    /* renamed from: c */
    public C62971cq f168009c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f168010d = C62942bv.emptyProtobufList();

    /* renamed from: f */
    private byte f168011f = 2;

    static {
        C62223d dVar = new C62223d();
        f168005e = dVar;
        C62942bv.registerDefaultInstance(C62223d.class, dVar);
    }

    private C62223d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168011f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168011f = b;
                return null;
            case 2:
                return newMessageInfo(f168005e, "\u0001\u0004\u0001\u0000\u0001\f\u0004\u0000\u0002\u0001\u0001\u001a\nᐼ\u0000\u000b\u001a\fြ\u0000", new Object[]{"b", "a", C45240c.f118157a, C62219be.class, "d", C62197aj.class});
            case 3:
                return new C62223d();
            case 4:
                return new C62222c();
            case 5:
                return f168005e;
            case 6:
                C63010eb ebVar = f168006g;
                if (ebVar == null) {
                    synchronized (C62223d.class) {
                        ebVar = f168006g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168005e);
                            f168006g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
