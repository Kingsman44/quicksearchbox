package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.e.fu */
/* compiled from: PG */
public final class C51968fu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51968fu f136374d;

    /* renamed from: e */
    private static volatile C63010eb f136375e;

    /* renamed from: a */
    public int f136376a;

    /* renamed from: b */
    public C63088z f136377b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f136378c;

    static {
        C51968fu fuVar = new C51968fu();
        f136374d = fuVar;
        C62942bv.registerDefaultInstance(C51968fu.class, fuVar);
    }

    private C51968fu() {
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
                return newMessageInfo(f136374d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51968fu();
            case 4:
                return new C51967ft();
            case 5:
                return f136374d;
            case 6:
                C63010eb ebVar = f136375e;
                if (ebVar == null) {
                    synchronized (C51968fu.class) {
                        ebVar = f136375e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136374d);
                            f136375e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
