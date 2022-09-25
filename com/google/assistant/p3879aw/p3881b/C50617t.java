package com.google.assistant.p3879aw.p3881b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.t */
/* compiled from: PG */
public final class C50617t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50617t f131689a;

    /* renamed from: c */
    private static volatile C63010eb f131690c;

    /* renamed from: b */
    private C62995dn f131691b = C62995dn.f170057a;

    static {
        C50617t tVar = new C50617t();
        f131689a = tVar;
        C62942bv.registerDefaultInstance(C50617t.class, tVar);
    }

    private C50617t() {
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
                return newMessageInfo(f131689a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", C50616s.f131688a});
            case 3:
                return new C50617t();
            case 4:
                return new C50615r();
            case 5:
                return f131689a;
            case 6:
                C63010eb ebVar = f131690c;
                if (ebVar == null) {
                    synchronized (C50617t.class) {
                        ebVar = f131690c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131689a);
                            f131690c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
