package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.by */
/* compiled from: PG */
public final class C87743by extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87743by f237482b;

    /* renamed from: d */
    private static volatile C63010eb f237483d;

    /* renamed from: a */
    public int f237484a;

    /* renamed from: c */
    private int f237485c;

    static {
        C87743by byVar = new C87743by();
        f237482b = byVar;
        C62942bv.registerDefaultInstance(C87743by.class, byVar);
    }

    private C87743by() {
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
                return newMessageInfo(f237482b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87743by();
            case 4:
                return new C87742bx();
            case 5:
                return f237482b;
            case 6:
                C63010eb ebVar = f237483d;
                if (ebVar == null) {
                    synchronized (C87743by.class) {
                        ebVar = f237483d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237482b);
                            f237483d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
