package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.j */
/* compiled from: PG */
public final class C48530j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48530j f125362d;

    /* renamed from: e */
    private static volatile C63010eb f125363e;

    /* renamed from: a */
    public int f125364a;

    /* renamed from: b */
    public float f125365b;

    /* renamed from: c */
    public float f125366c;

    static {
        C48530j jVar = new C48530j();
        f125362d = jVar;
        C62942bv.registerDefaultInstance(C48530j.class, jVar);
    }

    private C48530j() {
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
                return newMessageInfo(f125362d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48530j();
            case 4:
                return new C48529i();
            case 5:
                return f125362d;
            case 6:
                C63010eb ebVar = f125363e;
                if (ebVar == null) {
                    synchronized (C48530j.class) {
                        ebVar = f125363e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125362d);
                            f125363e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
