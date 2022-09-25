package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tx */
/* compiled from: PG */
public final class C52496tx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52496tx f137813c;

    /* renamed from: d */
    private static volatile C63010eb f137814d;

    /* renamed from: a */
    public int f137815a;

    /* renamed from: b */
    public C52541vo f137816b;

    static {
        C52496tx txVar = new C52496tx();
        f137813c = txVar;
        C62942bv.registerDefaultInstance(C52496tx.class, txVar);
    }

    private C52496tx() {
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
                return newMessageInfo(f137813c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52496tx();
            case 4:
                return new C52495tw();
            case 5:
                return f137813c;
            case 6:
                C63010eb ebVar = f137814d;
                if (ebVar == null) {
                    synchronized (C52496tx.class) {
                        ebVar = f137814d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137813c);
                            f137814d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
