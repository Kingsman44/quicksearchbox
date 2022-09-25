package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.t */
/* compiled from: PG */
public final class C54800t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54800t f143759f;

    /* renamed from: g */
    private static volatile C63010eb f143760g;

    /* renamed from: a */
    public int f143761a;

    /* renamed from: b */
    public int f143762b;

    /* renamed from: c */
    public long f143763c;

    /* renamed from: d */
    public long f143764d;

    /* renamed from: e */
    public long f143765e;

    static {
        C54800t tVar = new C54800t();
        f143759f = tVar;
        C62942bv.registerDefaultInstance(C54800t.class, tVar);
    }

    private C54800t() {
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
                return newMessageInfo(f143759f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C54799s.f143758a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C54800t();
            case 4:
                return new C54798r();
            case 5:
                return f143759f;
            case 6:
                C63010eb ebVar = f143760g;
                if (ebVar == null) {
                    synchronized (C54800t.class) {
                        ebVar = f143760g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143759f);
                            f143760g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
