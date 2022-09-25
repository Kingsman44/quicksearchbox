package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.zt */
/* compiled from: PG */
public final class C52654zt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52654zt f138233e;

    /* renamed from: f */
    private static volatile C63010eb f138234f;

    /* renamed from: a */
    public int f138235a;

    /* renamed from: b */
    public int f138236b;

    /* renamed from: c */
    public int f138237c;

    /* renamed from: d */
    public int f138238d;

    static {
        C52654zt ztVar = new C52654zt();
        f138233e = ztVar;
        C62942bv.registerDefaultInstance(C52654zt.class, ztVar);
    }

    private C52654zt() {
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
                return newMessageInfo(f138233e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0003\u0004ဌ\u0001", new Object[]{"a", "b", C52647zm.f138230a, "d", C52652zr.f138232a, C45240c.f118157a, C52650zp.f138231a});
            case 3:
                return new C52654zt();
            case 4:
                return new C52649zo();
            case 5:
                return f138233e;
            case 6:
                C63010eb ebVar = f138234f;
                if (ebVar == null) {
                    synchronized (C52654zt.class) {
                        ebVar = f138234f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138233e);
                            f138234f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
