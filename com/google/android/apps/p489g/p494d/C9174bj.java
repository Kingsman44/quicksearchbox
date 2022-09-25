package com.google.android.apps.p489g.p494d;

import com.google.p375ai.p378b.C7818lb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.bj */
/* compiled from: PG */
public final class C9174bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9174bj f31688c;

    /* renamed from: d */
    private static volatile C63010eb f31689d;

    /* renamed from: a */
    public C62971cq f31690a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f31691b = emptyProtobufList();

    static {
        C9174bj bjVar = new C9174bj();
        f31688c = bjVar;
        C62942bv.registerDefaultInstance(C9174bj.class, bjVar);
    }

    private C9174bj() {
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
                return newMessageInfo(f31688c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C7818lb.class, "b", C7818lb.class});
            case 3:
                return new C9174bj();
            case 4:
                return new C9173bi();
            case 5:
                return f31688c;
            case 6:
                C63010eb ebVar = f31689d;
                if (ebVar == null) {
                    synchronized (C9174bj.class) {
                        ebVar = f31689d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31688c);
                            f31689d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
