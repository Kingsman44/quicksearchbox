package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bi */
/* compiled from: PG */
public final class C49773bi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49773bi f128525b;

    /* renamed from: d */
    private static volatile C63010eb f128526d;

    /* renamed from: a */
    public double f128527a;

    /* renamed from: c */
    private int f128528c;

    static {
        C49773bi biVar = new C49773bi();
        f128525b = biVar;
        C62942bv.registerDefaultInstance(C49773bi.class, biVar);
    }

    private C49773bi() {
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
                return newMessageInfo(f128525b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49773bi();
            case 4:
                return new C49772bh();
            case 5:
                return f128525b;
            case 6:
                C63010eb ebVar = f128526d;
                if (ebVar == null) {
                    synchronized (C49773bi.class) {
                        ebVar = f128526d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128525b);
                            f128526d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
