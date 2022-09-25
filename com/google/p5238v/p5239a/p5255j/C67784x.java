package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.x */
/* compiled from: PG */
public final class C67784x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67784x f183894d;

    /* renamed from: e */
    private static volatile C63010eb f183895e;

    /* renamed from: a */
    public int f183896a;

    /* renamed from: b */
    public C67645ab f183897b;

    /* renamed from: c */
    public C63088z f183898c = C63088z.f170246b;

    static {
        C67784x xVar = new C67784x();
        f183894d = xVar;
        C62942bv.registerDefaultInstance(C67784x.class, xVar);
    }

    private C67784x() {
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
                return newMessageInfo(f183894d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67784x();
            case 4:
                return new C67783w();
            case 5:
                return f183894d;
            case 6:
                C63010eb ebVar = f183895e;
                if (ebVar == null) {
                    synchronized (C67784x.class) {
                        ebVar = f183895e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183894d);
                            f183895e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
