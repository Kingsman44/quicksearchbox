package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ae */
/* compiled from: PG */
public final class C138550ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138550ae f376838c;

    /* renamed from: d */
    private static volatile C63010eb f376839d;

    /* renamed from: a */
    public int f376840a;

    /* renamed from: b */
    public int f376841b;

    static {
        C138550ae aeVar = new C138550ae();
        f376838c = aeVar;
        C62942bv.registerDefaultInstance(C138550ae.class, aeVar);
    }

    private C138550ae() {
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
                return newMessageInfo(f376838c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C139704d.m227142b()});
            case 3:
                return new C138550ae();
            case 4:
                return new C138549ad();
            case 5:
                return f376838c;
            case 6:
                C63010eb ebVar = f376839d;
                if (ebVar == null) {
                    synchronized (C138550ae.class) {
                        ebVar = f376839d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376838c);
                            f376839d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
