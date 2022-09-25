package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.r */
/* compiled from: PG */
public final class C64100r extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64100r f173296f;

    /* renamed from: g */
    private static volatile C63010eb f173297g;

    /* renamed from: a */
    public int f173298a;

    /* renamed from: b */
    public int f173299b;

    /* renamed from: c */
    public int f173300c;

    /* renamed from: d */
    public long f173301d;

    /* renamed from: e */
    public C64028ck f173302e;

    static {
        C64100r rVar = new C64100r();
        f173296f = rVar;
        C62942bv.registerDefaultInstance(C64100r.class, rVar);
    }

    private C64100r() {
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
                return newMessageInfo(f173296f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64100r();
            case 4:
                return new C64099q();
            case 5:
                return f173296f;
            case 6:
                C63010eb ebVar = f173297g;
                if (ebVar == null) {
                    synchronized (C64100r.class) {
                        ebVar = f173297g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173296f);
                            f173297g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
