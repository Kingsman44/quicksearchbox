package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.mv */
/* compiled from: PG */
public final class C60281mv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60281mv f163083d;

    /* renamed from: e */
    private static volatile C63010eb f163084e;

    /* renamed from: a */
    public int f163085a;

    /* renamed from: b */
    public int f163086b;

    /* renamed from: c */
    public boolean f163087c;

    static {
        C60281mv mvVar = new C60281mv();
        f163083d = mvVar;
        C62942bv.registerDefaultInstance(C60281mv.class, mvVar);
    }

    private C60281mv() {
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
                return newMessageInfo(f163083d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C60280mu.f163082a, C45240c.f118157a});
            case 3:
                return new C60281mv();
            case 4:
                return new C60279mt();
            case 5:
                return f163083d;
            case 6:
                C63010eb ebVar = f163084e;
                if (ebVar == null) {
                    synchronized (C60281mv.class) {
                        ebVar = f163084e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163083d);
                            f163084e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
