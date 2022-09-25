package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4193c.p4202g.p4203a.C56003a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.t */
/* compiled from: PG */
public final class C55984t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55984t f149087d;

    /* renamed from: e */
    private static volatile C63010eb f149088e;

    /* renamed from: a */
    public int f149089a;

    /* renamed from: b */
    public int f149090b;

    /* renamed from: c */
    public int f149091c;

    static {
        C55984t tVar = new C55984t();
        f149087d = tVar;
        C62942bv.registerDefaultInstance(C55984t.class, tVar);
    }

    private C55984t() {
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
                return newMessageInfo(f149087d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C56003a.f149165a, C45240c.f118157a, C55983s.f149086a});
            case 3:
                return new C55984t();
            case 4:
                return new C55982r();
            case 5:
                return f149087d;
            case 6:
                C63010eb ebVar = f149088e;
                if (ebVar == null) {
                    synchronized (C55984t.class) {
                        ebVar = f149088e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149087d);
                            f149088e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
