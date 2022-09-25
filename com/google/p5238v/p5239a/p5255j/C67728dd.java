package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.dd */
/* compiled from: PG */
public final class C67728dd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67728dd f183754e;

    /* renamed from: f */
    private static volatile C63010eb f183755f;

    /* renamed from: a */
    public C67721cx f183756a;

    /* renamed from: b */
    public int f183757b;

    /* renamed from: c */
    public int f183758c;

    /* renamed from: d */
    public int f183759d;

    static {
        C67728dd ddVar = new C67728dd();
        f183754e = ddVar;
        C62942bv.registerDefaultInstance(C67728dd.class, ddVar);
    }

    private C67728dd() {
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
                return newMessageInfo(f183754e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67728dd();
            case 4:
                return new C67727dc();
            case 5:
                return f183754e;
            case 6:
                C63010eb ebVar = f183755f;
                if (ebVar == null) {
                    synchronized (C67728dd.class) {
                        ebVar = f183755f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183754e);
                            f183755f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
