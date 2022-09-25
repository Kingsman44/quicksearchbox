package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.p */
/* compiled from: PG */
public final class C106288p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106288p f296551c;

    /* renamed from: d */
    private static volatile C63010eb f296552d;

    /* renamed from: a */
    public int f296553a;

    /* renamed from: b */
    public bf f296554b;

    static {
        C106288p pVar = new C106288p();
        f296551c = pVar;
        C62942bv.registerDefaultInstance(C106288p.class, pVar);
    }

    private C106288p() {
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
                return newMessageInfo(f296551c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C106288p();
            case 4:
                return new C106287o();
            case 5:
                return f296551c;
            case 6:
                C63010eb ebVar = f296552d;
                if (ebVar == null) {
                    synchronized (C106288p.class) {
                        ebVar = f296552d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296551c);
                            f296552d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
