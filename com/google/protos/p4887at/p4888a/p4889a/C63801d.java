package com.google.protos.p4887at.p4888a.p4889a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.at.a.a.d */
/* compiled from: PG */
public final class C63801d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63801d f172567c;

    /* renamed from: d */
    private static volatile C63010eb f172568d;

    /* renamed from: a */
    public int f172569a = 0;

    /* renamed from: b */
    public Object f172570b;

    static {
        C63801d dVar = new C63801d();
        f172567c = dVar;
        C62942bv.registerDefaultInstance(C63801d.class, dVar);
    }

    private C63801d() {
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
                return newMessageInfo(f172567c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C63811n.class});
            case 3:
                return new C63801d();
            case 4:
                return new C63800c();
            case 5:
                return f172567c;
            case 6:
                C63010eb ebVar = f172568d;
                if (ebVar == null) {
                    synchronized (C63801d.class) {
                        ebVar = f172568d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172567c);
                            f172568d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
