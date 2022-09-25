package com.google.android.apps.gsa.shared.p6986aj;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aj.d */
/* compiled from: PG */
public final class C89185d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C89185d f241801b;

    /* renamed from: c */
    private static volatile C63010eb f241802c;

    /* renamed from: a */
    public C62971cq f241803a = emptyProtobufList();

    static {
        C89185d dVar = new C89185d();
        f241801b = dVar;
        C62942bv.registerDefaultInstance(C89185d.class, dVar);
    }

    private C89185d() {
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
                return newMessageInfo(f241801b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C89184c.class});
            case 3:
                return new C89185d();
            case 4:
                return new C89182a();
            case 5:
                return f241801b;
            case 6:
                C63010eb ebVar = f241802c;
                if (ebVar == null) {
                    synchronized (C89185d.class) {
                        ebVar = f241802c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241801b);
                            f241802c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
