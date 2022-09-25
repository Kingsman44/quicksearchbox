package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.k */
/* compiled from: PG */
public final class C52229k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52229k f137053c;

    /* renamed from: d */
    private static volatile C63010eb f137054d;

    /* renamed from: a */
    public int f137055a = 0;

    /* renamed from: b */
    public Object f137056b;

    static {
        C52229k kVar = new C52229k();
        f137053c = kVar;
        C62942bv.registerDefaultInstance(C52229k.class, kVar);
    }

    private C52229k() {
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
                return newMessageInfo(f137053c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C52391q.class, C52445s.class});
            case 3:
                return new C52229k();
            case 4:
                return new C52202j();
            case 5:
                return f137053c;
            case 6:
                C63010eb ebVar = f137054d;
                if (ebVar == null) {
                    synchronized (C52229k.class) {
                        ebVar = f137054d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137053c);
                            f137054d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
