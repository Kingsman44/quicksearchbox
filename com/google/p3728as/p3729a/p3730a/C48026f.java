package com.google.p3728as.p3729a.p3730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.as.a.a.f */
/* compiled from: PG */
public final class C48026f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48026f f124306c;

    /* renamed from: d */
    private static volatile C63010eb f124307d;

    /* renamed from: a */
    public long f124308a;

    /* renamed from: b */
    public C63088z f124309b = C63088z.f170246b;

    static {
        C48026f fVar = new C48026f();
        f124306c = fVar;
        C62942bv.registerDefaultInstance(C48026f.class, fVar);
    }

    private C48026f() {
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
                return newMessageInfo(f124306c, "\u0000\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0000\u0000\u0005\u0002\u0006\n", new Object[]{"a", "b"});
            case 3:
                return new C48026f();
            case 4:
                return new C48025e();
            case 5:
                return f124306c;
            case 6:
                C63010eb ebVar = f124307d;
                if (ebVar == null) {
                    synchronized (C48026f.class) {
                        ebVar = f124307d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124306c);
                            f124307d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
