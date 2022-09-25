package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.n */
/* compiled from: PG */
public final class C91807n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C91807n f256041f;

    /* renamed from: g */
    private static volatile C63010eb f256042g;

    /* renamed from: a */
    public int f256043a;

    /* renamed from: b */
    public boolean f256044b;

    /* renamed from: c */
    public boolean f256045c;

    /* renamed from: d */
    public boolean f256046d;

    /* renamed from: e */
    public boolean f256047e;

    static {
        C91807n nVar = new C91807n();
        f256041f = nVar;
        C62942bv.registerDefaultInstance(C91807n.class, nVar);
    }

    private C91807n() {
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
                return newMessageInfo(f256041f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C91807n();
            case 4:
                return new C91806m();
            case 5:
                return f256041f;
            case 6:
                C63010eb ebVar = f256042g;
                if (ebVar == null) {
                    synchronized (C91807n.class) {
                        ebVar = f256042g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256041f);
                            f256042g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
