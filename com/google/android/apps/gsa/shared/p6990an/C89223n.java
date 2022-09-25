package com.google.android.apps.gsa.shared.p6990an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.an.n */
/* compiled from: PG */
public final class C89223n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C89223n f241914b;

    /* renamed from: c */
    private static volatile C63010eb f241915c;

    /* renamed from: a */
    public C62971cq f241916a = emptyProtobufList();

    static {
        C89223n nVar = new C89223n();
        f241914b = nVar;
        C62942bv.registerDefaultInstance(C89223n.class, nVar);
    }

    private C89223n() {
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
                return newMessageInfo(f241914b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C89222m.class});
            case 3:
                return new C89223n();
            case 4:
                return new C89216g();
            case 5:
                return f241914b;
            case 6:
                C63010eb ebVar = f241915c;
                if (ebVar == null) {
                    synchronized (C89223n.class) {
                        ebVar = f241915c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241914b);
                            f241915c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
