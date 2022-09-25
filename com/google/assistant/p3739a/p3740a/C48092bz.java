package com.google.assistant.p3739a.p3740a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.bz */
/* compiled from: PG */
public final class C48092bz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48092bz f124458d;

    /* renamed from: e */
    private static volatile C63010eb f124459e;

    /* renamed from: a */
    public int f124460a;

    /* renamed from: b */
    public int f124461b;

    /* renamed from: c */
    public C63088z f124462c = C63088z.f170246b;

    static {
        C48092bz bzVar = new C48092bz();
        f124458d = bzVar;
        C62942bv.registerDefaultInstance(C48092bz.class, bzVar);
    }

    private C48092bz() {
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
                return newMessageInfo(f124458d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48092bz();
            case 4:
                return new C48091by();
            case 5:
                return f124458d;
            case 6:
                C63010eb ebVar = f124459e;
                if (ebVar == null) {
                    synchronized (C48092bz.class) {
                        ebVar = f124459e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124458d);
                            f124459e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
