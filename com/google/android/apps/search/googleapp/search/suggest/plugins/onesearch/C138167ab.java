package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ab */
/* compiled from: PG */
public final class C138167ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138167ab f375931d;

    /* renamed from: e */
    private static volatile C63010eb f375932e;

    /* renamed from: a */
    public int f375933a;

    /* renamed from: b */
    public long f375934b;

    /* renamed from: c */
    public C63088z f375935c = C63088z.f170246b;

    static {
        C138167ab abVar = new C138167ab();
        f375931d = abVar;
        C62942bv.registerDefaultInstance(C138167ab.class, abVar);
    }

    private C138167ab() {
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
                return newMessageInfo(f375931d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138167ab();
            case 4:
                return new C138166aa();
            case 5:
                return f375931d;
            case 6:
                C63010eb ebVar = f375932e;
                if (ebVar == null) {
                    synchronized (C138167ab.class) {
                        ebVar = f375932e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375931d);
                            f375932e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
