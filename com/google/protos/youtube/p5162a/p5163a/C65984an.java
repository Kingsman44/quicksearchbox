package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.an */
/* compiled from: PG */
public final class C65984an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65984an f179462a;

    /* renamed from: b */
    private static volatile C63010eb f179463b;

    static {
        C65984an anVar = new C65984an();
        f179462a = anVar;
        C62942bv.registerDefaultInstance(C65984an.class, anVar);
    }

    private C65984an() {
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
                return newMessageInfo(f179462a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65984an();
            case 4:
                return new C65983am();
            case 5:
                return f179462a;
            case 6:
                C63010eb ebVar = f179463b;
                if (ebVar == null) {
                    synchronized (C65984an.class) {
                        ebVar = f179463b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179462a);
                            f179463b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
