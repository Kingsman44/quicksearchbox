package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ec */
/* compiled from: PG */
public final class C57459ec extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57459ec f153490f;

    /* renamed from: g */
    private static volatile C63010eb f153491g;

    /* renamed from: a */
    public int f153492a;

    /* renamed from: b */
    public int f153493b;

    /* renamed from: c */
    public int f153494c;

    /* renamed from: d */
    public int f153495d;

    /* renamed from: e */
    public int f153496e;

    static {
        C57459ec ecVar = new C57459ec();
        f153490f = ecVar;
        C62942bv.registerDefaultInstance(C57459ec.class, ecVar);
    }

    private C57459ec() {
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
                return newMessageInfo(f153490f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57459ec();
            case 4:
                return new C57458eb();
            case 5:
                return f153490f;
            case 6:
                C63010eb ebVar = f153491g;
                if (ebVar == null) {
                    synchronized (C57459ec.class) {
                        ebVar = f153491g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153490f);
                            f153491g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
