package com.google.p381aj.p382a.p383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8213ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.d */
/* compiled from: PG */
public final class C8249d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8249d f28975a;

    /* renamed from: e */
    private static volatile C63010eb f28976e;

    /* renamed from: b */
    private int f28977b;

    /* renamed from: c */
    private C8213ab f28978c;

    /* renamed from: d */
    private byte f28979d = 2;

    static {
        C8249d dVar = new C8249d();
        f28975a = dVar;
        C62942bv.registerDefaultInstance(C8249d.class, dVar);
    }

    private C8249d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28979d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28979d = b;
                return null;
            case 2:
                return newMessageInfo(f28975a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8249d();
            case 4:
                return new C8248c();
            case 5:
                return f28975a;
            case 6:
                C63010eb ebVar = f28976e;
                if (ebVar == null) {
                    synchronized (C8249d.class) {
                        ebVar = f28976e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28975a);
                            f28976e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
