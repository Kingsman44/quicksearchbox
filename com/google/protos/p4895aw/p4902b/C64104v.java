package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.v */
/* compiled from: PG */
public final class C64104v extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64104v f173306f;

    /* renamed from: g */
    private static volatile C63010eb f173307g;

    /* renamed from: a */
    public int f173308a;

    /* renamed from: b */
    public int f173309b;

    /* renamed from: c */
    public int f173310c;

    /* renamed from: d */
    public long f173311d;

    /* renamed from: e */
    public C64039cv f173312e;

    static {
        C64104v vVar = new C64104v();
        f173306f = vVar;
        C62942bv.registerDefaultInstance(C64104v.class, vVar);
    }

    private C64104v() {
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
                return newMessageInfo(f173306f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64104v();
            case 4:
                return new C64103u();
            case 5:
                return f173306f;
            case 6:
                C63010eb ebVar = f173307g;
                if (ebVar == null) {
                    synchronized (C64104v.class) {
                        ebVar = f173307g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173306f);
                            f173307g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
