package com.google.android.libraries.lens.p2014e.p2015a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.b */
/* compiled from: PG */
public final class C24183b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C24183b f66104e;

    /* renamed from: f */
    private static volatile C63010eb f66105f;

    /* renamed from: a */
    public float f66106a;

    /* renamed from: b */
    public float f66107b;

    /* renamed from: c */
    public float f66108c;

    /* renamed from: d */
    public float f66109d;

    static {
        C24183b bVar = new C24183b();
        f66104e = bVar;
        C62942bv.registerDefaultInstance(C24183b.class, bVar);
    }

    private C24183b() {
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
                return newMessageInfo(f66104e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C24183b();
            case 4:
                return new C24182a();
            case 5:
                return f66104e;
            case 6:
                C63010eb ebVar = f66105f;
                if (ebVar == null) {
                    synchronized (C24183b.class) {
                        ebVar = f66105f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66104e);
                            f66105f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
