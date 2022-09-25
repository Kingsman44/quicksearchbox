package com.google.assistant.p4008y.p4009a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.bh */
/* compiled from: PG */
public final class C53575bh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53575bh f140613e;

    /* renamed from: f */
    private static volatile C63010eb f140614f;

    /* renamed from: a */
    public int f140615a;

    /* renamed from: b */
    public int f140616b = 0;

    /* renamed from: c */
    public Object f140617c;

    /* renamed from: d */
    public int f140618d;

    static {
        C53575bh bhVar = new C53575bh();
        f140613e = bhVar;
        C62942bv.registerDefaultInstance(C53575bh.class, bhVar);
    }

    private C53575bh() {
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
                return newMessageInfo(f140613e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C53573bf.m86873b(), C53571bd.class});
            case 3:
                return new C53575bh();
            case 4:
                return new C53574bg();
            case 5:
                return f140613e;
            case 6:
                C63010eb ebVar = f140614f;
                if (ebVar == null) {
                    synchronized (C53575bh.class) {
                        ebVar = f140614f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140613e);
                            f140614f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
