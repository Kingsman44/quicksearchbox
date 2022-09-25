package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gz */
/* compiled from: PG */
public final class C66990gz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66990gz f182089a;

    /* renamed from: c */
    private static volatile C63010eb f182090c;

    /* renamed from: b */
    private C62995dn f182091b = C62995dn.f170057a;

    static {
        C66990gz gzVar = new C66990gz();
        f182089a = gzVar;
        C62942bv.registerDefaultInstance(C66990gz.class, gzVar);
    }

    private C66990gz() {
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
                return newMessageInfo(f182089a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C66989gy.f182088a});
            case 3:
                return new C66990gz();
            case 4:
                return new C66988gx();
            case 5:
                return f182089a;
            case 6:
                C63010eb ebVar = f182090c;
                if (ebVar == null) {
                    synchronized (C66990gz.class) {
                        ebVar = f182090c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182089a);
                            f182090c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
