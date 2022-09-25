package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.q */
/* compiled from: PG */
public final class C34000q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C34000q f90628b;

    /* renamed from: c */
    private static volatile C63010eb f90629c;

    /* renamed from: a */
    public boolean f90630a;

    static {
        C34000q qVar = new C34000q();
        f90628b = qVar;
        C62942bv.registerDefaultInstance(C34000q.class, qVar);
    }

    private C34000q() {
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
                return newMessageInfo(f90628b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C34000q();
            case 4:
                return new C33999p();
            case 5:
                return f90628b;
            case 6:
                C63010eb ebVar = f90629c;
                if (ebVar == null) {
                    synchronized (C34000q.class) {
                        ebVar = f90629c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90628b);
                            f90629c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
