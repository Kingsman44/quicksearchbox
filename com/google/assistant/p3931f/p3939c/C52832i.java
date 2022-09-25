package com.google.assistant.p3931f.p3939c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.i */
/* compiled from: PG */
public final class C52832i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52832i f138623d;

    /* renamed from: e */
    private static volatile C63010eb f138624e;

    /* renamed from: a */
    public C52818ah f138625a;

    /* renamed from: b */
    public C52836m f138626b;

    /* renamed from: c */
    public int f138627c;

    static {
        C52832i iVar = new C52832i();
        f138623d = iVar;
        C62942bv.registerDefaultInstance(C52832i.class, iVar);
    }

    private C52832i() {
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
                return newMessageInfo(f138623d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C52832i();
            case 4:
                return new C52830g();
            case 5:
                return f138623d;
            case 6:
                C63010eb ebVar = f138624e;
                if (ebVar == null) {
                    synchronized (C52832i.class) {
                        ebVar = f138624e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138623d);
                            f138624e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
