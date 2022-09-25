package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.ay */
/* compiled from: PG */
public final class C48506ay extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48506ay f125312d;

    /* renamed from: e */
    private static volatile C63010eb f125313e;

    /* renamed from: a */
    public int f125314a;

    /* renamed from: b */
    public int f125315b;

    /* renamed from: c */
    public int f125316c;

    static {
        C48506ay ayVar = new C48506ay();
        f125312d = ayVar;
        C62942bv.registerDefaultInstance(C48506ay.class, ayVar);
    }

    private C48506ay() {
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
                return newMessageInfo(f125312d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48506ay();
            case 4:
                return new C48505ax();
            case 5:
                return f125312d;
            case 6:
                C63010eb ebVar = f125313e;
                if (ebVar == null) {
                    synchronized (C48506ay.class) {
                        ebVar = f125313e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125312d);
                            f125313e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
