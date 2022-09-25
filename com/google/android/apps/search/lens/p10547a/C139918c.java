package com.google.android.apps.search.lens.p10547a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.lens.a.c */
/* compiled from: PG */
public final class C139918c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139918c f380355d;

    /* renamed from: e */
    private static volatile C63010eb f380356e;

    /* renamed from: a */
    public int f380357a;

    /* renamed from: b */
    public int f380358b;

    /* renamed from: c */
    public C62471cu f380359c;

    static {
        C139918c cVar = new C139918c();
        f380355d = cVar;
        C62942bv.registerDefaultInstance(C139918c.class, cVar);
    }

    private C139918c() {
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
                return newMessageInfo(f380355d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C62433bj.m94775b(), C45240c.f118157a});
            case 3:
                return new C139918c();
            case 4:
                return new C139917b();
            case 5:
                return f380355d;
            case 6:
                C63010eb ebVar = f380356e;
                if (ebVar == null) {
                    synchronized (C139918c.class) {
                        ebVar = f380356e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380355d);
                            f380356e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
