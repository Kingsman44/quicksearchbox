package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.iq */
/* compiled from: PG */
public final class C87924iq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87924iq f237829c;

    /* renamed from: d */
    private static volatile C63010eb f237830d;

    /* renamed from: a */
    public int f237831a;

    /* renamed from: b */
    public int f237832b;

    static {
        C87924iq iqVar = new C87924iq();
        f237829c = iqVar;
        C62942bv.registerDefaultInstance(C87924iq.class, iqVar);
    }

    private C87924iq() {
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
                return newMessageInfo(f237829c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C87923ip.f237828a});
            case 3:
                return new C87924iq();
            case 4:
                return new C87922io();
            case 5:
                return f237829c;
            case 6:
                C63010eb ebVar = f237830d;
                if (ebVar == null) {
                    synchronized (C87924iq.class) {
                        ebVar = f237830d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237829c);
                            f237830d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
