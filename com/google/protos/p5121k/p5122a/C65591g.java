package com.google.protos.p5121k.p5122a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.k.a.g */
/* compiled from: PG */
public final class C65591g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65591g f178269a;

    /* renamed from: c */
    private static volatile C63010eb f178270c;

    /* renamed from: b */
    private C65589e f178271b;

    static {
        C65591g gVar = new C65591g();
        f178269a = gVar;
        C62942bv.registerDefaultInstance(C65591g.class, gVar);
    }

    private C65591g() {
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
                return newMessageInfo(f178269a, "\u0000\u0001\u0000\u0000\u0007\u0007\u0001\u0000\u0000\u0000\u0007\t", new Object[]{"b"});
            case 3:
                return new C65591g();
            case 4:
                return new C65590f();
            case 5:
                return f178269a;
            case 6:
                C63010eb ebVar = f178270c;
                if (ebVar == null) {
                    synchronized (C65591g.class) {
                        ebVar = f178270c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178269a);
                            f178270c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
