package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.r */
/* compiled from: PG */
public final class C67778r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67778r f183882d;

    /* renamed from: e */
    private static volatile C63010eb f183883e;

    /* renamed from: a */
    public int f183884a;

    /* renamed from: b */
    public C67782v f183885b;

    /* renamed from: c */
    public C63088z f183886c = C63088z.f170246b;

    static {
        C67778r rVar = new C67778r();
        f183882d = rVar;
        C62942bv.registerDefaultInstance(C67778r.class, rVar);
    }

    private C67778r() {
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
                return newMessageInfo(f183882d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67778r();
            case 4:
                return new C67777q();
            case 5:
                return f183882d;
            case 6:
                C63010eb ebVar = f183883e;
                if (ebVar == null) {
                    synchronized (C67778r.class) {
                        ebVar = f183883e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183882d);
                            f183883e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
