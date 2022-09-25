package com.google.p395al.p408c.p414c.p416b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.ay */
/* compiled from: PG */
public final class C8482ay extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8482ay f29440d;

    /* renamed from: e */
    private static volatile C63010eb f29441e;

    /* renamed from: a */
    public int f29442a;

    /* renamed from: b */
    public C8466ai f29443b;

    /* renamed from: c */
    public C8466ai f29444c;

    static {
        C8482ay ayVar = new C8482ay();
        f29440d = ayVar;
        C62942bv.registerDefaultInstance(C8482ay.class, ayVar);
    }

    private C8482ay() {
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
                return newMessageInfo(f29440d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8482ay();
            case 4:
                return new C8481ax();
            case 5:
                return f29440d;
            case 6:
                C63010eb ebVar = f29441e;
                if (ebVar == null) {
                    synchronized (C8482ay.class) {
                        ebVar = f29441e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29440d);
                            f29441e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
