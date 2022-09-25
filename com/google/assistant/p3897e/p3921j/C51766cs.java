package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.cs */
/* compiled from: PG */
public final class C51766cs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f135810c = new C51760cm();

    /* renamed from: e */
    public static final C51766cs f135811e;

    /* renamed from: f */
    private static volatile C63010eb f135812f;

    /* renamed from: a */
    public int f135813a;

    /* renamed from: b */
    public C62961ch f135814b = emptyIntList();

    /* renamed from: d */
    public C51765cr f135815d;

    static {
        C51766cs csVar = new C51766cs();
        f135811e = csVar;
        C62942bv.registerDefaultInstance(C51766cs.class, csVar);
    }

    private C51766cs() {
        emptyIntList();
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
                return newMessageInfo(f135811e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဉ\u0000", new Object[]{"a", "b", C51763cp.m86379b(), "d"});
            case 3:
                return new C51766cs();
            case 4:
                return new C51761cn();
            case 5:
                return f135811e;
            case 6:
                C63010eb ebVar = f135812f;
                if (ebVar == null) {
                    synchronized (C51766cs.class) {
                        ebVar = f135812f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135811e);
                            f135812f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
