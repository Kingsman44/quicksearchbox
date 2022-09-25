package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cm.a.c.a.a.n */
/* compiled from: PG */
public final class C58162n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C58162n f155498e;

    /* renamed from: f */
    private static volatile C63010eb f155499f;

    /* renamed from: a */
    public int f155500a;

    /* renamed from: b */
    public int f155501b = -1;

    /* renamed from: c */
    public int f155502c = -1;

    /* renamed from: d */
    public int f155503d;

    static {
        C58162n nVar = new C58162n();
        f155498e = nVar;
        C62942bv.registerDefaultInstance(C58162n.class, nVar);
    }

    private C58162n() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f155498e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C58162n();
            case 4:
                return new C58161m();
            case 5:
                return f155498e;
            case 6:
                C63010eb ebVar = f155499f;
                if (ebVar == null) {
                    synchronized (C58162n.class) {
                        ebVar = f155499f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155498e);
                            f155499f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
