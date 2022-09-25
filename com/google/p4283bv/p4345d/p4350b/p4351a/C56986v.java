package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7681g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.v */
/* compiled from: PG */
public final class C56986v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56986v f152121d;

    /* renamed from: e */
    private static volatile C63010eb f152122e;

    /* renamed from: a */
    public int f152123a;

    /* renamed from: b */
    public int f152124b;

    /* renamed from: c */
    public int f152125c;

    static {
        C56986v vVar = new C56986v();
        f152121d = vVar;
        C62942bv.registerDefaultInstance(C56986v.class, vVar);
    }

    private C56986v() {
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
                return newMessageInfo(f152121d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C7681g.m22803b(), C45240c.f118157a});
            case 3:
                return new C56986v();
            case 4:
                return new C56985u();
            case 5:
                return f152121d;
            case 6:
                C63010eb ebVar = f152122e;
                if (ebVar == null) {
                    synchronized (C56986v.class) {
                        ebVar = f152122e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152121d);
                            f152122e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
