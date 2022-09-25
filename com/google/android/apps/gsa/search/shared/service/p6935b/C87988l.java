package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.l */
/* compiled from: PG */
public final class C87988l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87988l f237953e;

    /* renamed from: f */
    private static volatile C63010eb f237954f;

    /* renamed from: a */
    public int f237955a;

    /* renamed from: b */
    public int f237956b;

    /* renamed from: c */
    public int f237957c;

    /* renamed from: d */
    public C87423k f237958d;

    static {
        C87988l lVar = new C87988l();
        f237953e = lVar;
        C62942bv.registerDefaultInstance(C87988l.class, lVar);
    }

    private C87988l() {
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
                return newMessageInfo(f237953e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87988l();
            case 4:
                return new C87961k();
            case 5:
                return f237953e;
            case 6:
                C63010eb ebVar = f237954f;
                if (ebVar == null) {
                    synchronized (C87988l.class) {
                        ebVar = f237954f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237953e);
                            f237954f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
