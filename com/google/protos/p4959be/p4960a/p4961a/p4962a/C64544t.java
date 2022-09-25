package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.t */
/* compiled from: PG */
public final class C64544t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64544t f175043d;

    /* renamed from: e */
    private static volatile C63010eb f175044e;

    /* renamed from: a */
    public C64543s f175045a;

    /* renamed from: b */
    public int f175046b;

    /* renamed from: c */
    public C62961ch f175047c = emptyIntList();

    static {
        C64544t tVar = new C64544t();
        f175043d = tVar;
        C62942bv.registerDefaultInstance(C64544t.class, tVar);
    }

    private C64544t() {
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
                return newMessageInfo(f175043d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\t\u0003\f\u0004,", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64544t();
            case 4:
                return new C64541q();
            case 5:
                return f175043d;
            case 6:
                C63010eb ebVar = f175044e;
                if (ebVar == null) {
                    synchronized (C64544t.class) {
                        ebVar = f175044e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175043d);
                            f175044e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
