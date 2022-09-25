package com.google.common.p4552o.p4556c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.c.j */
/* compiled from: PG */
public final class C59683j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59683j f160017d;

    /* renamed from: e */
    private static volatile C63010eb f160018e;

    /* renamed from: a */
    public int f160019a;

    /* renamed from: b */
    public int f160020b;

    /* renamed from: c */
    public boolean f160021c;

    static {
        C59683j jVar = new C59683j();
        f160017d = jVar;
        C62942bv.registerDefaultInstance(C59683j.class, jVar);
    }

    private C59683j() {
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
                return newMessageInfo(f160017d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59683j();
            case 4:
                return new C59682i();
            case 5:
                return f160017d;
            case 6:
                C63010eb ebVar = f160018e;
                if (ebVar == null) {
                    synchronized (C59683j.class) {
                        ebVar = f160018e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160017d);
                            f160018e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
