package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.r */
/* compiled from: PG */
public final class C80584r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80584r f221200d;

    /* renamed from: e */
    private static volatile C63010eb f221201e;

    /* renamed from: a */
    public int f221202a = 0;

    /* renamed from: b */
    public Object f221203b;

    /* renamed from: c */
    public boolean f221204c;

    static {
        C80584r rVar = new C80584r();
        f221200d = rVar;
        C62942bv.registerDefaultInstance(C80584r.class, rVar);
    }

    private C80584r() {
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
                return newMessageInfo(f221200d, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u00037\u0000\u0004=\u0000\u0005Ȼ\u0000\u0006\u0007", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C80584r();
            case 4:
                return new C80582p();
            case 5:
                return f221200d;
            case 6:
                C63010eb ebVar = f221201e;
                if (ebVar == null) {
                    synchronized (C80584r.class) {
                        ebVar = f221201e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221200d);
                            f221201e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
