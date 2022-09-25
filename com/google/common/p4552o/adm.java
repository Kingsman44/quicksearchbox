package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.adm */
/* compiled from: PG */
public final class adm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final adm f158382e;

    /* renamed from: f */
    private static volatile C63010eb f158383f;

    /* renamed from: a */
    public int f158384a;

    /* renamed from: b */
    public adj f158385b;

    /* renamed from: c */
    public ade f158386c;

    /* renamed from: d */
    public adl f158387d;

    static {
        adm adm = new adm();
        f158382e = adm;
        C62942bv.registerDefaultInstance(adm.class, adm);
    }

    private adm() {
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
                return newMessageInfo(f158382e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new adm();
            case 4:
                return new acw();
            case 5:
                return f158382e;
            case 6:
                C63010eb ebVar = f158383f;
                if (ebVar == null) {
                    synchronized (adm.class) {
                        ebVar = f158383f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158382e);
                            f158383f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
