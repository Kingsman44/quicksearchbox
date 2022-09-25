package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.da */
/* compiled from: PG */
public final class C51894da extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51894da f136125b;

    /* renamed from: c */
    private static volatile C63010eb f136126c;

    /* renamed from: a */
    public C62971cq f136127a = emptyProtobufList();

    static {
        C51894da daVar = new C51894da();
        f136125b = daVar;
        C62942bv.registerDefaultInstance(C51894da.class, daVar);
    }

    private C51894da() {
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
                return newMessageInfo(f136125b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51891cy.class});
            case 3:
                return new C51894da();
            case 4:
                return new C51892cz();
            case 5:
                return f136125b;
            case 6:
                C63010eb ebVar = f136126c;
                if (ebVar == null) {
                    synchronized (C51894da.class) {
                        ebVar = f136126c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136125b);
                            f136126c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
