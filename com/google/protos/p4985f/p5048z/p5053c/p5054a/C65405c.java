package com.google.protos.p4985f.p5048z.p5053c.p5054a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.a.c */
/* compiled from: PG */
public final class C65405c extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C65405c f177820c;

    /* renamed from: e */
    private static volatile C63010eb f177821e;

    /* renamed from: a */
    public int f177822a;

    /* renamed from: b */
    public int f177823b;

    /* renamed from: d */
    private byte f177824d = 2;

    static {
        C65405c cVar = new C65405c();
        f177820c = cVar;
        C62942bv.registerDefaultInstance(C65405c.class, cVar);
    }

    private C65405c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177824d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177824d = b;
                return null;
            case 2:
                return newMessageInfo(f177820c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C65404b.f177819a});
            case 3:
                return new C65405c();
            case 4:
                return new C65403a();
            case 5:
                return f177820c;
            case 6:
                C63010eb ebVar = f177821e;
                if (ebVar == null) {
                    synchronized (C65405c.class) {
                        ebVar = f177821e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177820c);
                            f177821e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
