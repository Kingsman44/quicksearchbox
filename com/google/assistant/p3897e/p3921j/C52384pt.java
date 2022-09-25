package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.pt */
/* compiled from: PG */
public final class C52384pt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52384pt f137457c;

    /* renamed from: d */
    private static volatile C63010eb f137458d;

    /* renamed from: a */
    public int f137459a;

    /* renamed from: b */
    public boolean f137460b;

    static {
        C52384pt ptVar = new C52384pt();
        f137457c = ptVar;
        C62942bv.registerDefaultInstance(C52384pt.class, ptVar);
    }

    private C52384pt() {
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
                return newMessageInfo(f137457c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52384pt();
            case 4:
                return new C52383ps();
            case 5:
                return f137457c;
            case 6:
                C63010eb ebVar = f137458d;
                if (ebVar == null) {
                    synchronized (C52384pt.class) {
                        ebVar = f137458d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137457c);
                            f137458d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
