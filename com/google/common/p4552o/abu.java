package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.abu */
/* compiled from: PG */
public final class abu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final abu f158230f;

    /* renamed from: g */
    private static volatile C63010eb f158231g;

    /* renamed from: a */
    public int f158232a;

    /* renamed from: b */
    public boolean f158233b;

    /* renamed from: c */
    public boolean f158234c;

    /* renamed from: d */
    public int f158235d;

    /* renamed from: e */
    public int f158236e;

    static {
        abu abu = new abu();
        f158230f = abu;
        C62942bv.registerDefaultInstance(abu.class, abu);
    }

    private abu() {
        emptyIntList();
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
                return newMessageInfo(f158230f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", abs.f158228a, "e", abt.f158229a});
            case 3:
                return new abu();
            case 4:
                return new abr();
            case 5:
                return f158230f;
            case 6:
                C63010eb ebVar = f158231g;
                if (ebVar == null) {
                    synchronized (abu.class) {
                        ebVar = f158231g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158230f);
                            f158231g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
