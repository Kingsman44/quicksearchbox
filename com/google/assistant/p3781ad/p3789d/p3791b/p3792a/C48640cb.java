package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.cb */
/* compiled from: PG */
public final class C48640cb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48640cb f125717b;

    /* renamed from: c */
    private static volatile C63010eb f125718c;

    /* renamed from: a */
    public C62971cq f125719a = emptyProtobufList();

    static {
        C48640cb cbVar = new C48640cb();
        f125717b = cbVar;
        C62942bv.registerDefaultInstance(C48640cb.class, cbVar);
    }

    private C48640cb() {
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
                return newMessageInfo(f125717b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48639ca.class});
            case 3:
                return new C48640cb();
            case 4:
                return new C48636by();
            case 5:
                return f125717b;
            case 6:
                C63010eb ebVar = f125718c;
                if (ebVar == null) {
                    synchronized (C48640cb.class) {
                        ebVar = f125718c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125717b);
                            f125718c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
