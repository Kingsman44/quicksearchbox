package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.l */
/* compiled from: PG */
public final class C50909l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50909l f132544c;

    /* renamed from: d */
    private static volatile C63010eb f132545d;

    /* renamed from: a */
    public int f132546a = 0;

    /* renamed from: b */
    public Object f132547b;

    static {
        C50909l lVar = new C50909l();
        f132544c = lVar;
        C62942bv.registerDefaultInstance(C50909l.class, lVar);
    }

    private C50909l() {
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
                return newMessageInfo(f132544c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003်\u0000\u0004်\u0000\u0005ျ\u0000\u0006ျ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C50913p.class});
            case 3:
                return new C50909l();
            case 4:
                return new C50908k();
            case 5:
                return f132544c;
            case 6:
                C63010eb ebVar = f132545d;
                if (ebVar == null) {
                    synchronized (C50909l.class) {
                        ebVar = f132545d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132544c);
                            f132545d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
