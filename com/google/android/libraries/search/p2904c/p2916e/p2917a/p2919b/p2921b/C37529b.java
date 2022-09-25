package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.e.a.b.b.b */
/* compiled from: PG */
public final class C37529b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C37529b f99701e;

    /* renamed from: f */
    private static volatile C63010eb f99702f;

    /* renamed from: a */
    public int f99703a;

    /* renamed from: b */
    public int f99704b;

    /* renamed from: c */
    public int f99705c;

    /* renamed from: d */
    public long f99706d;

    static {
        C37529b bVar = new C37529b();
        f99701e = bVar;
        C62942bv.registerDefaultInstance(C37529b.class, bVar);
    }

    private C37529b() {
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
                return newMessageInfo(f99701e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, C37531d.m66538b(), "d"});
            case 3:
                return new C37529b();
            case 4:
                return new C37528a();
            case 5:
                return f99701e;
            case 6:
                C63010eb ebVar = f99702f;
                if (ebVar == null) {
                    synchronized (C37529b.class) {
                        ebVar = f99702f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99701e);
                            f99702f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
