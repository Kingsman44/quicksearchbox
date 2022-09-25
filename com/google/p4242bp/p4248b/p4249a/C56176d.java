package com.google.p4242bp.p4248b.p4249a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.b.a.d */
/* compiled from: PG */
public final class C56176d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56176d f149674b;

    /* renamed from: c */
    private static volatile C63010eb f149675c;

    /* renamed from: a */
    public C62971cq f149676a = emptyProtobufList();

    static {
        C56176d dVar = new C56176d();
        f149674b = dVar;
        C62942bv.registerDefaultInstance(C56176d.class, dVar);
    }

    private C56176d() {
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
                return newMessageInfo(f149674b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56175c.class});
            case 3:
                return new C56176d();
            case 4:
                return new C56173a();
            case 5:
                return f149674b;
            case 6:
                C63010eb ebVar = f149675c;
                if (ebVar == null) {
                    synchronized (C56176d.class) {
                        ebVar = f149675c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149674b);
                            f149675c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
