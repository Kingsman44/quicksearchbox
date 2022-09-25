package com.google.assistant.p3820ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ak.k */
/* compiled from: PG */
public final class C49212k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49212k f127240c;

    /* renamed from: e */
    private static volatile C63010eb f127241e;

    /* renamed from: a */
    public int f127242a;

    /* renamed from: b */
    public C49210i f127243b;

    /* renamed from: d */
    private int f127244d;

    static {
        C49212k kVar = new C49212k();
        f127240c = kVar;
        C62942bv.registerDefaultInstance(C49212k.class, kVar);
    }

    private C49212k() {
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
                return newMessageInfo(f127240c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49212k();
            case 4:
                return new C49211j();
            case 5:
                return f127240c;
            case 6:
                C63010eb ebVar = f127241e;
                if (ebVar == null) {
                    synchronized (C49212k.class) {
                        ebVar = f127241e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127240c);
                            f127241e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
