package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.ac */
/* compiled from: PG */
public final class C65704ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65704ac f178511b;

    /* renamed from: c */
    private static volatile C63010eb f178512c;

    /* renamed from: a */
    public C62971cq f178513a = emptyProtobufList();

    static {
        C65704ac acVar = new C65704ac();
        f178511b = acVar;
        C62942bv.registerDefaultInstance(C65704ac.class, acVar);
    }

    private C65704ac() {
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
                return newMessageInfo(f178511b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65703ab.class});
            case 3:
                return new C65704ac();
            case 4:
                return new C65741z();
            case 5:
                return f178511b;
            case 6:
                C63010eb ebVar = f178512c;
                if (ebVar == null) {
                    synchronized (C65704ac.class) {
                        ebVar = f178512c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178511b);
                            f178512c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
