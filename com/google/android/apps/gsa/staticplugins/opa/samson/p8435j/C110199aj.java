package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import com.google.android.apps.gsa.assistant.shared.l.t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.aj */
/* compiled from: PG */
public final class C110199aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C110199aj f307070c;

    /* renamed from: d */
    private static volatile C63010eb f307071d;

    /* renamed from: a */
    public int f307072a;

    /* renamed from: b */
    public t f307073b;

    static {
        C110199aj ajVar = new C110199aj();
        f307070c = ajVar;
        C62942bv.registerDefaultInstance(C110199aj.class, ajVar);
    }

    private C110199aj() {
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
                return newMessageInfo(f307070c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C110199aj();
            case 4:
                return new C110198ai();
            case 5:
                return f307070c;
            case 6:
                C63010eb ebVar = f307071d;
                if (ebVar == null) {
                    synchronized (C110199aj.class) {
                        ebVar = f307071d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f307070c);
                            f307071d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
