package com.google.protos.p4813ah.p4814a.p4815a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ah.a.a.n */
/* compiled from: PG */
public final class C63181n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63181n f170592b;

    /* renamed from: c */
    private static volatile C63010eb f170593c;

    /* renamed from: a */
    public C62971cq f170594a = emptyProtobufList();

    static {
        C63181n nVar = new C63181n();
        f170592b = nVar;
        C62942bv.registerDefaultInstance(C63181n.class, nVar);
    }

    private C63181n() {
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
                return newMessageInfo(f170592b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63179l.class});
            case 3:
                return new C63181n();
            case 4:
                return new C63180m();
            case 5:
                return f170592b;
            case 6:
                C63010eb ebVar = f170593c;
                if (ebVar == null) {
                    synchronized (C63181n.class) {
                        ebVar = f170593c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170592b);
                            f170593c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
