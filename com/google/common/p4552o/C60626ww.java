package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ww */
/* compiled from: PG */
public final class C60626ww extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60626ww f164481c;

    /* renamed from: d */
    private static volatile C63010eb f164482d;

    /* renamed from: a */
    public int f164483a;

    /* renamed from: b */
    public int f164484b;

    static {
        C60626ww wwVar = new C60626ww();
        f164481c = wwVar;
        C62942bv.registerDefaultInstance(C60626ww.class, wwVar);
    }

    private C60626ww() {
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
                return newMessageInfo(f164481c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60625wv.f164480a});
            case 3:
                return new C60626ww();
            case 4:
                return new C60624wu();
            case 5:
                return f164481c;
            case 6:
                C63010eb ebVar = f164482d;
                if (ebVar == null) {
                    synchronized (C60626ww.class) {
                        ebVar = f164482d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164481c);
                            f164482d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
