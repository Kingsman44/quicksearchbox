package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bu */
/* compiled from: PG */
public final class C48087bu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48087bu f124448b;

    /* renamed from: c */
    private static volatile C63010eb f124449c;

    /* renamed from: a */
    public int f124450a;

    static {
        C48087bu buVar = new C48087bu();
        f124448b = buVar;
        C62942bv.registerDefaultInstance(C48087bu.class, buVar);
    }

    private C48087bu() {
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
                return newMessageInfo(f124448b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C48087bu();
            case 4:
                return new C48086bt();
            case 5:
                return f124448b;
            case 6:
                C63010eb ebVar = f124449c;
                if (ebVar == null) {
                    synchronized (C48087bu.class) {
                        ebVar = f124449c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124448b);
                            f124449c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
