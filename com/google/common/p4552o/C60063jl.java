package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.jl */
/* compiled from: PG */
public final class C60063jl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60063jl f162349f;

    /* renamed from: g */
    private static volatile C63010eb f162350g;

    /* renamed from: a */
    public int f162351a;

    /* renamed from: b */
    public int f162352b;

    /* renamed from: c */
    public C60065jn f162353c;

    /* renamed from: d */
    public boolean f162354d;

    /* renamed from: e */
    public boolean f162355e;

    static {
        C60063jl jlVar = new C60063jl();
        f162349f = jlVar;
        C62942bv.registerDefaultInstance(C60063jl.class, jlVar);
    }

    private C60063jl() {
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
                return newMessageInfo(f162349f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C60067jp.f162377a, C45240c.f118157a, "d", "e"});
            case 3:
                return new C60063jl();
            case 4:
                return new C60062jk();
            case 5:
                return f162349f;
            case 6:
                C63010eb ebVar = f162350g;
                if (ebVar == null) {
                    synchronized (C60063jl.class) {
                        ebVar = f162350g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162349f);
                            f162350g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
