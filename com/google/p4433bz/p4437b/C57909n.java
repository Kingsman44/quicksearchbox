package com.google.p4433bz.p4437b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.b.n */
/* compiled from: PG */
public final class C57909n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57909n f154891b;

    /* renamed from: c */
    private static volatile C63010eb f154892c;

    /* renamed from: a */
    public C62971cq f154893a = emptyProtobufList();

    static {
        C57909n nVar = new C57909n();
        f154891b = nVar;
        C62942bv.registerDefaultInstance(C57909n.class, nVar);
    }

    private C57909n() {
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
                return newMessageInfo(f154891b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57907l.class});
            case 3:
                return new C57909n();
            case 4:
                return new C57908m();
            case 5:
                return f154891b;
            case 6:
                C63010eb ebVar = f154892c;
                if (ebVar == null) {
                    synchronized (C57909n.class) {
                        ebVar = f154892c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154891b);
                            f154892c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
