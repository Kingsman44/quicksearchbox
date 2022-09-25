package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bt */
/* compiled from: PG */
public final class C48712bt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48712bt f126024f;

    /* renamed from: g */
    private static volatile C63010eb f126025g;

    /* renamed from: a */
    public int f126026a;

    /* renamed from: b */
    public double f126027b;

    /* renamed from: c */
    public double f126028c;

    /* renamed from: d */
    public double f126029d;

    /* renamed from: e */
    public boolean f126030e;

    static {
        C48712bt btVar = new C48712bt();
        f126024f = btVar;
        C62942bv.registerDefaultInstance(C48712bt.class, btVar);
    }

    private C48712bt() {
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
                return newMessageInfo(f126024f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002ဇ\u0004\u0003က\u0001\u0004က\u0002", new Object[]{"a", "b", "e", C45240c.f118157a, "d"});
            case 3:
                return new C48712bt();
            case 4:
                return new C48711bs();
            case 5:
                return f126024f;
            case 6:
                C63010eb ebVar = f126025g;
                if (ebVar == null) {
                    synchronized (C48712bt.class) {
                        ebVar = f126025g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126024f);
                            f126025g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
