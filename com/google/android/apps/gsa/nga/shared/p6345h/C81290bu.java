package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bu */
/* compiled from: PG */
public final class C81290bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81290bu f222527d;

    /* renamed from: e */
    private static volatile C63010eb f222528e;

    /* renamed from: a */
    public int f222529a;

    /* renamed from: b */
    public long f222530b;

    /* renamed from: c */
    public int f222531c;

    static {
        C81290bu buVar = new C81290bu();
        f222527d = buVar;
        C62942bv.registerDefaultInstance(C81290bu.class, buVar);
    }

    private C81290bu() {
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
                return newMessageInfo(f222527d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C81290bu();
            case 4:
                return new C81289bt();
            case 5:
                return f222527d;
            case 6:
                C63010eb ebVar = f222528e;
                if (ebVar == null) {
                    synchronized (C81290bu.class) {
                        ebVar = f222528e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222527d);
                            f222528e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
