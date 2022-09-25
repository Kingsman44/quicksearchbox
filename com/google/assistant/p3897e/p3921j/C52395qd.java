package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.qd */
/* compiled from: PG */
public final class C52395qd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52395qd f137485e;

    /* renamed from: f */
    private static volatile C63010eb f137486f;

    /* renamed from: a */
    public int f137487a;

    /* renamed from: b */
    public C52393qb f137488b;

    /* renamed from: c */
    public C52403ql f137489c;

    /* renamed from: d */
    public C52405qn f137490d;

    static {
        C52395qd qdVar = new C52395qd();
        f137485e = qdVar;
        C62942bv.registerDefaultInstance(C52395qd.class, qdVar);
    }

    private C52395qd() {
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
                return newMessageInfo(f137485e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52395qd();
            case 4:
                return new C52394qc();
            case 5:
                return f137485e;
            case 6:
                C63010eb ebVar = f137486f;
                if (ebVar == null) {
                    synchronized (C52395qd.class) {
                        ebVar = f137486f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137485e);
                            f137486f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
