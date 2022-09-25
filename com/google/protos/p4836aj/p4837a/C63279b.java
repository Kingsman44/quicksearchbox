package com.google.protos.p4836aj.p4837a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aj.a.b */
/* compiled from: PG */
public final class C63279b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63279b f171021a;

    /* renamed from: f */
    private static volatile C63010eb f171022f;

    /* renamed from: b */
    private int f171023b;

    /* renamed from: c */
    private long f171024c;

    /* renamed from: d */
    private long f171025d;

    /* renamed from: e */
    private byte f171026e = 2;

    static {
        C63279b bVar = new C63279b();
        f171021a = bVar;
        C62942bv.registerDefaultInstance(C63279b.class, bVar);
    }

    private C63279b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171026e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171026e = b;
                return null;
            case 2:
                return newMessageInfo(f171021a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔅ\u0000\u0002ᔅ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C63279b();
            case 4:
                return new C63278a();
            case 5:
                return f171021a;
            case 6:
                C63010eb ebVar = f171022f;
                if (ebVar == null) {
                    synchronized (C63279b.class) {
                        ebVar = f171022f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171021a);
                            f171022f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
