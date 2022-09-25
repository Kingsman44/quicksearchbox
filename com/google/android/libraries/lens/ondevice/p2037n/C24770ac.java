package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.ac */
/* compiled from: PG */
public final class C24770ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24770ac f67681d;

    /* renamed from: e */
    private static volatile C63010eb f67682e;

    /* renamed from: a */
    public int f67683a;

    /* renamed from: b */
    public boolean f67684b;

    /* renamed from: c */
    public boolean f67685c;

    static {
        C24770ac acVar = new C24770ac();
        f67681d = acVar;
        C62942bv.registerDefaultInstance(C24770ac.class, acVar);
    }

    private C24770ac() {
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
                return newMessageInfo(f67681d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C24770ac();
            case 4:
                return new C24769ab();
            case 5:
                return f67681d;
            case 6:
                C63010eb ebVar = f67682e;
                if (ebVar == null) {
                    synchronized (C24770ac.class) {
                        ebVar = f67682e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67681d);
                            f67682e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
