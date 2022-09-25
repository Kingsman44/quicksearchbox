package com.google.p343ac.p346b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ac.b.p */
/* compiled from: PG */
public final class C6654p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C6654p f19890c;

    /* renamed from: e */
    private static volatile C63010eb f19891e;

    /* renamed from: a */
    public int f19892a;

    /* renamed from: b */
    public C63088z f19893b = C63088z.f170246b;

    /* renamed from: d */
    private int f19894d;

    static {
        C6654p pVar = new C6654p();
        f19890c = pVar;
        C62942bv.registerDefaultInstance(C6654p.class, pVar);
    }

    private C6654p() {
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
                return newMessageInfo(f19890c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"d", "a", C6652n.f19889a, "b"});
            case 3:
                return new C6654p();
            case 4:
                return new C6651m();
            case 5:
                return f19890c;
            case 6:
                C63010eb ebVar = f19891e;
                if (ebVar == null) {
                    synchronized (C6654p.class) {
                        ebVar = f19891e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19890c);
                            f19891e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
