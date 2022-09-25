package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.au */
/* compiled from: PG */
public final class C49275au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49275au f127371c;

    /* renamed from: d */
    private static volatile C63010eb f127372d;

    /* renamed from: a */
    public int f127373a = 0;

    /* renamed from: b */
    public Object f127374b;

    static {
        C49275au auVar = new C49275au();
        f127371c = auVar;
        C62942bv.registerDefaultInstance(C49275au.class, auVar);
    }

    private C49275au() {
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
                return newMessageInfo(f127371c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C49275au();
            case 4:
                return new C49274at();
            case 5:
                return f127371c;
            case 6:
                C63010eb ebVar = f127372d;
                if (ebVar == null) {
                    synchronized (C49275au.class) {
                        ebVar = f127372d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127371c);
                            f127372d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
