package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.h */
/* compiled from: PG */
public final class C44234h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C44234h f115032a;

    /* renamed from: c */
    private static volatile C63010eb f115033c;

    /* renamed from: b */
    private C62995dn f115034b = C62995dn.f170057a;

    static {
        C44234h hVar = new C44234h();
        f115032a = hVar;
        C62942bv.registerDefaultInstance(C44234h.class, hVar);
    }

    private C44234h() {
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
                return newMessageInfo(f115032a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C44233g.f115031a});
            case 3:
                return new C44234h();
            case 4:
                return new C44232f();
            case 5:
                return f115032a;
            case 6:
                C63010eb ebVar = f115033c;
                if (ebVar == null) {
                    synchronized (C44234h.class) {
                        ebVar = f115033c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f115032a);
                            f115033c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
