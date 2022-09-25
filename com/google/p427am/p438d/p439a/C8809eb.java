package com.google.p427am.p438d.p439a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.eb */
/* compiled from: PG */
public final class C8809eb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8809eb f30193d;

    /* renamed from: e */
    private static volatile C63010eb f30194e;

    /* renamed from: a */
    public int f30195a;

    /* renamed from: b */
    public int f30196b;

    /* renamed from: c */
    public C8804dx f30197c;

    static {
        C8809eb ebVar = new C8809eb();
        f30193d = ebVar;
        C62942bv.registerDefaultInstance(C8809eb.class, ebVar);
    }

    private C8809eb() {
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
                return newMessageInfo(f30193d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u000b\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8809eb();
            case 4:
                return new C8808ea();
            case 5:
                return f30193d;
            case 6:
                C63010eb ebVar = f30194e;
                if (ebVar == null) {
                    synchronized (C8809eb.class) {
                        ebVar = f30194e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30193d);
                            f30194e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
