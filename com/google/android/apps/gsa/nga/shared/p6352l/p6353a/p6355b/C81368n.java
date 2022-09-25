package com.google.android.apps.gsa.nga.shared.p6352l.p6353a.p6355b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.l.a.b.n */
/* compiled from: PG */
public final class C81368n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C81368n f222701e;

    /* renamed from: f */
    private static volatile C63010eb f222702f;

    /* renamed from: a */
    public int f222703a;

    /* renamed from: b */
    public int f222704b = 0;

    /* renamed from: c */
    public Object f222705c;

    /* renamed from: d */
    public int f222706d;

    static {
        C81368n nVar = new C81368n();
        f222701e = nVar;
        C62942bv.registerDefaultInstance(C81368n.class, nVar);
    }

    private C81368n() {
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
                return newMessageInfo(f222701e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003်\u0000\u0004ဌ\u0000", new Object[]{C45240c.f118157a, "b", "a", C81363i.class, C81366l.class, "d", C80248co.m128105b()});
            case 3:
                return new C81368n();
            case 4:
                return new C81364j();
            case 5:
                return f222701e;
            case 6:
                C63010eb ebVar = f222702f;
                if (ebVar == null) {
                    synchronized (C81368n.class) {
                        ebVar = f222702f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222701e);
                            f222702f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
