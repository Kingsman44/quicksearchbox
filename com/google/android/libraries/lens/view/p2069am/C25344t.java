package com.google.android.libraries.lens.view.p2069am;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.t */
/* compiled from: PG */
public final class C25344t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C25344t f68987f;

    /* renamed from: g */
    private static volatile C63010eb f68988g;

    /* renamed from: a */
    public int f68989a;

    /* renamed from: b */
    public int f68990b;

    /* renamed from: c */
    public int f68991c;

    /* renamed from: d */
    public int f68992d;

    /* renamed from: e */
    public int f68993e;

    static {
        C25344t tVar = new C25344t();
        f68987f = tVar;
        C62942bv.registerDefaultInstance(C25344t.class, tVar);
    }

    private C25344t() {
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
                return newMessageInfo(f68987f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C25344t();
            case 4:
                return new C25343s();
            case 5:
                return f68987f;
            case 6:
                C63010eb ebVar = f68988g;
                if (ebVar == null) {
                    synchronized (C25344t.class) {
                        ebVar = f68988g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68987f);
                            f68988g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
