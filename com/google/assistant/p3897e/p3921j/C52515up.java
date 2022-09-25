package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.up */
/* compiled from: PG */
public final class C52515up extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52515up f137853d;

    /* renamed from: e */
    private static volatile C63010eb f137854e;

    /* renamed from: a */
    public int f137855a;

    /* renamed from: b */
    public int f137856b;

    /* renamed from: c */
    public C52517ur f137857c;

    static {
        C52515up upVar = new C52515up();
        f137853d = upVar;
        C62942bv.registerDefaultInstance(C52515up.class, upVar);
    }

    private C52515up() {
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
                return newMessageInfo(f137853d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52515up();
            case 4:
                return new C52514uo();
            case 5:
                return f137853d;
            case 6:
                C63010eb ebVar = f137854e;
                if (ebVar == null) {
                    synchronized (C52515up.class) {
                        ebVar = f137854e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137853d);
                            f137854e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
