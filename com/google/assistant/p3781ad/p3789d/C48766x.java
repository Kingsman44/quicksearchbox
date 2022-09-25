package com.google.assistant.p3781ad.p3789d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.x */
/* compiled from: PG */
public final class C48766x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48766x f126186a;

    /* renamed from: c */
    private static volatile C63010eb f126187c;

    /* renamed from: b */
    private C62995dn f126188b = C62995dn.f170057a;

    static {
        C48766x xVar = new C48766x();
        f126186a = xVar;
        C62942bv.registerDefaultInstance(C48766x.class, xVar);
    }

    private C48766x() {
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
                return newMessageInfo(f126186a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C48765w.f126185a});
            case 3:
                return new C48766x();
            case 4:
                return new C48764v();
            case 5:
                return f126186a;
            case 6:
                C63010eb ebVar = f126187c;
                if (ebVar == null) {
                    synchronized (C48766x.class) {
                        ebVar = f126187c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126186a);
                            f126187c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
