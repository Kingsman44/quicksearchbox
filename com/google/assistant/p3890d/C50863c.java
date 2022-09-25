package com.google.assistant.p3890d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.d.c */
/* compiled from: PG */
public final class C50863c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50863c f132437b;

    /* renamed from: c */
    private static volatile C63010eb f132438c;

    /* renamed from: a */
    public C62995dn f132439a = C62995dn.f170057a;

    static {
        C50863c cVar = new C50863c();
        f132437b = cVar;
        C62942bv.registerDefaultInstance(C50863c.class, cVar);
    }

    private C50863c() {
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
                return newMessageInfo(f132437b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C50860b.f132432a});
            case 3:
                return new C50863c();
            case 4:
                return new C50855a();
            case 5:
                return f132437b;
            case 6:
                C63010eb ebVar = f132438c;
                if (ebVar == null) {
                    synchronized (C50863c.class) {
                        ebVar = f132438c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132437b);
                            f132438c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
