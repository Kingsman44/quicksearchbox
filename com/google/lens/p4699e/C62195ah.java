package com.google.lens.p4699e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62493dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.ah */
/* compiled from: PG */
public final class C62195ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62195ah f167931d;

    /* renamed from: g */
    private static volatile C63010eb f167932g;

    /* renamed from: a */
    public int f167933a = 0;

    /* renamed from: b */
    public Object f167934b;

    /* renamed from: c */
    public C62493dp f167935c;

    /* renamed from: e */
    private int f167936e;

    /* renamed from: f */
    private byte f167937f = 2;

    static {
        C62195ah ahVar = new C62195ah();
        f167931d = ahVar;
        C62942bv.registerDefaultInstance(C62195ah.class, ahVar);
    }

    private C62195ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167937f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167937f = b;
                return null;
            case 2:
                return newMessageInfo(f167931d, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐼ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C62193af.class, C62203ap.class, C62205ar.class});
            case 3:
                return new C62195ah();
            case 4:
                return new C62194ag();
            case 5:
                return f167931d;
            case 6:
                C63010eb ebVar = f167932g;
                if (ebVar == null) {
                    synchronized (C62195ah.class) {
                        ebVar = f167932g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167931d);
                            f167932g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
