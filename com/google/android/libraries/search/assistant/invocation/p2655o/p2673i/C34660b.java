package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.b */
/* compiled from: PG */
public final class C34660b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34660b f92032d;

    /* renamed from: e */
    private static volatile C63010eb f92033e;

    /* renamed from: a */
    public int f92034a;

    /* renamed from: b */
    public boolean f92035b;

    /* renamed from: c */
    public boolean f92036c;

    static {
        C34660b bVar = new C34660b();
        f92032d = bVar;
        C62942bv.registerDefaultInstance(C34660b.class, bVar);
    }

    private C34660b() {
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
                return newMessageInfo(f92032d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C34660b();
            case 4:
                return new C34454a();
            case 5:
                return f92032d;
            case 6:
                C63010eb ebVar = f92033e;
                if (ebVar == null) {
                    synchronized (C34660b.class) {
                        ebVar = f92033e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92032d);
                            f92033e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
