package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.bw */
/* compiled from: PG */
public final class C48976bw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48976bw f126700c;

    /* renamed from: d */
    private static volatile C63010eb f126701d;

    /* renamed from: a */
    public int f126702a;

    /* renamed from: b */
    public long f126703b = 300;

    static {
        C48976bw bwVar = new C48976bw();
        f126700c = bwVar;
        C62942bv.registerDefaultInstance(C48976bw.class, bwVar);
    }

    private C48976bw() {
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
                return newMessageInfo(f126700c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48976bw();
            case 4:
                return new C48975bv();
            case 5:
                return f126700c;
            case 6:
                C63010eb ebVar = f126701d;
                if (ebVar == null) {
                    synchronized (C48976bw.class) {
                        ebVar = f126701d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126700c);
                            f126701d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
