package com.google.assistant.p3858ar.p3859a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.o */
/* compiled from: PG */
public final class C49725o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49725o f128335b;

    /* renamed from: c */
    private static volatile C63010eb f128336c;

    /* renamed from: a */
    public C62971cq f128337a = C62942bv.emptyProtobufList();

    static {
        C49725o oVar = new C49725o();
        f128335b = oVar;
        C62942bv.registerDefaultInstance(C49725o.class, oVar);
    }

    private C49725o() {
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
                return newMessageInfo(f128335b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C49725o();
            case 4:
                return new C49724n();
            case 5:
                return f128335b;
            case 6:
                C63010eb ebVar = f128336c;
                if (ebVar == null) {
                    synchronized (C49725o.class) {
                        ebVar = f128336c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128335b);
                            f128336c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
