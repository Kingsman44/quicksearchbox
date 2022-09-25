package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.a.a.j */
/* compiled from: PG */
public final class C65420j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65420j f177846b;

    /* renamed from: d */
    private static volatile C63010eb f177847d;

    /* renamed from: a */
    public int f177848a;

    /* renamed from: c */
    private int f177849c;

    static {
        C65420j jVar = new C65420j();
        f177846b = jVar;
        C62942bv.registerDefaultInstance(C65420j.class, jVar);
    }

    private C65420j() {
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
                return newMessageInfo(f177846b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C65418h.f177845a});
            case 3:
                return new C65420j();
            case 4:
                return new C65417g();
            case 5:
                return f177846b;
            case 6:
                C63010eb ebVar = f177847d;
                if (ebVar == null) {
                    synchronized (C65420j.class) {
                        ebVar = f177847d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177846b);
                            f177847d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
