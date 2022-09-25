package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.gs */
/* compiled from: PG */
public final class C51411gs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51411gs f133914b;

    /* renamed from: c */
    private static volatile C63010eb f133915c;

    /* renamed from: a */
    public C62971cq f133916a = emptyProtobufList();

    static {
        C51411gs gsVar = new C51411gs();
        f133914b = gsVar;
        C62942bv.registerDefaultInstance(C51411gs.class, gsVar);
    }

    private C51411gs() {
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
                return newMessageInfo(f133914b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51408gp.class});
            case 3:
                return new C51411gs();
            case 4:
                return new C51409gq();
            case 5:
                return f133914b;
            case 6:
                C63010eb ebVar = f133915c;
                if (ebVar == null) {
                    synchronized (C51411gs.class) {
                        ebVar = f133915c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133914b);
                            f133915c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
