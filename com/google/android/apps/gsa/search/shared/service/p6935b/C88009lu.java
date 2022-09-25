package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lu */
/* compiled from: PG */
public final class C88009lu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88009lu f237999d;

    /* renamed from: e */
    private static volatile C63010eb f238000e;

    /* renamed from: a */
    public int f238001a;

    /* renamed from: b */
    public int f238002b;

    /* renamed from: c */
    public int f238003c;

    static {
        C88009lu luVar = new C88009lu();
        f237999d = luVar;
        C62942bv.registerDefaultInstance(C88009lu.class, luVar);
    }

    private C88009lu() {
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
                return newMessageInfo(f237999d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88009lu();
            case 4:
                return new C88008lt();
            case 5:
                return f237999d;
            case 6:
                C63010eb ebVar = f238000e;
                if (ebVar == null) {
                    synchronized (C88009lu.class) {
                        ebVar = f238000e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237999d);
                            f238000e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
