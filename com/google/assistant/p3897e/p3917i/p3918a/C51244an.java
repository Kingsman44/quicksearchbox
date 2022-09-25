package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.an */
/* compiled from: PG */
public final class C51244an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51244an f133412b;

    /* renamed from: c */
    private static volatile C63010eb f133413c;

    /* renamed from: a */
    public C62995dn f133414a = C62995dn.f170057a;

    static {
        C51244an anVar = new C51244an();
        f133412b = anVar;
        C62942bv.registerDefaultInstance(C51244an.class, anVar);
    }

    private C51244an() {
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
                return newMessageInfo(f133412b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C51243am.f133411a});
            case 3:
                return new C51244an();
            case 4:
                return new C51242al();
            case 5:
                return f133412b;
            case 6:
                C63010eb ebVar = f133413c;
                if (ebVar == null) {
                    synchronized (C51244an.class) {
                        ebVar = f133413c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133412b);
                            f133413c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
