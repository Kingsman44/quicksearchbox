package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.ad */
/* compiled from: PG */
public final class C105923ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105923ad f295736c;

    /* renamed from: e */
    private static volatile C63010eb f295737e;

    /* renamed from: a */
    public int f295738a;

    /* renamed from: b */
    public C54201r f295739b;

    /* renamed from: d */
    private byte f295740d = 2;

    static {
        C105923ad adVar = new C105923ad();
        f295736c = adVar;
        C62942bv.registerDefaultInstance(C105923ad.class, adVar);
    }

    private C105923ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f295740d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f295740d = b;
                return null;
            case 2:
                return newMessageInfo(f295736c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105923ad();
            case 4:
                return new C105922ac();
            case 5:
                return f295736c;
            case 6:
                C63010eb ebVar = f295737e;
                if (ebVar == null) {
                    synchronized (C105923ad.class) {
                        ebVar = f295737e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295736c);
                            f295737e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
