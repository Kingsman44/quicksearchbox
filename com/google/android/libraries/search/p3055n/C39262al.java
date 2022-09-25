package com.google.android.libraries.search.p3055n;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.al */
/* compiled from: PG */
public final class C39262al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39262al f103422d;

    /* renamed from: e */
    private static volatile C63010eb f103423e;

    /* renamed from: a */
    public int f103424a;

    /* renamed from: b */
    public C37462ck f103425b;

    /* renamed from: c */
    public C37360ay f103426c;

    static {
        C39262al alVar = new C39262al();
        f103422d = alVar;
        C62942bv.registerDefaultInstance(C39262al.class, alVar);
    }

    private C39262al() {
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
                return newMessageInfo(f103422d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C39262al();
            case 4:
                return new C39261ak();
            case 5:
                return f103422d;
            case 6:
                C63010eb ebVar = f103423e;
                if (ebVar == null) {
                    synchronized (C39262al.class) {
                        ebVar = f103423e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103422d);
                            f103423e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
