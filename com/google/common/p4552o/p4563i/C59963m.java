package com.google.common.p4552o.p4563i;

import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.m */
/* compiled from: PG */
public final class C59963m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59963m f162060c;

    /* renamed from: d */
    private static volatile C63010eb f162061d;

    /* renamed from: a */
    public int f162062a;

    /* renamed from: b */
    public int f162063b;

    static {
        C59963m mVar = new C59963m();
        f162060c = mVar;
        C62942bv.registerDefaultInstance(C59963m.class, mVar);
    }

    private C59963m() {
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
                return newMessageInfo(f162060c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C56306df.m87965b()});
            case 3:
                return new C59963m();
            case 4:
                return new C59962l();
            case 5:
                return f162060c;
            case 6:
                C63010eb ebVar = f162061d;
                if (ebVar == null) {
                    synchronized (C59963m.class) {
                        ebVar = f162061d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162060c);
                            f162061d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
