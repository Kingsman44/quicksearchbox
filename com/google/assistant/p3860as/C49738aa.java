package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.aa */
/* compiled from: PG */
public final class C49738aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49738aa f128428b;

    /* renamed from: d */
    private static volatile C63010eb f128429d;

    /* renamed from: a */
    public int f128430a;

    /* renamed from: c */
    private int f128431c;

    static {
        C49738aa aaVar = new C49738aa();
        f128428b = aaVar;
        C62942bv.registerDefaultInstance(C49738aa.class, aaVar);
    }

    private C49738aa() {
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
                return newMessageInfo(f128428b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C49812z.m85717b()});
            case 3:
                return new C49738aa();
            case 4:
                return new C49810x();
            case 5:
                return f128428b;
            case 6:
                C63010eb ebVar = f128429d;
                if (ebVar == null) {
                    synchronized (C49738aa.class) {
                        ebVar = f128429d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128428b);
                            f128429d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
