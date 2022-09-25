package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.r */
/* compiled from: PG */
public final class C52790r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52790r f138495a;

    /* renamed from: d */
    private static volatile C63010eb f138496d;

    /* renamed from: b */
    private int f138497b;

    /* renamed from: c */
    private C52783k f138498c;

    static {
        C52790r rVar = new C52790r();
        f138495a = rVar;
        C62942bv.registerDefaultInstance(C52790r.class, rVar);
    }

    private C52790r() {
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
                return newMessageInfo(f138495a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52790r();
            case 4:
                return new C52789q();
            case 5:
                return f138495a;
            case 6:
                C63010eb ebVar = f138496d;
                if (ebVar == null) {
                    synchronized (C52790r.class) {
                        ebVar = f138496d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138495a);
                            f138496d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
