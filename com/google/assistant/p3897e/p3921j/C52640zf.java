package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.zf */
/* compiled from: PG */
public final class C52640zf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52640zf f138212e;

    /* renamed from: f */
    private static volatile C63010eb f138213f;

    /* renamed from: a */
    public int f138214a;

    /* renamed from: b */
    public aco f138215b;

    /* renamed from: c */
    public C52644zj f138216c;

    /* renamed from: d */
    public boolean f138217d;

    static {
        C52640zf zfVar = new C52640zf();
        f138212e = zfVar;
        C62942bv.registerDefaultInstance(C52640zf.class, zfVar);
    }

    private C52640zf() {
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
                return newMessageInfo(f138212e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52640zf();
            case 4:
                return new C52639ze();
            case 5:
                return f138212e;
            case 6:
                C63010eb ebVar = f138213f;
                if (ebVar == null) {
                    synchronized (C52640zf.class) {
                        ebVar = f138213f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138212e);
                            f138213f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
