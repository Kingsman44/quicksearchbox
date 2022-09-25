package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ac */
/* compiled from: PG */
public final class C138548ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138548ac f376834c;

    /* renamed from: d */
    private static volatile C63010eb f376835d;

    /* renamed from: a */
    public int f376836a;

    /* renamed from: b */
    public int f376837b;

    static {
        C138548ac acVar = new C138548ac();
        f376834c = acVar;
        C62942bv.registerDefaultInstance(C138548ac.class, acVar);
    }

    private C138548ac() {
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
                return newMessageInfo(f376834c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C139704d.m227142b()});
            case 3:
                return new C138548ac();
            case 4:
                return new C138547ab();
            case 5:
                return f376834c;
            case 6:
                C63010eb ebVar = f376835d;
                if (ebVar == null) {
                    synchronized (C138548ac.class) {
                        ebVar = f376835d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376834c);
                            f376835d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
