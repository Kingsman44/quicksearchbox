package com.google.protos.p5121k.p5122a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.k.a.e */
/* compiled from: PG */
public final class C65589e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65589e f178266a;

    /* renamed from: c */
    private static volatile C63010eb f178267c;

    /* renamed from: b */
    private C62995dn f178268b = C62995dn.f170057a;

    static {
        C65589e eVar = new C65589e();
        f178266a = eVar;
        C62942bv.registerDefaultInstance(C65589e.class, eVar);
    }

    private C65589e() {
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
                return newMessageInfo(f178266a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C65588d.f178265a});
            case 3:
                return new C65589e();
            case 4:
                return new C65587c();
            case 5:
                return f178266a;
            case 6:
                C63010eb ebVar = f178267c;
                if (ebVar == null) {
                    synchronized (C65589e.class) {
                        ebVar = f178267c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178266a);
                            f178267c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
