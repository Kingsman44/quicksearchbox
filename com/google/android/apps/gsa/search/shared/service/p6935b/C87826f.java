package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.f */
/* compiled from: PG */
public final class C87826f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87826f f237631e;

    /* renamed from: f */
    private static volatile C63010eb f237632f;

    /* renamed from: a */
    public int f237633a;

    /* renamed from: b */
    public boolean f237634b;

    /* renamed from: c */
    public boolean f237635c;

    /* renamed from: d */
    public boolean f237636d;

    static {
        C87826f fVar = new C87826f();
        f237631e = fVar;
        C62942bv.registerDefaultInstance(C87826f.class, fVar);
    }

    private C87826f() {
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
                return newMessageInfo(f237631e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87826f();
            case 4:
                return new C87799e();
            case 5:
                return f237631e;
            case 6:
                C63010eb ebVar = f237632f;
                if (ebVar == null) {
                    synchronized (C87826f.class) {
                        ebVar = f237632f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237631e);
                            f237632f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
