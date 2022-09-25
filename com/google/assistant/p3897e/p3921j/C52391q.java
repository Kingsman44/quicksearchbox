package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.q */
/* compiled from: PG */
public final class C52391q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52391q f137475b;

    /* renamed from: d */
    private static volatile C63010eb f137476d;

    /* renamed from: a */
    public C52337o f137477a;

    /* renamed from: c */
    private int f137478c;

    static {
        C52391q qVar = new C52391q();
        f137475b = qVar;
        C62942bv.registerDefaultInstance(C52391q.class, qVar);
    }

    private C52391q() {
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
                return newMessageInfo(f137475b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52391q();
            case 4:
                return new C52364p();
            case 5:
                return f137475b;
            case 6:
                C63010eb ebVar = f137476d;
                if (ebVar == null) {
                    synchronized (C52391q.class) {
                        ebVar = f137476d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137475b);
                            f137476d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
