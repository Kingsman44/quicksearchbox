package com.google.p4242bp.p4257f.p4262c.p4263a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.c.a.b */
/* compiled from: PG */
public final class C56331b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56331b f150148e;

    /* renamed from: f */
    private static volatile C63010eb f150149f;

    /* renamed from: a */
    public int f150150a;

    /* renamed from: b */
    public float f150151b = 1.0f;

    /* renamed from: c */
    public float f150152c = 1.0f;

    /* renamed from: d */
    public float f150153d;

    static {
        C56331b bVar = new C56331b();
        f150148e = bVar;
        C62942bv.registerDefaultInstance(C56331b.class, bVar);
    }

    private C56331b() {
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
                return newMessageInfo(f150148e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56331b();
            case 4:
                return new C56330a();
            case 5:
                return f150148e;
            case 6:
                C63010eb ebVar = f150149f;
                if (ebVar == null) {
                    synchronized (C56331b.class) {
                        ebVar = f150149f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150148e);
                            f150149f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
