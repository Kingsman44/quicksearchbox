package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.bf */
/* compiled from: PG */
public final class C57381bf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57381bf f153284d;

    /* renamed from: f */
    private static volatile C63010eb f153285f;

    /* renamed from: a */
    public int f153286a = 0;

    /* renamed from: b */
    public Object f153287b;

    /* renamed from: c */
    public boolean f153288c;

    /* renamed from: e */
    private int f153289e;

    static {
        C57381bf bfVar = new C57381bf();
        f153284d = bfVar;
        C62942bv.registerDefaultInstance(C57381bf.class, bfVar);
    }

    private C57381bf() {
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
                return newMessageInfo(f153284d, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001့\u0000\u0002့\u0000\u0003ဿ\u0000\u0004ဇ\u0003", new Object[]{"b", "a", "e", C57378bc.f153283a, C45240c.f118157a});
            case 3:
                return new C57381bf();
            case 4:
                return new C57377bb();
            case 5:
                return f153284d;
            case 6:
                C63010eb ebVar = f153285f;
                if (ebVar == null) {
                    synchronized (C57381bf.class) {
                        ebVar = f153285f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153284d);
                            f153285f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
