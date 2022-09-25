package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.cu */
/* compiled from: PG */
public final class C32853cu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C32853cu f88067f;

    /* renamed from: g */
    private static volatile C63010eb f88068g;

    /* renamed from: a */
    public int f88069a;

    /* renamed from: b */
    public C32796ar f88070b;

    /* renamed from: c */
    public boolean f88071c;

    /* renamed from: d */
    public boolean f88072d;

    /* renamed from: e */
    public boolean f88073e;

    static {
        C32853cu cuVar = new C32853cu();
        f88067f = cuVar;
        C62942bv.registerDefaultInstance(C32853cu.class, cuVar);
    }

    private C32853cu() {
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
                return newMessageInfo(f88067f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C32853cu();
            case 4:
                return new C32852ct();
            case 5:
                return f88067f;
            case 6:
                C63010eb ebVar = f88068g;
                if (ebVar == null) {
                    synchronized (C32853cu.class) {
                        ebVar = f88068g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88067f);
                            f88068g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
