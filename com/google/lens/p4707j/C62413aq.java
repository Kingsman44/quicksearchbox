package com.google.lens.p4707j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.aq */
/* compiled from: PG */
public final class C62413aq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62413aq f168472e;

    /* renamed from: g */
    private static volatile C63010eb f168473g;

    /* renamed from: a */
    public double f168474a;

    /* renamed from: b */
    public double f168475b;

    /* renamed from: c */
    public double f168476c;

    /* renamed from: d */
    public double f168477d;

    /* renamed from: f */
    private int f168478f;

    static {
        C62413aq aqVar = new C62413aq();
        f168472e = aqVar;
        C62942bv.registerDefaultInstance(C62413aq.class, aqVar);
    }

    private C62413aq() {
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
                return newMessageInfo(f168472e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62413aq();
            case 4:
                return new C62412ap();
            case 5:
                return f168472e;
            case 6:
                C63010eb ebVar = f168473g;
                if (ebVar == null) {
                    synchronized (C62413aq.class) {
                        ebVar = f168473g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168472e);
                            f168473g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
