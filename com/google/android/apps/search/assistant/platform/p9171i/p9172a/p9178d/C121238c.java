package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.c */
/* compiled from: PG */
public final class C121238c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121238c f336777b;

    /* renamed from: c */
    private static volatile C63010eb f336778c;

    /* renamed from: a */
    public C62995dn f336779a = C62995dn.f170057a;

    static {
        C121238c cVar = new C121238c();
        f336777b = cVar;
        C62942bv.registerDefaultInstance(C121238c.class, cVar);
    }

    private C121238c() {
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
                return newMessageInfo(f336777b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C121221b.f336748a});
            case 3:
                return new C121238c();
            case 4:
                return new C121212a();
            case 5:
                return f336777b;
            case 6:
                C63010eb ebVar = f336778c;
                if (ebVar == null) {
                    synchronized (C121238c.class) {
                        ebVar = f336778c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336777b);
                            f336778c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
