package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.ap */
/* compiled from: PG */
public final class C38233ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38233ap f101324d;

    /* renamed from: e */
    private static volatile C63010eb f101325e;

    /* renamed from: a */
    public int f101326a;

    /* renamed from: b */
    public C37639gr f101327b;

    /* renamed from: c */
    public C37679hz f101328c;

    static {
        C38233ap apVar = new C38233ap();
        f101324d = apVar;
        C62942bv.registerDefaultInstance(C38233ap.class, apVar);
    }

    private C38233ap() {
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
                return newMessageInfo(f101324d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38233ap();
            case 4:
                return new C38232ao();
            case 5:
                return f101324d;
            case 6:
                C63010eb ebVar = f101325e;
                if (ebVar == null) {
                    synchronized (C38233ap.class) {
                        ebVar = f101325e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101324d);
                            f101325e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
