package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bu */
/* compiled from: PG */
public final class C14237bu extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C14237bu f43088d;

    /* renamed from: e */
    private static volatile C63010eb f43089e;

    /* renamed from: a */
    public int f43090a;

    /* renamed from: b */
    public C52686as f43091b;

    /* renamed from: c */
    public boolean f43092c;

    static {
        C14237bu buVar = new C14237bu();
        f43088d = buVar;
        C62942bv.registerDefaultInstance(C14237bu.class, buVar);
    }

    private C14237bu() {
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
                return newMessageInfo(f43088d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u0007", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C14237bu();
            case 4:
                return new C14235bs();
            case 5:
                return f43088d;
            case 6:
                C63010eb ebVar = f43089e;
                if (ebVar == null) {
                    synchronized (C14237bu.class) {
                        ebVar = f43089e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43088d);
                            f43089e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
