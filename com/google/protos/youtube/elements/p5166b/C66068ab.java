package com.google.protos.youtube.elements.p5166b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.ab */
/* compiled from: PG */
public final class C66068ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66068ab f179665b;

    /* renamed from: c */
    private static volatile C63010eb f179666c;

    /* renamed from: a */
    public C62971cq f179667a = emptyProtobufList();

    static {
        C66068ab abVar = new C66068ab();
        f179665b = abVar;
        C62942bv.registerDefaultInstance(C66068ab.class, abVar);
    }

    private C66068ab() {
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
                return newMessageInfo(f179665b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66117v.class});
            case 3:
                return new C66068ab();
            case 4:
                return new C66067aa();
            case 5:
                return f179665b;
            case 6:
                C63010eb ebVar = f179666c;
                if (ebVar == null) {
                    synchronized (C66068ab.class) {
                        ebVar = f179666c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179665b);
                            f179666c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
