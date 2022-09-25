package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.g */
/* compiled from: PG */
public final class C80459g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80459g f220824d;

    /* renamed from: e */
    private static volatile C63010eb f220825e;

    /* renamed from: a */
    public int f220826a;

    /* renamed from: b */
    public String f220827b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C80462j f220828c;

    static {
        C80459g gVar = new C80459g();
        f220824d = gVar;
        C62942bv.registerDefaultInstance(C80459g.class, gVar);
    }

    private C80459g() {
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
                return newMessageInfo(f220824d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80459g();
            case 4:
                return new C80458f();
            case 5:
                return f220824d;
            case 6:
                C63010eb ebVar = f220825e;
                if (ebVar == null) {
                    synchronized (C80459g.class) {
                        ebVar = f220825e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220824d);
                            f220825e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
