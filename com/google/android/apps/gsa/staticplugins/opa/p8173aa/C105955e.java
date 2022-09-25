package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3910e.p3911a.C51205t;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.e */
/* compiled from: PG */
public final class C105955e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C105955e f295825d;

    /* renamed from: f */
    private static volatile C63010eb f295826f;

    /* renamed from: a */
    public int f295827a;

    /* renamed from: b */
    public C54201r f295828b;

    /* renamed from: c */
    public C51205t f295829c;

    /* renamed from: e */
    private byte f295830e = 2;

    static {
        C105955e eVar = new C105955e();
        f295825d = eVar;
        C62942bv.registerDefaultInstance(C105955e.class, eVar);
    }

    private C105955e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f295830e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f295830e = b;
                return null;
            case 2:
                return newMessageInfo(f295825d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C105955e();
            case 4:
                return new C105954d();
            case 5:
                return f295825d;
            case 6:
                C63010eb ebVar = f295826f;
                if (ebVar == null) {
                    synchronized (C105955e.class) {
                        ebVar = f295826f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295825d);
                            f295826f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
