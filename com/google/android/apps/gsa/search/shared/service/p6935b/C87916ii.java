package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62956cc;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ii */
/* compiled from: PG */
public final class C87916ii extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87916ii f237808b;

    /* renamed from: c */
    private static volatile C63010eb f237809c;

    /* renamed from: a */
    public C62956cc f237810a = emptyDoubleList();

    static {
        C87916ii iiVar = new C87916ii();
        f237808b = iiVar;
        C62942bv.registerDefaultInstance(C87916ii.class, iiVar);
    }

    private C87916ii() {
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
                return newMessageInfo(f237808b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0012", new Object[]{"a"});
            case 3:
                return new C87916ii();
            case 4:
                return new C87915ih();
            case 5:
                return f237808b;
            case 6:
                C63010eb ebVar = f237809c;
                if (ebVar == null) {
                    synchronized (C87916ii.class) {
                        ebVar = f237809c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237808b);
                            f237809c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
