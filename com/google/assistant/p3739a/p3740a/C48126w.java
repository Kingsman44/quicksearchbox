package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.w */
/* compiled from: PG */
public final class C48126w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48126w f124550b;

    /* renamed from: c */
    private static volatile C63010eb f124551c;

    /* renamed from: a */
    public int f124552a;

    static {
        C48126w wVar = new C48126w();
        f124550b = wVar;
        C62942bv.registerDefaultInstance(C48126w.class, wVar);
    }

    private C48126w() {
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
                return newMessageInfo(f124550b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C48126w();
            case 4:
                return new C48125v();
            case 5:
                return f124550b;
            case 6:
                C63010eb ebVar = f124551c;
                if (ebVar == null) {
                    synchronized (C48126w.class) {
                        ebVar = f124551c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124550b);
                            f124551c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
