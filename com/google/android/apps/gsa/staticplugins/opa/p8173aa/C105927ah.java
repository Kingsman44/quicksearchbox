package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.ah */
/* compiled from: PG */
public final class C105927ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105927ah f295745c;

    /* renamed from: e */
    private static volatile C63010eb f295746e;

    /* renamed from: a */
    public int f295747a;

    /* renamed from: b */
    public C54201r f295748b;

    /* renamed from: d */
    private byte f295749d = 2;

    static {
        C105927ah ahVar = new C105927ah();
        f295745c = ahVar;
        C62942bv.registerDefaultInstance(C105927ah.class, ahVar);
    }

    private C105927ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f295749d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f295749d = b;
                return null;
            case 2:
                return newMessageInfo(f295745c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105927ah();
            case 4:
                return new C105926ag();
            case 5:
                return f295745c;
            case 6:
                C63010eb ebVar = f295746e;
                if (ebVar == null) {
                    synchronized (C105927ah.class) {
                        ebVar = f295746e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295745c);
                            f295746e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
