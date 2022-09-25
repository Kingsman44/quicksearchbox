package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.dk */
/* compiled from: PG */
public final class C51020dk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51020dk f132842d;

    /* renamed from: f */
    private static volatile C63010eb f132843f;

    /* renamed from: a */
    public C52081en f132844a;

    /* renamed from: b */
    public boolean f132845b;

    /* renamed from: c */
    public boolean f132846c;

    /* renamed from: e */
    private int f132847e;

    static {
        C51020dk dkVar = new C51020dk();
        f132842d = dkVar;
        C62942bv.registerDefaultInstance(C51020dk.class, dkVar);
    }

    private C51020dk() {
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
                return newMessageInfo(f132842d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C51020dk();
            case 4:
                return new C51019dj();
            case 5:
                return f132842d;
            case 6:
                C63010eb ebVar = f132843f;
                if (ebVar == null) {
                    synchronized (C51020dk.class) {
                        ebVar = f132843f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132842d);
                            f132843f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
