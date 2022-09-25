package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.ab */
/* compiled from: PG */
public final class C91778ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C91778ab f255931d;

    /* renamed from: e */
    private static volatile C63010eb f255932e;

    /* renamed from: a */
    public int f255933a;

    /* renamed from: b */
    public int f255934b;

    /* renamed from: c */
    public boolean f255935c;

    static {
        C91778ab abVar = new C91778ab();
        f255931d = abVar;
        C62942bv.registerDefaultInstance(C91778ab.class, abVar);
    }

    private C91778ab() {
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
                return newMessageInfo(f255931d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C8142xb.m22955b(), C45240c.f118157a});
            case 3:
                return new C91778ab();
            case 4:
                return new C91777aa();
            case 5:
                return f255931d;
            case 6:
                C63010eb ebVar = f255932e;
                if (ebVar == null) {
                    synchronized (C91778ab.class) {
                        ebVar = f255932e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255931d);
                            f255932e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
