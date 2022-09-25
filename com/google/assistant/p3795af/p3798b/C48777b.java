package com.google.assistant.p3795af.p3798b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.af.b.b */
/* compiled from: PG */
public final class C48777b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48777b f126217f;

    /* renamed from: g */
    private static volatile C63010eb f126218g;

    /* renamed from: a */
    public boolean f126219a;

    /* renamed from: b */
    public boolean f126220b;

    /* renamed from: c */
    public boolean f126221c;

    /* renamed from: d */
    public boolean f126222d;

    /* renamed from: e */
    public boolean f126223e;

    static {
        C48777b bVar = new C48777b();
        f126217f = bVar;
        C62942bv.registerDefaultInstance(C48777b.class, bVar);
    }

    private C48777b() {
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
                return newMessageInfo(f126217f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48777b();
            case 4:
                return new C48776a();
            case 5:
                return f126217f;
            case 6:
                C63010eb ebVar = f126218g;
                if (ebVar == null) {
                    synchronized (C48777b.class) {
                        ebVar = f126218g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126217f);
                            f126218g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
