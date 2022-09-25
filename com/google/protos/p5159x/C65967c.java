package com.google.protos.p5159x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.x.c */
/* compiled from: PG */
public final class C65967c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65967c f179435a;

    /* renamed from: c */
    private static volatile C63010eb f179436c;

    /* renamed from: b */
    private C62995dn f179437b = C62995dn.f170057a;

    static {
        C65967c cVar = new C65967c();
        f179435a = cVar;
        C62942bv.registerDefaultInstance(C65967c.class, cVar);
    }

    private C65967c() {
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
                return newMessageInfo(f179435a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C65966b.f179434a});
            case 3:
                return new C65967c();
            case 4:
                return new C65965a();
            case 5:
                return f179435a;
            case 6:
                C63010eb ebVar = f179436c;
                if (ebVar == null) {
                    synchronized (C65967c.class) {
                        ebVar = f179436c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179435a);
                            f179436c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
