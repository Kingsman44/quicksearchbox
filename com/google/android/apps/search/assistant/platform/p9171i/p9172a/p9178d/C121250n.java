package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.n */
/* compiled from: PG */
public final class C121250n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121250n f336801b;

    /* renamed from: c */
    private static volatile C63010eb f336802c;

    /* renamed from: a */
    public C62971cq f336803a = emptyProtobufList();

    static {
        C121250n nVar = new C121250n();
        f336801b = nVar;
        C62942bv.registerDefaultInstance(C121250n.class, nVar);
    }

    private C121250n() {
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
                return newMessageInfo(f336801b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C121248l.class});
            case 3:
                return new C121250n();
            case 4:
                return new C121249m();
            case 5:
                return f336801b;
            case 6:
                C63010eb ebVar = f336802c;
                if (ebVar == null) {
                    synchronized (C121250n.class) {
                        ebVar = f336802c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336801b);
                            f336802c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
