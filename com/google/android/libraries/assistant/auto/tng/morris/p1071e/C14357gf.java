package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.gf */
/* compiled from: PG */
public final class C14357gf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14357gf f43444e;

    /* renamed from: f */
    private static volatile C63010eb f43445f;

    /* renamed from: a */
    public int f43446a;

    /* renamed from: b */
    public int f43447b;

    /* renamed from: c */
    public int f43448c;

    /* renamed from: d */
    public int f43449d;

    static {
        C14357gf gfVar = new C14357gf();
        f43444e = gfVar;
        C62942bv.registerDefaultInstance(C14357gf.class, gfVar);
    }

    private C14357gf() {
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
                return newMessageInfo(f43444e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0005\f", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14357gf();
            case 4:
                return new C14356ge();
            case 5:
                return f43444e;
            case 6:
                C63010eb ebVar = f43445f;
                if (ebVar == null) {
                    synchronized (C14357gf.class) {
                        ebVar = f43445f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43444e);
                            f43445f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
