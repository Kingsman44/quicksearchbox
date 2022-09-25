package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x */
/* compiled from: PG */
public final class C38160x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38160x f101118c;

    /* renamed from: d */
    private static volatile C63010eb f101119d;

    /* renamed from: a */
    public int f101120a;

    /* renamed from: b */
    public int f101121b;

    static {
        C38160x xVar = new C38160x();
        f101118c = xVar;
        C62942bv.registerDefaultInstance(C38160x.class, xVar);
    }

    private C38160x() {
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
                return newMessageInfo(f101118c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C38284z.m67598b()});
            case 3:
                return new C38160x();
            case 4:
                return new C38121w();
            case 5:
                return f101118c;
            case 6:
                C63010eb ebVar = f101119d;
                if (ebVar == null) {
                    synchronized (C38160x.class) {
                        ebVar = f101119d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101118c);
                            f101119d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
