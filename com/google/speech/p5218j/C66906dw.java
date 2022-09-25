package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.dw */
/* compiled from: PG */
public final class C66906dw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66906dw f181875e;

    /* renamed from: f */
    private static volatile C63010eb f181876f;

    /* renamed from: a */
    public int f181877a;

    /* renamed from: b */
    public int f181878b;

    /* renamed from: c */
    public int f181879c;

    /* renamed from: d */
    public boolean f181880d;

    static {
        C66906dw dwVar = new C66906dw();
        f181875e = dwVar;
        C62942bv.registerDefaultInstance(C66906dw.class, dwVar);
    }

    private C66906dw() {
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
                return newMessageInfo(f181875e, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0000\u0000\u0004ဌ\u0000\u0006ဌ\u0004\bဇ\u0006", new Object[]{"a", "b", C66907dx.f181881a, C45240c.f118157a, C66904du.f181874a, "d"});
            case 3:
                return new C66906dw();
            case 4:
                return new C66905dv();
            case 5:
                return f181875e;
            case 6:
                C63010eb ebVar = f181876f;
                if (ebVar == null) {
                    synchronized (C66906dw.class) {
                        ebVar = f181876f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181875e);
                            f181876f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
