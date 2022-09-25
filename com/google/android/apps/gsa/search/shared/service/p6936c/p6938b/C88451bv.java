package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.bv */
/* compiled from: PG */
public final class C88451bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88451bv f239122c;

    /* renamed from: d */
    private static volatile C63010eb f239123d;

    /* renamed from: a */
    public int f239124a = 0;

    /* renamed from: b */
    public Object f239125b;

    static {
        C88451bv bvVar = new C88451bv();
        f239122c = bvVar;
        C62942bv.registerDefaultInstance(C88451bv.class, bvVar);
    }

    private C88451bv() {
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
                return newMessageInfo(f239122c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဿ\u0000\u0002်\u0000\u0003်\u0000\u0004်\u0000", new Object[]{"b", "a", C88448bs.f239121a});
            case 3:
                return new C88451bv();
            case 4:
                return new C88450bu();
            case 5:
                return f239122c;
            case 6:
                C63010eb ebVar = f239123d;
                if (ebVar == null) {
                    synchronized (C88451bv.class) {
                        ebVar = f239123d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239122c);
                            f239123d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
