package com.google.android.libraries.search.p2871b.p2898l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.b.l.d */
/* compiled from: PG */
public final class C37279d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C37279d f99061e;

    /* renamed from: f */
    private static volatile C63010eb f99062f;

    /* renamed from: a */
    public int f99063a;

    /* renamed from: b */
    public int f99064b;

    /* renamed from: c */
    public int f99065c;

    /* renamed from: d */
    public int f99066d;

    static {
        C37279d dVar = new C37279d();
        f99061e = dVar;
        C62942bv.registerDefaultInstance(C37279d.class, dVar);
    }

    private C37279d() {
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
                return newMessageInfo(f99061e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C37279d();
            case 4:
                return new C37278c();
            case 5:
                return f99061e;
            case 6:
                C63010eb ebVar = f99062f;
                if (ebVar == null) {
                    synchronized (C37279d.class) {
                        ebVar = f99062f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99061e);
                            f99062f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
