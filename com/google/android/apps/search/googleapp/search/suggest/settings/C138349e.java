package com.google.android.apps.search.googleapp.search.suggest.settings;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.settings.e */
/* compiled from: PG */
public final class C138349e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138349e f376393d;

    /* renamed from: e */
    private static volatile C63010eb f376394e;

    /* renamed from: a */
    public int f376395a;

    /* renamed from: b */
    public int f376396b;

    /* renamed from: c */
    public int f376397c;

    static {
        C138349e eVar = new C138349e();
        f376393d = eVar;
        C62942bv.registerDefaultInstance(C138349e.class, eVar);
    }

    private C138349e() {
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
                return newMessageInfo(f376393d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138349e();
            case 4:
                return new C138348d();
            case 5:
                return f376393d;
            case 6:
                C63010eb ebVar = f376394e;
                if (ebVar == null) {
                    synchronized (C138349e.class) {
                        ebVar = f376394e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376393d);
                            f376394e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
