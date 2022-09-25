package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.a.a.a.a.d */
/* compiled from: PG */
public final class C65495d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65495d f178044e;

    /* renamed from: f */
    private static volatile C63010eb f178045f;

    /* renamed from: a */
    public int f178046a;

    /* renamed from: b */
    public int f178047b = 0;

    /* renamed from: c */
    public Object f178048c;

    /* renamed from: d */
    public boolean f178049d;

    static {
        C65495d dVar = new C65495d();
        f178044e = dVar;
        C62942bv.registerDefaultInstance(C65495d.class, dVar);
    }

    private C65495d() {
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
                return newMessageInfo(f178044e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002့\u0000\u0003ျ\u0000\u0004ဇ\u0003", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C65495d();
            case 4:
                return new C65494c();
            case 5:
                return f178044e;
            case 6:
                C63010eb ebVar = f178045f;
                if (ebVar == null) {
                    synchronized (C65495d.class) {
                        ebVar = f178045f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178044e);
                            f178045f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
