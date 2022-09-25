package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.r */
/* compiled from: PG */
public final class C16382r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C16382r f48214d;

    /* renamed from: e */
    private static volatile C63010eb f48215e;

    /* renamed from: a */
    public int f48216a;

    /* renamed from: b */
    public double f48217b;

    /* renamed from: c */
    public double f48218c;

    static {
        C16382r rVar = new C16382r();
        f48214d = rVar;
        C62942bv.registerDefaultInstance(C16382r.class, rVar);
    }

    private C16382r() {
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
                return newMessageInfo(f48214d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C16382r();
            case 4:
                return new C16381q();
            case 5:
                return f48214d;
            case 6:
                C63010eb ebVar = f48215e;
                if (ebVar == null) {
                    synchronized (C16382r.class) {
                        ebVar = f48215e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48214d);
                            f48215e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
