package com.google.android.apps.gsa.opaonboarding.p6462d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.l */
/* compiled from: PG */
public final class C83925l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83925l f228575d;

    /* renamed from: e */
    private static volatile C63010eb f228576e;

    /* renamed from: a */
    public int f228577a;

    /* renamed from: b */
    public boolean f228578b;

    /* renamed from: c */
    public boolean f228579c;

    static {
        C83925l lVar = new C83925l();
        f228575d = lVar;
        C62942bv.registerDefaultInstance(C83925l.class, lVar);
    }

    private C83925l() {
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
                return newMessageInfo(f228575d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83925l();
            case 4:
                return new C83924k();
            case 5:
                return f228575d;
            case 6:
                C63010eb ebVar = f228576e;
                if (ebVar == null) {
                    synchronized (C83925l.class) {
                        ebVar = f228576e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228575d);
                            f228576e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
