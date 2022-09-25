package com.google.android.libraries.assistant.auto.tng.morris.p1067b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.b.z */
/* compiled from: PG */
public final class C14098z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14098z f42765e;

    /* renamed from: f */
    private static volatile C63010eb f42766f;

    /* renamed from: a */
    public int f42767a;

    /* renamed from: b */
    public int f42768b;

    /* renamed from: c */
    public int f42769c;

    /* renamed from: d */
    public int f42770d;

    static {
        C14098z zVar = new C14098z();
        f42765e = zVar;
        C62942bv.registerDefaultInstance(C14098z.class, zVar);
    }

    private C14098z() {
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
                return newMessageInfo(f42765e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C14098z();
            case 4:
                return new C14097y();
            case 5:
                return f42765e;
            case 6:
                C63010eb ebVar = f42766f;
                if (ebVar == null) {
                    synchronized (C14098z.class) {
                        ebVar = f42766f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42765e);
                            f42766f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
