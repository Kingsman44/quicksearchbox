package com.google.assistant.p3860as;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.u */
/* compiled from: PG */
public final class C49807u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49807u f128653c;

    /* renamed from: d */
    private static volatile C63010eb f128654d;

    /* renamed from: a */
    public int f128655a = 0;

    /* renamed from: b */
    public Object f128656b;

    static {
        C49807u uVar = new C49807u();
        f128653c = uVar;
        C62942bv.registerDefaultInstance(C49807u.class, uVar);
    }

    private C49807u() {
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
                return newMessageInfo(f128653c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C49809w.class, C49809w.class, C49809w.class, C49738aa.class});
            case 3:
                return new C49807u();
            case 4:
                return new C49805s();
            case 5:
                return f128653c;
            case 6:
                C63010eb ebVar = f128654d;
                if (ebVar == null) {
                    synchronized (C49807u.class) {
                        ebVar = f128654d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128653c);
                            f128654d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
