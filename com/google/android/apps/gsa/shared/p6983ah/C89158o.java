package com.google.android.apps.gsa.shared.p6983ah;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ah.o */
/* compiled from: PG */
public final class C89158o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C89158o f241716c;

    /* renamed from: d */
    private static volatile C63010eb f241717d;

    /* renamed from: a */
    public int f241718a;

    /* renamed from: b */
    public int f241719b;

    static {
        C89158o oVar = new C89158o();
        f241716c = oVar;
        C62942bv.registerDefaultInstance(C89158o.class, oVar);
    }

    private C89158o() {
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
                return newMessageInfo(f241716c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C89160q.m145041b()});
            case 3:
                return new C89158o();
            case 4:
                return new C89157n();
            case 5:
                return f241716c;
            case 6:
                C63010eb ebVar = f241717d;
                if (ebVar == null) {
                    synchronized (C89158o.class) {
                        ebVar = f241717d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241716c);
                            f241717d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
