package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.alx */
/* compiled from: PG */
public final class alx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final alx f135354b;

    /* renamed from: c */
    private static volatile C63010eb f135355c;

    /* renamed from: a */
    public C62995dn f135356a = C62995dn.f170057a;

    static {
        alx alx = new alx();
        f135354b = alx;
        C62942bv.registerDefaultInstance(alx.class, alx);
    }

    private alx() {
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
                return newMessageInfo(f135354b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", alw.f135353a});
            case 3:
                return new alx();
            case 4:
                return new alv();
            case 5:
                return f135354b;
            case 6:
                C63010eb ebVar = f135355c;
                if (ebVar == null) {
                    synchronized (alx.class) {
                        ebVar = f135355c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135354b);
                            f135355c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
