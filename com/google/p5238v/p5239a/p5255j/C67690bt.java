package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.bt */
/* compiled from: PG */
public final class C67690bt extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67690bt f183681d;

    /* renamed from: e */
    private static volatile C63010eb f183682e;

    /* renamed from: a */
    public int f183683a;

    /* renamed from: b */
    public int f183684b;

    /* renamed from: c */
    public C63088z f183685c = C63088z.f170246b;

    static {
        C67690bt btVar = new C67690bt();
        f183681d = btVar;
        C62942bv.registerDefaultInstance(C67690bt.class, btVar);
    }

    private C67690bt() {
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
                return newMessageInfo(f183681d, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67690bt();
            case 4:
                return new C67689bs();
            case 5:
                return f183681d;
            case 6:
                C63010eb ebVar = f183682e;
                if (ebVar == null) {
                    synchronized (C67690bt.class) {
                        ebVar = f183682e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183681d);
                            f183682e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
