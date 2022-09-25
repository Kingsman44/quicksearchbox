package com.google.android.apps.gsa.search.core.carassistant.p6778b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.b.g */
/* compiled from: PG */
public final class C85692g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C85692g f231724d;

    /* renamed from: e */
    private static volatile C63010eb f231725e;

    /* renamed from: a */
    public int f231726a;

    /* renamed from: b */
    public C62995dn f231727b = C62995dn.f170057a;

    /* renamed from: c */
    public boolean f231728c;

    static {
        C85692g gVar = new C85692g();
        f231724d = gVar;
        C62942bv.registerDefaultInstance(C85692g.class, gVar);
    }

    private C85692g() {
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
                return newMessageInfo(f231724d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0001\u0000\u0000\u00012\u0003ဇ\u0000", new Object[]{"a", "b", C85691f.f231723a, C45240c.f118157a});
            case 3:
                return new C85692g();
            case 4:
                return new C85690e();
            case 5:
                return f231724d;
            case 6:
                C63010eb ebVar = f231725e;
                if (ebVar == null) {
                    synchronized (C85692g.class) {
                        ebVar = f231725e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231724d);
                            f231725e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
