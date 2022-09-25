package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ce */
/* compiled from: PG */
public final class C48985ce extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48985ce f126722e;

    /* renamed from: f */
    private static volatile C63010eb f126723f;

    /* renamed from: a */
    public int f126724a = 0;

    /* renamed from: b */
    public Object f126725b;

    /* renamed from: c */
    public int f126726c = 0;

    /* renamed from: d */
    public Object f126727d;

    static {
        C48985ce ceVar = new C48985ce();
        f126722e = ceVar;
        C62942bv.registerDefaultInstance(C48985ce.class, ceVar);
    }

    private C48985ce() {
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
                return newMessageInfo(f126722e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0001\u0003ြ\u0001\u0004ြ\u0000", new Object[]{"b", "a", "d", C45240c.f118157a, C48983cc.class, C48976bw.class, C48981ca.class, C48974bu.class});
            case 3:
                return new C48985ce();
            case 4:
                return new C48972bs();
            case 5:
                return f126722e;
            case 6:
                C63010eb ebVar = f126723f;
                if (ebVar == null) {
                    synchronized (C48985ce.class) {
                        ebVar = f126723f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126722e);
                            f126723f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
