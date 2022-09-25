package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.p */
/* compiled from: PG */
public final class C39812p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39812p f104692d;

    /* renamed from: f */
    private static volatile C63010eb f104693f;

    /* renamed from: a */
    public int f104694a;

    /* renamed from: b */
    public int f104695b;

    /* renamed from: c */
    public C39817u f104696c;

    /* renamed from: e */
    private int f104697e;

    static {
        C39812p pVar = new C39812p();
        f104692d = pVar;
        C62942bv.registerDefaultInstance(C39812p.class, pVar);
    }

    private C39812p() {
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
                return newMessageInfo(f104692d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"e", "a", C39808l.f104685a, "b", C39811o.m69226b(), C45240c.f118157a});
            case 3:
                return new C39812p();
            case 4:
                return new C39807k();
            case 5:
                return f104692d;
            case 6:
                C63010eb ebVar = f104693f;
                if (ebVar == null) {
                    synchronized (C39812p.class) {
                        ebVar = f104693f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104692d);
                            f104693f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
