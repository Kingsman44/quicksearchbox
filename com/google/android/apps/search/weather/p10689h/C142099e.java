package com.google.android.apps.search.weather.p10689h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.weather.h.e */
/* compiled from: PG */
public final class C142099e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142099e f385514c;

    /* renamed from: d */
    private static volatile C63010eb f385515d;

    /* renamed from: a */
    public int f385516a;

    /* renamed from: b */
    public boolean f385517b;

    static {
        C142099e eVar = new C142099e();
        f385514c = eVar;
        C62942bv.registerDefaultInstance(C142099e.class, eVar);
    }

    private C142099e() {
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
                return newMessageInfo(f385514c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C142099e();
            case 4:
                return new C142098d();
            case 5:
                return f385514c;
            case 6:
                C63010eb ebVar = f385515d;
                if (ebVar == null) {
                    synchronized (C142099e.class) {
                        ebVar = f385515d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f385514c);
                            f385515d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
