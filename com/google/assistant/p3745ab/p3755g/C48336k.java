package com.google.assistant.p3745ab.p3755g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.g.k */
/* compiled from: PG */
public final class C48336k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48336k f124989d;

    /* renamed from: e */
    private static volatile C63010eb f124990e;

    /* renamed from: a */
    public int f124991a;

    /* renamed from: b */
    public int f124992b;

    /* renamed from: c */
    public int f124993c;

    static {
        C48336k kVar = new C48336k();
        f124989d = kVar;
        C62942bv.registerDefaultInstance(C48336k.class, kVar);
    }

    private C48336k() {
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
                return newMessageInfo(f124989d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48336k();
            case 4:
                return new C48335j();
            case 5:
                return f124989d;
            case 6:
                C63010eb ebVar = f124990e;
                if (ebVar == null) {
                    synchronized (C48336k.class) {
                        ebVar = f124990e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124989d);
                            f124990e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
