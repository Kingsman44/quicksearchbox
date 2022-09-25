package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.el */
/* compiled from: PG */
public final class C7639el extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7639el f26392b;

    /* renamed from: c */
    private static volatile C63010eb f26393c;

    /* renamed from: a */
    public C62971cq f26394a = emptyProtobufList();

    static {
        C7639el elVar = new C7639el();
        f26392b = elVar;
        C62942bv.registerDefaultInstance(C7639el.class, elVar);
    }

    private C7639el() {
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
                return newMessageInfo(f26392b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C7637ej.class});
            case 3:
                return new C7639el();
            case 4:
                return new C7638ek();
            case 5:
                return f26392b;
            case 6:
                C63010eb ebVar = f26393c;
                if (ebVar == null) {
                    synchronized (C7639el.class) {
                        ebVar = f26393c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26392b);
                            f26393c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
