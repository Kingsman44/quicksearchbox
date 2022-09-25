package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.az */
/* compiled from: PG */
public final class C139074az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139074az f378227d;

    /* renamed from: e */
    private static volatile C63010eb f378228e;

    /* renamed from: a */
    public int f378229a;

    /* renamed from: b */
    public int f378230b;

    /* renamed from: c */
    public int f378231c = -16717825;

    static {
        C139074az azVar = new C139074az();
        f378227d = azVar;
        C62942bv.registerDefaultInstance(C139074az.class, azVar);
    }

    private C139074az() {
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
                return newMessageInfo(f378227d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C139079bd.m225895b(), C45240c.f118157a});
            case 3:
                return new C139074az();
            case 4:
                return new C139073ay();
            case 5:
                return f378227d;
            case 6:
                C63010eb ebVar = f378228e;
                if (ebVar == null) {
                    synchronized (C139074az.class) {
                        ebVar = f378228e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378227d);
                            f378228e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
