package com.google.common.p4552o.p4562h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.h.b */
/* compiled from: PG */
public final class C59836b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C59836b f161702a;

    /* renamed from: e */
    private static volatile C63010eb f161703e;

    /* renamed from: b */
    private int f161704b;

    /* renamed from: c */
    private C60218r f161705c;

    /* renamed from: d */
    private byte f161706d = 2;

    static {
        C59836b bVar = new C59836b();
        f161702a = bVar;
        C62942bv.registerDefaultInstance(C59836b.class, bVar);
    }

    private C59836b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f161706d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f161706d = b;
                return null;
            case 2:
                return newMessageInfo(f161702a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C59836b();
            case 4:
                return new C59835a();
            case 5:
                return f161702a;
            case 6:
                C63010eb ebVar = f161703e;
                if (ebVar == null) {
                    synchronized (C59836b.class) {
                        ebVar = f161703e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161702a);
                            f161703e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
