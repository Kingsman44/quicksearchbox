package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vi */
/* compiled from: PG */
public final class C52535vi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52535vi f137898d;

    /* renamed from: e */
    private static volatile C63010eb f137899e;

    /* renamed from: a */
    public int f137900a;

    /* renamed from: b */
    public double f137901b;

    /* renamed from: c */
    public double f137902c;

    static {
        C52535vi viVar = new C52535vi();
        f137898d = viVar;
        C62942bv.registerDefaultInstance(C52535vi.class, viVar);
    }

    private C52535vi() {
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
                return newMessageInfo(f137898d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52535vi();
            case 4:
                return new C52534vh();
            case 5:
                return f137898d;
            case 6:
                C63010eb ebVar = f137899e;
                if (ebVar == null) {
                    synchronized (C52535vi.class) {
                        ebVar = f137899e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137898d);
                            f137899e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
