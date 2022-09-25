package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ah */
/* compiled from: PG */
public final class C51238ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51238ah f133395c;

    /* renamed from: d */
    private static volatile C63010eb f133396d;

    /* renamed from: a */
    public int f133397a = 0;

    /* renamed from: b */
    public Object f133398b;

    static {
        C51238ah ahVar = new C51238ah();
        f133395c = ahVar;
        C62942bv.registerDefaultInstance(C51238ah.class, ahVar);
    }

    private C51238ah() {
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
                return newMessageInfo(f133395c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C51238ah();
            case 4:
                return new C51237ag();
            case 5:
                return f133395c;
            case 6:
                C63010eb ebVar = f133396d;
                if (ebVar == null) {
                    synchronized (C51238ah.class) {
                        ebVar = f133396d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133395c);
                            f133396d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
