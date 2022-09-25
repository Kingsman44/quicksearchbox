package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.fr */
/* compiled from: PG */
public final class C142447fr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C142447fr f386529e;

    /* renamed from: f */
    private static volatile C63010eb f386530f;

    /* renamed from: a */
    public int f386531a;

    /* renamed from: b */
    public boolean f386532b;

    /* renamed from: c */
    public boolean f386533c;

    /* renamed from: d */
    public int f386534d;

    static {
        C142447fr frVar = new C142447fr();
        f386529e = frVar;
        C62942bv.registerDefaultInstance(C142447fr.class, frVar);
    }

    private C142447fr() {
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
                return newMessageInfo(f386529e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C142447fr();
            case 4:
                return new C142446fq();
            case 5:
                return f386529e;
            case 6:
                C63010eb ebVar = f386530f;
                if (ebVar == null) {
                    synchronized (C142447fr.class) {
                        ebVar = f386530f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386529e);
                            f386530f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
