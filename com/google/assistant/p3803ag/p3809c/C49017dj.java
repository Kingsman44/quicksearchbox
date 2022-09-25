package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.dj */
/* compiled from: PG */
public final class C49017dj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49017dj f126788c;

    /* renamed from: d */
    private static volatile C63010eb f126789d;

    /* renamed from: a */
    public int f126790a = 0;

    /* renamed from: b */
    public Object f126791b;

    static {
        C49017dj djVar = new C49017dj();
        f126788c = djVar;
        C62942bv.registerDefaultInstance(C49017dj.class, djVar);
    }

    private C49017dj() {
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
                return newMessageInfo(f126788c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C49005cy.class, C49016di.class, C49010dc.class, C49012de.class});
            case 3:
                return new C49017dj();
            case 4:
                return new C49006cz();
            case 5:
                return f126788c;
            case 6:
                C63010eb ebVar = f126789d;
                if (ebVar == null) {
                    synchronized (C49017dj.class) {
                        ebVar = f126789d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126788c);
                            f126789d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
