package com.google.android.apps.gsa.staticplugins.p7401ao;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.ao.d */
/* compiled from: PG */
public final class C94027d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C94027d f262662b;

    /* renamed from: c */
    private static volatile C63010eb f262663c;

    /* renamed from: a */
    public C62971cq f262664a = emptyProtobufList();

    static {
        C94027d dVar = new C94027d();
        f262662b = dVar;
        C62942bv.registerDefaultInstance(C94027d.class, dVar);
    }

    private C94027d() {
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
                return newMessageInfo(f262662b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C94029f.class});
            case 3:
                return new C94027d();
            case 4:
                return new C94026c();
            case 5:
                return f262662b;
            case 6:
                C63010eb ebVar = f262663c;
                if (ebVar == null) {
                    synchronized (C94027d.class) {
                        ebVar = f262663c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f262662b);
                            f262663c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
