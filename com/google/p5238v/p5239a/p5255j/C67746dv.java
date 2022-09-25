package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.dv */
/* compiled from: PG */
public final class C67746dv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67746dv f183799d;

    /* renamed from: e */
    private static volatile C63010eb f183800e;

    /* renamed from: a */
    public C67748dx f183801a;

    /* renamed from: b */
    public int f183802b;

    /* renamed from: c */
    public C63088z f183803c = C63088z.f170246b;

    static {
        C67746dv dvVar = new C67746dv();
        f183799d = dvVar;
        C62942bv.registerDefaultInstance(C67746dv.class, dvVar);
    }

    private C67746dv() {
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
                return newMessageInfo(f183799d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67746dv();
            case 4:
                return new C67745du();
            case 5:
                return f183799d;
            case 6:
                C63010eb ebVar = f183800e;
                if (ebVar == null) {
                    synchronized (C67746dv.class) {
                        ebVar = f183800e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183799d);
                            f183800e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
