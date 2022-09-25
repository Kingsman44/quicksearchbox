package com.google.p440an.p442b.p443a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.an.b.a.b */
/* compiled from: PG */
public final class C8846b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8846b f30755a;

    /* renamed from: f */
    private static volatile C63010eb f30756f;

    /* renamed from: b */
    private int f30757b;

    /* renamed from: c */
    private int f30758c;

    /* renamed from: d */
    private long f30759d;

    /* renamed from: e */
    private byte f30760e = 2;

    static {
        C8846b bVar = new C8846b();
        f30755a = bVar;
        C62942bv.registerDefaultInstance(C8846b.class, bVar);
    }

    private C8846b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f30760e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f30760e = b;
                return null;
            case 2:
                return newMessageInfo(f30755a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C8846b();
            case 4:
                return new C8845a();
            case 5:
                return f30755a;
            case 6:
                C63010eb ebVar = f30756f;
                if (ebVar == null) {
                    synchronized (C8846b.class) {
                        ebVar = f30756f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30755a);
                            f30756f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
