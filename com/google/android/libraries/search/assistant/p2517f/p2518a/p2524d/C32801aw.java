package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.aw */
/* compiled from: PG */
public final class C32801aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32801aw f87978c;

    /* renamed from: e */
    private static volatile C63010eb f87979e;

    /* renamed from: a */
    public int f87980a = 0;

    /* renamed from: b */
    public Object f87981b;

    /* renamed from: d */
    private byte f87982d = 2;

    static {
        C32801aw awVar = new C32801aw();
        f87978c = awVar;
        C62942bv.registerDefaultInstance(C32801aw.class, awVar);
    }

    private C32801aw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f87982d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f87982d = b;
                return null;
            case 2:
                return newMessageInfo(f87978c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C32806ba.class, C32857cy.class, C32814bi.class, C32818bm.class, C32829bx.class, C32877w.class, C32834cb.class});
            case 3:
                return new C32801aw();
            case 4:
                return new C32799au();
            case 5:
                return f87978c;
            case 6:
                C63010eb ebVar = f87979e;
                if (ebVar == null) {
                    synchronized (C32801aw.class) {
                        ebVar = f87979e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87978c);
                            f87979e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
