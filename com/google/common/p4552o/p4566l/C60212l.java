package com.google.common.p4552o.p4566l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4557d.p4558a.C59713a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.l */
/* compiled from: PG */
public final class C60212l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60212l f162909a;

    /* renamed from: e */
    private static volatile C63010eb f162910e;

    /* renamed from: b */
    private int f162911b;

    /* renamed from: c */
    private int f162912c;

    /* renamed from: d */
    private byte f162913d = 2;

    static {
        C60212l lVar = new C60212l();
        f162909a = lVar;
        C62942bv.registerDefaultInstance(C60212l.class, lVar);
    }

    private C60212l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162913d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162913d = b;
                return null;
            case 2:
                return newMessageInfo(f162909a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔌ\u0000", new Object[]{"b", C45240c.f118157a, C59713a.f160233a});
            case 3:
                return new C60212l();
            case 4:
                return new C60211k();
            case 5:
                return f162909a;
            case 6:
                C63010eb ebVar = f162910e;
                if (ebVar == null) {
                    synchronized (C60212l.class) {
                        ebVar = f162910e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162909a);
                            f162910e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
