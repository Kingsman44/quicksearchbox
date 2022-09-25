package com.google.common.p4552o.p4554b.p4555a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.ab */
/* compiled from: PG */
public final class C59606ab extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59606ab f159820f;

    /* renamed from: g */
    private static volatile C63010eb f159821g;

    /* renamed from: a */
    public int f159822a;

    /* renamed from: b */
    public long f159823b;

    /* renamed from: c */
    public long f159824c;

    /* renamed from: d */
    public long f159825d;

    /* renamed from: e */
    public int f159826e;

    static {
        C59606ab abVar = new C59606ab();
        f159820f = abVar;
        C62942bv.registerDefaultInstance(C59606ab.class, abVar);
    }

    private C59606ab() {
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
                return newMessageInfo(f159820f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C59609ae.f159829a});
            case 3:
                return new C59606ab();
            case 4:
                return new C59605aa();
            case 5:
                return f159820f;
            case 6:
                C63010eb ebVar = f159821g;
                if (ebVar == null) {
                    synchronized (C59606ab.class) {
                        ebVar = f159821g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159820f);
                            f159821g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
