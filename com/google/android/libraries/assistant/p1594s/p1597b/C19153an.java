package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.an */
/* compiled from: PG */
public final class C19153an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19153an f53644b;

    /* renamed from: c */
    private static volatile C63010eb f53645c;

    /* renamed from: a */
    public C62971cq f53646a = emptyProtobufList();

    static {
        C19153an anVar = new C19153an();
        f53644b = anVar;
        C62942bv.registerDefaultInstance(C19153an.class, anVar);
    }

    private C19153an() {
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
                return newMessageInfo(f53644b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19152am.class});
            case 3:
                return new C19153an();
            case 4:
                return new C19150ak();
            case 5:
                return f53644b;
            case 6:
                C63010eb ebVar = f53645c;
                if (ebVar == null) {
                    synchronized (C19153an.class) {
                        ebVar = f53645c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53644b);
                            f53645c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
