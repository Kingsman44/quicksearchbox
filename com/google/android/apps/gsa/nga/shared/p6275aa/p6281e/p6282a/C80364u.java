package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.u */
/* compiled from: PG */
public final class C80364u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80364u f220516d;

    /* renamed from: e */
    private static volatile C63010eb f220517e;

    /* renamed from: a */
    public int f220518a = 0;

    /* renamed from: b */
    public Object f220519b;

    /* renamed from: c */
    public int f220520c;

    static {
        C80364u uVar = new C80364u();
        f220516d = uVar;
        C62942bv.registerDefaultInstance(C80364u.class, uVar);
    }

    private C80364u() {
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
                return newMessageInfo(f220516d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȼ\u0000\u0002\f\u0003<\u0000", new Object[]{"b", "a", C45240c.f118157a, C80506i.class});
            case 3:
                return new C80364u();
            case 4:
                return new C80361r();
            case 5:
                return f220516d;
            case 6:
                C63010eb ebVar = f220517e;
                if (ebVar == null) {
                    synchronized (C80364u.class) {
                        ebVar = f220517e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220516d);
                            f220517e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
