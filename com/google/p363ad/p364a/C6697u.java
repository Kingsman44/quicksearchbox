package com.google.p363ad.p364a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.u */
/* compiled from: PG */
public final class C6697u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C6697u f19998d;

    /* renamed from: e */
    private static volatile C63010eb f19999e;

    /* renamed from: a */
    public int f20000a;

    /* renamed from: b */
    public int f20001b;

    /* renamed from: c */
    public int f20002c;

    static {
        C6697u uVar = new C6697u();
        f19998d = uVar;
        C62942bv.registerDefaultInstance(C6697u.class, uVar);
    }

    private C6697u() {
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
                return newMessageInfo(f19998d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C6695s.f19997a});
            case 3:
                return new C6697u();
            case 4:
                return new C6696t();
            case 5:
                return f19998d;
            case 6:
                C63010eb ebVar = f19999e;
                if (ebVar == null) {
                    synchronized (C6697u.class) {
                        ebVar = f19999e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19998d);
                            f19999e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
