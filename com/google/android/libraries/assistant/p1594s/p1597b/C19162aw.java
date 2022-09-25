package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.aw */
/* compiled from: PG */
public final class C19162aw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19162aw f53660d;

    /* renamed from: e */
    private static volatile C63010eb f53661e;

    /* renamed from: a */
    public int f53662a;

    /* renamed from: b */
    public boolean f53663b;

    /* renamed from: c */
    public int f53664c;

    static {
        C19162aw awVar = new C19162aw();
        f53660d = awVar;
        C62942bv.registerDefaultInstance(C19162aw.class, awVar);
    }

    private C19162aw() {
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
                return newMessageInfo(f53660d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C19161av.f53659a});
            case 3:
                return new C19162aw();
            case 4:
                return new C19160au();
            case 5:
                return f53660d;
            case 6:
                C63010eb ebVar = f53661e;
                if (ebVar == null) {
                    synchronized (C19162aw.class) {
                        ebVar = f53661e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53660d);
                            f53661e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
