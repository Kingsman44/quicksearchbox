package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.kp */
/* compiled from: PG */
public final class C60096kp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60096kp f162493d;

    /* renamed from: e */
    private static volatile C63010eb f162494e;

    /* renamed from: a */
    public int f162495a;

    /* renamed from: b */
    public int f162496b;

    /* renamed from: c */
    public int f162497c;

    static {
        C60096kp kpVar = new C60096kp();
        f162493d = kpVar;
        C62942bv.registerDefaultInstance(C60096kp.class, kpVar);
    }

    private C60096kp() {
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
                return newMessageInfo(f162493d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C60093km.f162491a, C45240c.f118157a, C60095ko.f162492a});
            case 3:
                return new C60096kp();
            case 4:
                return new C60094kn();
            case 5:
                return f162493d;
            case 6:
                C63010eb ebVar = f162494e;
                if (ebVar == null) {
                    synchronized (C60096kp.class) {
                        ebVar = f162494e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162493d);
                            f162494e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
