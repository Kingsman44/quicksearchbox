package com.google.frameworks.client.p4630b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.b.d */
/* compiled from: PG */
public final class C61321d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61321d f165842b;

    /* renamed from: c */
    private static volatile C63010eb f165843c;

    /* renamed from: a */
    public C62971cq f165844a = emptyProtobufList();

    static {
        C61321d dVar = new C61321d();
        f165842b = dVar;
        C62942bv.registerDefaultInstance(C61321d.class, dVar);
    }

    private C61321d() {
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
                return newMessageInfo(f165842b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C61320c.class});
            case 3:
                return new C61321d();
            case 4:
                return new C61318a();
            case 5:
                return f165842b;
            case 6:
                C63010eb ebVar = f165843c;
                if (ebVar == null) {
                    synchronized (C61321d.class) {
                        ebVar = f165843c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165842b);
                            f165843c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
