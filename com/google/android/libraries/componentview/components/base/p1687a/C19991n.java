package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.n */
/* compiled from: PG */
public final class C19991n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19991n f56019e;

    /* renamed from: f */
    private static volatile C63010eb f56020f;

    /* renamed from: a */
    public int f56021a;

    /* renamed from: b */
    public float f56022b;

    /* renamed from: c */
    public int f56023c;

    /* renamed from: d */
    public int f56024d = 3;

    static {
        C19991n nVar = new C19991n();
        f56019e = nVar;
        C62942bv.registerDefaultInstance(C19991n.class, nVar);
    }

    private C19991n() {
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
                return newMessageInfo(f56019e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဆ\u0001\u0003ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C19990m.m37790b()});
            case 3:
                return new C19991n();
            case 4:
                return new C19988k();
            case 5:
                return f56019e;
            case 6:
                C63010eb ebVar = f56020f;
                if (ebVar == null) {
                    synchronized (C19991n.class) {
                        ebVar = f56020f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56019e);
                            f56020f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
