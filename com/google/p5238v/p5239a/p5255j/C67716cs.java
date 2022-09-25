package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.cs */
/* compiled from: PG */
public final class C67716cs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67716cs f183722d;

    /* renamed from: e */
    private static volatile C63010eb f183723e;

    /* renamed from: a */
    public int f183724a;

    /* renamed from: b */
    public C67718cu f183725b;

    /* renamed from: c */
    public C63088z f183726c = C63088z.f170246b;

    static {
        C67716cs csVar = new C67716cs();
        f183722d = csVar;
        C62942bv.registerDefaultInstance(C67716cs.class, csVar);
    }

    private C67716cs() {
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
                return newMessageInfo(f183722d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67716cs();
            case 4:
                return new C67715cr();
            case 5:
                return f183722d;
            case 6:
                C63010eb ebVar = f183723e;
                if (ebVar == null) {
                    synchronized (C67716cs.class) {
                        ebVar = f183723e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183722d);
                            f183723e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
