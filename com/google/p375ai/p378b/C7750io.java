package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.io */
/* compiled from: PG */
public final class C7750io extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7750io f27119d;

    /* renamed from: e */
    private static volatile C63010eb f27120e;

    /* renamed from: a */
    public int f27121a;

    /* renamed from: b */
    public int f27122b;

    /* renamed from: c */
    public C7625dy f27123c;

    static {
        C7750io ioVar = new C7750io();
        f27119d = ioVar;
        C62942bv.registerDefaultInstance(C7750io.class, ioVar);
    }

    private C7750io() {
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
                return newMessageInfo(f27119d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C7749in.m22837b(), C45240c.f118157a});
            case 3:
                return new C7750io();
            case 4:
                return new C7747il();
            case 5:
                return f27119d;
            case 6:
                C63010eb ebVar = f27120e;
                if (ebVar == null) {
                    synchronized (C7750io.class) {
                        ebVar = f27120e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27119d);
                            f27120e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
