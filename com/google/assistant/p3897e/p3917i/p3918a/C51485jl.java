package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.jl */
/* compiled from: PG */
public final class C51485jl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51485jl f134149c;

    /* renamed from: d */
    private static volatile C63010eb f134150d;

    /* renamed from: a */
    public int f134151a;

    /* renamed from: b */
    public int f134152b;

    static {
        C51485jl jlVar = new C51485jl();
        f134149c = jlVar;
        C62942bv.registerDefaultInstance(C51485jl.class, jlVar);
    }

    private C51485jl() {
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
                return newMessageInfo(f134149c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C51484jk.m86199b()});
            case 3:
                return new C51485jl();
            case 4:
                return new C51482ji();
            case 5:
                return f134149c;
            case 6:
                C63010eb ebVar = f134150d;
                if (ebVar == null) {
                    synchronized (C51485jl.class) {
                        ebVar = f134150d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134149c);
                            f134150d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
