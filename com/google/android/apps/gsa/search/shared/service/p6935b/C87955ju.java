package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ju */
/* compiled from: PG */
public final class C87955ju extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C87955ju f237882f;

    /* renamed from: g */
    private static volatile C63010eb f237883g;

    /* renamed from: a */
    public int f237884a;

    /* renamed from: b */
    public int f237885b;

    /* renamed from: c */
    public int f237886c;

    /* renamed from: d */
    public int f237887d;

    /* renamed from: e */
    public int f237888e;

    static {
        C87955ju juVar = new C87955ju();
        f237882f = juVar;
        C62942bv.registerDefaultInstance(C87955ju.class, juVar);
    }

    private C87955ju() {
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
                return newMessageInfo(f237882f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C87955ju();
            case 4:
                return new C87954jt();
            case 5:
                return f237882f;
            case 6:
                C63010eb ebVar = f237883g;
                if (ebVar == null) {
                    synchronized (C87955ju.class) {
                        ebVar = f237883g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237882f);
                            f237883g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
