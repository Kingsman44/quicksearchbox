package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.fa */
/* compiled from: PG */
public final class C49062fa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49062fa f126907e;

    /* renamed from: f */
    private static volatile C63010eb f126908f;

    /* renamed from: a */
    public int f126909a;

    /* renamed from: b */
    public int f126910b;

    /* renamed from: c */
    public int f126911c = -1;

    /* renamed from: d */
    public long f126912d;

    static {
        C49062fa faVar = new C49062fa();
        f126907e = faVar;
        C62942bv.registerDefaultInstance(C49062fa.class, faVar);
    }

    private C49062fa() {
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
                return newMessageInfo(f126907e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003င\u0001\u0006ဂ\u0002", new Object[]{"a", "b", C49060ez.m85356b(), C45240c.f118157a, "d"});
            case 3:
                return new C49062fa();
            case 4:
                return new C49058ex();
            case 5:
                return f126907e;
            case 6:
                C63010eb ebVar = f126908f;
                if (ebVar == null) {
                    synchronized (C49062fa.class) {
                        ebVar = f126908f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126907e);
                            f126908f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
