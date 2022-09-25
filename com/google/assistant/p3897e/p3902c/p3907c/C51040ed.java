package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.ed */
/* compiled from: PG */
public final class C51040ed extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51040ed f132896c;

    /* renamed from: d */
    private static volatile C63010eb f132897d;

    /* renamed from: a */
    public int f132898a;

    /* renamed from: b */
    public C51049em f132899b;

    static {
        C51040ed edVar = new C51040ed();
        f132896c = edVar;
        C62942bv.registerDefaultInstance(C51040ed.class, edVar);
    }

    private C51040ed() {
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
                return newMessageInfo(f132896c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51040ed();
            case 4:
                return new C51039ec();
            case 5:
                return f132896c;
            case 6:
                C63010eb ebVar = f132897d;
                if (ebVar == null) {
                    synchronized (C51040ed.class) {
                        ebVar = f132897d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132896c);
                            f132897d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
