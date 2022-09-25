package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.au */
/* compiled from: PG */
public final class C13033au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13033au f40462c;

    /* renamed from: d */
    private static volatile C63010eb f40463d;

    /* renamed from: a */
    public int f40464a = 0;

    /* renamed from: b */
    public Object f40465b;

    static {
        C13033au auVar = new C13033au();
        f40462c = auVar;
        C62942bv.registerDefaultInstance(C13033au.class, auVar);
    }

    private C13033au() {
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
                return newMessageInfo(f40462c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C13032at.class, C13030ar.class});
            case 3:
                return new C13033au();
            case 4:
                return new C13028ap();
            case 5:
                return f40462c;
            case 6:
                C63010eb ebVar = f40463d;
                if (ebVar == null) {
                    synchronized (C13033au.class) {
                        ebVar = f40463d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40462c);
                            f40463d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
