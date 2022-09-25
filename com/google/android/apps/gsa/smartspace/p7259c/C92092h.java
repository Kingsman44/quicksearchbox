package com.google.android.apps.gsa.smartspace.p7259c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.smartspace.c.h */
/* compiled from: PG */
public final class C92092h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C92092h f256732d;

    /* renamed from: e */
    private static volatile C63010eb f256733e;

    /* renamed from: a */
    public int f256734a;

    /* renamed from: b */
    public int f256735b = 1;

    /* renamed from: c */
    public long f256736c;

    static {
        C92092h hVar = new C92092h();
        f256732d = hVar;
        C62942bv.registerDefaultInstance(C92092h.class, hVar);
    }

    private C92092h() {
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
                return newMessageInfo(f256732d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C92090f.f256731a, C45240c.f118157a});
            case 3:
                return new C92092h();
            case 4:
                return new C92089e();
            case 5:
                return f256732d;
            case 6:
                C63010eb ebVar = f256733e;
                if (ebVar == null) {
                    synchronized (C92092h.class) {
                        ebVar = f256733e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256732d);
                            f256733e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
