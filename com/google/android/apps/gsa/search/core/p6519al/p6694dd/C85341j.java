package com.google.android.apps.gsa.search.core.p6519al.p6694dd;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.al.dd.j */
/* compiled from: PG */
public final class C85341j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C85341j f231123c;

    /* renamed from: d */
    private static volatile C63010eb f231124d;

    /* renamed from: a */
    public int f231125a;

    /* renamed from: b */
    public int f231126b;

    static {
        C85341j jVar = new C85341j();
        f231123c = jVar;
        C62942bv.registerDefaultInstance(C85341j.class, jVar);
    }

    private C85341j() {
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
                return newMessageInfo(f231123c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C85339h.f231122a});
            case 3:
                return new C85341j();
            case 4:
                return new C85338g();
            case 5:
                return f231123c;
            case 6:
                C63010eb ebVar = f231124d;
                if (ebVar == null) {
                    synchronized (C85341j.class) {
                        ebVar = f231124d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231123c);
                            f231124d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
