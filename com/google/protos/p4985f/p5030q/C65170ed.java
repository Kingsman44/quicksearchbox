package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ed */
/* compiled from: PG */
public final class C65170ed extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65170ed f176372b;

    /* renamed from: c */
    private static volatile C63010eb f176373c;

    /* renamed from: a */
    public C62971cq f176374a = emptyProtobufList();

    static {
        C65170ed edVar = new C65170ed();
        f176372b = edVar;
        C62942bv.registerDefaultInstance(C65170ed.class, edVar);
    }

    private C65170ed() {
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
                return newMessageInfo(f176372b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65168eb.class});
            case 3:
                return new C65170ed();
            case 4:
                return new C65169ec();
            case 5:
                return f176372b;
            case 6:
                C63010eb ebVar = f176373c;
                if (ebVar == null) {
                    synchronized (C65170ed.class) {
                        ebVar = f176373c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176372b);
                            f176373c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
