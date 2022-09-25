package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.lu */
/* compiled from: PG */
public final class C52277lu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52277lu f137223e;

    /* renamed from: f */
    private static volatile C63010eb f137224f;

    /* renamed from: a */
    public int f137225a;

    /* renamed from: b */
    public int f137226b;

    /* renamed from: c */
    public int f137227c;

    /* renamed from: d */
    public boolean f137228d;

    static {
        C52277lu luVar = new C52277lu();
        f137223e = luVar;
        C62942bv.registerDefaultInstance(C52277lu.class, luVar);
    }

    private C52277lu() {
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
                return newMessageInfo(f137223e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52277lu();
            case 4:
                return new C52276lt();
            case 5:
                return f137223e;
            case 6:
                C63010eb ebVar = f137224f;
                if (ebVar == null) {
                    synchronized (C52277lu.class) {
                        ebVar = f137224f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137223e);
                            f137224f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
