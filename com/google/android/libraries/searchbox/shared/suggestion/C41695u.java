package com.google.android.libraries.searchbox.shared.suggestion;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.u */
/* compiled from: PG */
public final class C41695u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C41695u f109062e;

    /* renamed from: f */
    private static volatile C63010eb f109063f;

    /* renamed from: a */
    public int f109064a;

    /* renamed from: b */
    public long f109065b;

    /* renamed from: c */
    public long f109066c;

    /* renamed from: d */
    public long f109067d;

    static {
        C41695u uVar = new C41695u();
        f109062e = uVar;
        C62942bv.registerDefaultInstance(C41695u.class, uVar);
    }

    private C41695u() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f109062e, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0000\u0000\u0007ဂ\u0004\bဂ\u0005\tဂ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C41695u();
            case 4:
                return new C41694t();
            case 5:
                return f109062e;
            case 6:
                C63010eb ebVar = f109063f;
                if (ebVar == null) {
                    synchronized (C41695u.class) {
                        ebVar = f109063f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109062e);
                            f109063f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
