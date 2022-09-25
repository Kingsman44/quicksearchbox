package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xm */
/* compiled from: PG */
public final class C60643xm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60643xm f164522e;

    /* renamed from: f */
    private static volatile C63010eb f164523f;

    /* renamed from: a */
    public int f164524a;

    /* renamed from: b */
    public int f164525b;

    /* renamed from: c */
    public boolean f164526c;

    /* renamed from: d */
    public boolean f164527d;

    static {
        C60643xm xmVar = new C60643xm();
        f164522e = xmVar;
        C62942bv.registerDefaultInstance(C60643xm.class, xmVar);
    }

    private C60643xm() {
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
                return newMessageInfo(f164522e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C60642xl.f164521a, C45240c.f118157a, "d"});
            case 3:
                return new C60643xm();
            case 4:
                return new C60641xk();
            case 5:
                return f164522e;
            case 6:
                C63010eb ebVar = f164523f;
                if (ebVar == null) {
                    synchronized (C60643xm.class) {
                        ebVar = f164523f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164522e);
                            f164523f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
