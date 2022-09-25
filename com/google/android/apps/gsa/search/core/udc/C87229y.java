package com.google.android.apps.gsa.search.core.udc;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.udc.y */
/* compiled from: PG */
public final class C87229y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87229y f235649e;

    /* renamed from: f */
    private static volatile C63010eb f235650f;

    /* renamed from: a */
    public int f235651a;

    /* renamed from: b */
    public int f235652b;

    /* renamed from: c */
    public int f235653c;

    /* renamed from: d */
    public int f235654d;

    static {
        C87229y yVar = new C87229y();
        f235649e = yVar;
        C62942bv.registerDefaultInstance(C87229y.class, yVar);
    }

    private C87229y() {
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
                return newMessageInfo(f235649e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C56116b.m87898b(), C45240c.f118157a, C87227w.f235648a, "d", C87225u.f235647a});
            case 3:
                return new C87229y();
            case 4:
                return new C87224t();
            case 5:
                return f235649e;
            case 6:
                C63010eb ebVar = f235650f;
                if (ebVar == null) {
                    synchronized (C87229y.class) {
                        ebVar = f235650f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235649e);
                            f235650f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
