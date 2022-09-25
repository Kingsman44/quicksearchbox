package com.google.p4117aw.p4118a.p4119a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.n */
/* compiled from: PG */
public final class C54636n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54636n f143450b;

    /* renamed from: c */
    private static volatile C63010eb f143451c;

    /* renamed from: a */
    public C62971cq f143452a = emptyProtobufList();

    static {
        C54636n nVar = new C54636n();
        f143450b = nVar;
        C62942bv.registerDefaultInstance(C54636n.class, nVar);
    }

    private C54636n() {
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
                return newMessageInfo(f143450b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54635m.class});
            case 3:
                return new C54636n();
            case 4:
                return new C54631i();
            case 5:
                return f143450b;
            case 6:
                C63010eb ebVar = f143451c;
                if (ebVar == null) {
                    synchronized (C54636n.class) {
                        ebVar = f143451c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143450b);
                            f143451c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
