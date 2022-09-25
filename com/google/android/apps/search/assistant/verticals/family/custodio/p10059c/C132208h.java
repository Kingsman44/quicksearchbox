package com.google.android.apps.search.assistant.verticals.family.custodio.p10059c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p427am.p432b.p433a.C8662bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.c.h */
/* compiled from: PG */
public final class C132208h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132208h f360848d;

    /* renamed from: e */
    private static volatile C63010eb f360849e;

    /* renamed from: a */
    public int f360850a;

    /* renamed from: b */
    public C63042fg f360851b;

    /* renamed from: c */
    public C8662bn f360852c;

    static {
        C132208h hVar = new C132208h();
        f360848d = hVar;
        C62942bv.registerDefaultInstance(C132208h.class, hVar);
    }

    private C132208h() {
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
                return newMessageInfo(f360848d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C132208h();
            case 4:
                return new C132207g();
            case 5:
                return f360848d;
            case 6:
                C63010eb ebVar = f360849e;
                if (ebVar == null) {
                    synchronized (C132208h.class) {
                        ebVar = f360849e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360848d);
                            f360849e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
