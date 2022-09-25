package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.c */
/* compiled from: PG */
public final class C62783c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62783c f169543a;

    /* renamed from: b */
    private static volatile C63010eb f169544b;

    static {
        C62783c cVar = new C62783c();
        f169543a = cVar;
        C62942bv.registerDefaultInstance(C62783c.class, cVar);
    }

    private C62783c() {
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
                return newMessageInfo(f169543a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62783c();
            case 4:
                return new C62763b();
            case 5:
                return f169543a;
            case 6:
                C63010eb ebVar = f169544b;
                if (ebVar == null) {
                    synchronized (C62783c.class) {
                        ebVar = f169544b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169543a);
                            f169544b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
