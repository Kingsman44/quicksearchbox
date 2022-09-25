package com.google.protos.p4985f.p4988b.p4989a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.a.c */
/* compiled from: PG */
public final class C64719c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64719c f175432a;

    /* renamed from: e */
    private static volatile C63010eb f175433e;

    /* renamed from: b */
    private int f175434b;

    /* renamed from: c */
    private int f175435c;

    /* renamed from: d */
    private byte f175436d = 2;

    static {
        C64719c cVar = new C64719c();
        f175432a = cVar;
        C62942bv.registerDefaultInstance(C64719c.class, cVar);
    }

    private C64719c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175436d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175436d = b;
                return null;
            case 2:
                return newMessageInfo(f175432a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64719c();
            case 4:
                return new C64718b();
            case 5:
                return f175432a;
            case 6:
                C63010eb ebVar = f175433e;
                if (ebVar == null) {
                    synchronized (C64719c.class) {
                        ebVar = f175433e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175432a);
                            f175433e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
