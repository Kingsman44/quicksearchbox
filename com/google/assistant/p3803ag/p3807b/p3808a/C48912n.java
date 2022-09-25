package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.n */
/* compiled from: PG */
public final class C48912n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48912n f126565c;

    /* renamed from: d */
    private static volatile C63010eb f126566d;

    /* renamed from: a */
    public int f126567a = 0;

    /* renamed from: b */
    public Object f126568b;

    static {
        C48912n nVar = new C48912n();
        f126565c = nVar;
        C62942bv.registerDefaultInstance(C48912n.class, nVar);
    }

    private C48912n() {
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
                return newMessageInfo(f126565c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဵ\u0000\u0003်\u0000", new Object[]{"b", "a"});
            case 3:
                return new C48912n();
            case 4:
                return new C48910l();
            case 5:
                return f126565c;
            case 6:
                C63010eb ebVar = f126566d;
                if (ebVar == null) {
                    synchronized (C48912n.class) {
                        ebVar = f126566d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126565c);
                            f126566d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
