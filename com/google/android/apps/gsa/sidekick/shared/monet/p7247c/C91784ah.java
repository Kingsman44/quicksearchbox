package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.ah */
/* compiled from: PG */
public final class C91784ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91784ah f255949c;

    /* renamed from: d */
    private static volatile C63010eb f255950d;

    /* renamed from: a */
    public int f255951a;

    /* renamed from: b */
    public boolean f255952b;

    static {
        C91784ah ahVar = new C91784ah();
        f255949c = ahVar;
        C62942bv.registerDefaultInstance(C91784ah.class, ahVar);
    }

    private C91784ah() {
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
                return newMessageInfo(f255949c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C91784ah();
            case 4:
                return new C91783ag();
            case 5:
                return f255949c;
            case 6:
                C63010eb ebVar = f255950d;
                if (ebVar == null) {
                    synchronized (C91784ah.class) {
                        ebVar = f255950d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255949c);
                            f255950d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
