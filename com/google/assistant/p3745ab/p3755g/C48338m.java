package com.google.assistant.p3745ab.p3755g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.g.m */
/* compiled from: PG */
public final class C48338m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48338m f124994d;

    /* renamed from: e */
    private static volatile C63010eb f124995e;

    /* renamed from: a */
    public C48336k f124996a;

    /* renamed from: b */
    public C48336k f124997b;

    /* renamed from: c */
    public C48336k f124998c;

    static {
        C48338m mVar = new C48338m();
        f124994d = mVar;
        C62942bv.registerDefaultInstance(C48338m.class, mVar);
    }

    private C48338m() {
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
                return newMessageInfo(f124994d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003\t\u0004\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48338m();
            case 4:
                return new C48337l();
            case 5:
                return f124994d;
            case 6:
                C63010eb ebVar = f124995e;
                if (ebVar == null) {
                    synchronized (C48338m.class) {
                        ebVar = f124995e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124994d);
                            f124995e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
