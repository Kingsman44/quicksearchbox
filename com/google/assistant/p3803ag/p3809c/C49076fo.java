package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.fo */
/* compiled from: PG */
public final class C49076fo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49076fo f126934b;

    /* renamed from: c */
    private static volatile C63010eb f126935c;

    /* renamed from: a */
    public C62995dn f126936a = C62995dn.f170057a;

    static {
        C49076fo foVar = new C49076fo();
        f126934b = foVar;
        C62942bv.registerDefaultInstance(C49076fo.class, foVar);
    }

    private C49076fo() {
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
                return newMessageInfo(f126934b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C49075fn.f126933a});
            case 3:
                return new C49076fo();
            case 4:
                return new C49074fm();
            case 5:
                return f126934b;
            case 6:
                C63010eb ebVar = f126935c;
                if (ebVar == null) {
                    synchronized (C49076fo.class) {
                        ebVar = f126935c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126934b);
                            f126935c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
