package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.qb */
/* compiled from: PG */
public final class C52393qb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52393qb f137479e;

    /* renamed from: f */
    private static volatile C63010eb f137480f;

    /* renamed from: a */
    public int f137481a;

    /* renamed from: b */
    public int f137482b;

    /* renamed from: c */
    public int f137483c;

    /* renamed from: d */
    public int f137484d;

    static {
        C52393qb qbVar = new C52393qb();
        f137479e = qbVar;
        C62942bv.registerDefaultInstance(C52393qb.class, qbVar);
    }

    private C52393qb() {
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
                return newMessageInfo(f137479e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52393qb();
            case 4:
                return new C52392qa();
            case 5:
                return f137479e;
            case 6:
                C63010eb ebVar = f137480f;
                if (ebVar == null) {
                    synchronized (C52393qb.class) {
                        ebVar = f137480f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137479e);
                            f137480f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
