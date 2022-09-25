package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.cm */
/* compiled from: PG */
public final class C48106cm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48106cm f124507b;

    /* renamed from: c */
    private static volatile C63010eb f124508c;

    /* renamed from: a */
    public boolean f124509a;

    static {
        C48106cm cmVar = new C48106cm();
        f124507b = cmVar;
        C62942bv.registerDefaultInstance(C48106cm.class, cmVar);
    }

    private C48106cm() {
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
                return newMessageInfo(f124507b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C48106cm();
            case 4:
                return new C48105cl();
            case 5:
                return f124507b;
            case 6:
                C63010eb ebVar = f124508c;
                if (ebVar == null) {
                    synchronized (C48106cm.class) {
                        ebVar = f124508c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124507b);
                            f124508c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
