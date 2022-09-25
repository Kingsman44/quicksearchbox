package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hn */
/* compiled from: PG */
public final class C51131hn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51131hn f133088b;

    /* renamed from: d */
    private static volatile C63010eb f133089d;

    /* renamed from: a */
    public int f133090a;

    /* renamed from: c */
    private int f133091c;

    static {
        C51131hn hnVar = new C51131hn();
        f133088b = hnVar;
        C62942bv.registerDefaultInstance(C51131hn.class, hnVar);
    }

    private C51131hn() {
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
                return newMessageInfo(f133088b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C51129hl.f133087a});
            case 3:
                return new C51131hn();
            case 4:
                return new C51128hk();
            case 5:
                return f133088b;
            case 6:
                C63010eb ebVar = f133089d;
                if (ebVar == null) {
                    synchronized (C51131hn.class) {
                        ebVar = f133089d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133088b);
                            f133089d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
