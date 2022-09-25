package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C50345tq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.d */
/* compiled from: PG */
public final class C36727d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C36727d f95691e;

    /* renamed from: f */
    private static volatile C63010eb f95692f;

    /* renamed from: a */
    public int f95693a;

    /* renamed from: b */
    public C50345tq f95694b;

    /* renamed from: c */
    public String f95695c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f95696d = BuildConfig.FLAVOR;

    static {
        C36727d dVar = new C36727d();
        f95691e = dVar;
        C62942bv.registerDefaultInstance(C36727d.class, dVar);
    }

    private C36727d() {
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
                return newMessageInfo(f95691e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C36727d();
            case 4:
                return new C36726c();
            case 5:
                return f95691e;
            case 6:
                C63010eb ebVar = f95692f;
                if (ebVar == null) {
                    synchronized (C36727d.class) {
                        ebVar = f95692f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95691e);
                            f95692f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
