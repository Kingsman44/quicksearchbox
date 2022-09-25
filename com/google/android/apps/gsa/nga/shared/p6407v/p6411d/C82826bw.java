package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.bw */
/* compiled from: PG */
public final class C82826bw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82826bw f225692e;

    /* renamed from: f */
    private static volatile C63010eb f225693f;

    /* renamed from: a */
    public int f225694a;

    /* renamed from: b */
    public int f225695b;

    /* renamed from: c */
    public C82961gw f225696c;

    /* renamed from: d */
    public int f225697d;

    static {
        C82826bw bwVar = new C82826bw();
        f225692e = bwVar;
        C62942bv.registerDefaultInstance(C82826bw.class, bwVar);
    }

    private C82826bw() {
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
                return newMessageInfo(f225692e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", C82825bv.f225691a, C45240c.f118157a, "d"});
            case 3:
                return new C82826bw();
            case 4:
                return new C82824bu();
            case 5:
                return f225692e;
            case 6:
                C63010eb ebVar = f225693f;
                if (ebVar == null) {
                    synchronized (C82826bw.class) {
                        ebVar = f225693f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225692e);
                            f225693f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
