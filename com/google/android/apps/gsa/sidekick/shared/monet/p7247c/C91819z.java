package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.z */
/* compiled from: PG */
public final class C91819z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91819z f256081c;

    /* renamed from: d */
    private static volatile C63010eb f256082d;

    /* renamed from: a */
    public boolean f256083a;

    /* renamed from: b */
    public boolean f256084b;

    static {
        C91819z zVar = new C91819z();
        f256081c = zVar;
        C62942bv.registerDefaultInstance(C91819z.class, zVar);
    }

    private C91819z() {
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
                return newMessageInfo(f256081c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C91819z();
            case 4:
                return new C91818y();
            case 5:
                return f256081c;
            case 6:
                C63010eb ebVar = f256082d;
                if (ebVar == null) {
                    synchronized (C91819z.class) {
                        ebVar = f256082d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256081c);
                            f256082d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
