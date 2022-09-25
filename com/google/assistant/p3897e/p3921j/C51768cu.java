package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.cu */
/* compiled from: PG */
public final class C51768cu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51768cu f135816e;

    /* renamed from: f */
    private static volatile C63010eb f135817f;

    /* renamed from: a */
    public int f135818a;

    /* renamed from: b */
    public boolean f135819b;

    /* renamed from: c */
    public boolean f135820c;

    /* renamed from: d */
    public C51713bk f135821d;

    static {
        C51768cu cuVar = new C51768cu();
        f135816e = cuVar;
        C62942bv.registerDefaultInstance(C51768cu.class, cuVar);
    }

    private C51768cu() {
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
                return newMessageInfo(f135816e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51768cu();
            case 4:
                return new C51767ct();
            case 5:
                return f135816e;
            case 6:
                C63010eb ebVar = f135817f;
                if (ebVar == null) {
                    synchronized (C51768cu.class) {
                        ebVar = f135817f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135816e);
                            f135817f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
