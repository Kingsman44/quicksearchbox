package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.acr */
/* compiled from: PG */
public final class acr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final acr f158321e;

    /* renamed from: f */
    private static volatile C63010eb f158322f;

    /* renamed from: a */
    public int f158323a;

    /* renamed from: b */
    public long f158324b;

    /* renamed from: c */
    public long f158325c;

    /* renamed from: d */
    public C62961ch f158326d = emptyIntList();

    static {
        acr acr = new acr();
        f158321e = acr;
        C62942bv.registerDefaultInstance(acr.class, acr);
    }

    private acr() {
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
                return newMessageInfo(f158321e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003+", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new acr();
            case 4:
                return new acq();
            case 5:
                return f158321e;
            case 6:
                C63010eb ebVar = f158322f;
                if (ebVar == null) {
                    synchronized (acr.class) {
                        ebVar = f158322f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158321e);
                            f158322f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
