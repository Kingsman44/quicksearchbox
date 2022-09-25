package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.tk */
/* compiled from: PG */
public final class C52483tk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52483tk f137766c;

    /* renamed from: d */
    private static volatile C63010eb f137767d;

    /* renamed from: a */
    public int f137768a;

    /* renamed from: b */
    public C52115fu f137769b;

    static {
        C52483tk tkVar = new C52483tk();
        f137766c = tkVar;
        C62942bv.registerDefaultInstance(C52483tk.class, tkVar);
    }

    private C52483tk() {
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
                return newMessageInfo(f137766c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52483tk();
            case 4:
                return new C52482tj();
            case 5:
                return f137766c;
            case 6:
                C63010eb ebVar = f137767d;
                if (ebVar == null) {
                    synchronized (C52483tk.class) {
                        ebVar = f137767d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137766c);
                            f137767d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
