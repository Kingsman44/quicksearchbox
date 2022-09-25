package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.d.cl */
/* compiled from: PG */
public final class C142360cl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f386302c = new C142356ch();

    /* renamed from: e */
    public static final C142360cl f386303e;

    /* renamed from: f */
    private static volatile C63010eb f386304f;

    /* renamed from: a */
    public int f386305a;

    /* renamed from: b */
    public C62961ch f386306b = emptyIntList();

    /* renamed from: d */
    public C63088z f386307d = C63088z.f170246b;

    static {
        C142360cl clVar = new C142360cl();
        f386303e = clVar;
        C62942bv.registerDefaultInstance(C142360cl.class, clVar);
    }

    private C142360cl() {
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
                return newMessageInfo(f386303e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ည\u0000", new Object[]{"a", "b", C142359ck.m231066b(), "d"});
            case 3:
                return new C142360cl();
            case 4:
                return new C142357ci();
            case 5:
                return f386303e;
            case 6:
                C63010eb ebVar = f386304f;
                if (ebVar == null) {
                    synchronized (C142360cl.class) {
                        ebVar = f386304f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386303e);
                            f386304f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
