package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.acc */
/* compiled from: PG */
public final class acc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final acc f134794e;

    /* renamed from: f */
    private static volatile C63010eb f134795f;

    /* renamed from: a */
    public int f134796a;

    /* renamed from: b */
    public C63088z f134797b = C63088z.f170246b;

    /* renamed from: c */
    public int f134798c;

    /* renamed from: d */
    public acb f134799d;

    static {
        acc acc = new acc();
        f134794e = acc;
        C62942bv.registerDefaultInstance(acc.class, acc);
    }

    private acc() {
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
                return newMessageInfo(f134794e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ည\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new acc();
            case 4:
                return new abz();
            case 5:
                return f134794e;
            case 6:
                C63010eb ebVar = f134795f;
                if (ebVar == null) {
                    synchronized (acc.class) {
                        ebVar = f134795f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134794e);
                            f134795f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
