package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.uk */
/* compiled from: PG */
public final class C88242uk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88242uk f238496e;

    /* renamed from: f */
    private static volatile C63010eb f238497f;

    /* renamed from: a */
    public int f238498a;

    /* renamed from: b */
    public String f238499b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f238500c;

    /* renamed from: d */
    public int f238501d;

    static {
        C88242uk ukVar = new C88242uk();
        f238496e = ukVar;
        C62942bv.registerDefaultInstance(C88242uk.class, ukVar);
    }

    private C88242uk() {
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
                return newMessageInfo(f238496e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88242uk();
            case 4:
                return new C88241uj();
            case 5:
                return f238496e;
            case 6:
                C63010eb ebVar = f238497f;
                if (ebVar == null) {
                    synchronized (C88242uk.class) {
                        ebVar = f238497f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238496e);
                            f238497f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
