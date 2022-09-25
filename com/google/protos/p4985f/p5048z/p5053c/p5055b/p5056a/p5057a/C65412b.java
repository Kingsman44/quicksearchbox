package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.C65421b;

/* renamed from: com.google.protos.f.z.c.b.a.a.b */
/* compiled from: PG */
public final class C65412b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65412b f177830c;

    /* renamed from: d */
    public static final C62940bt f177831d;

    /* renamed from: e */
    private static volatile C63010eb f177832e;

    /* renamed from: a */
    public int f177833a = 0;

    /* renamed from: b */
    public Object f177834b;

    static {
        C65412b bVar = new C65412b();
        f177830c = bVar;
        C62942bv.registerDefaultInstance(C65412b.class, bVar);
        f177831d = C62942bv.newSingularGeneratedExtension(C65421b.f177850c, bVar, bVar, (C62958ce) null, 219418808, C63066gd.MESSAGE, C65412b.class);
    }

    private C65412b() {
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
                return newMessageInfo(f177830c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C65416f.class});
            case 3:
                return new C65412b();
            case 4:
                return new C65411a();
            case 5:
                return f177830c;
            case 6:
                C63010eb ebVar = f177832e;
                if (ebVar == null) {
                    synchronized (C65412b.class) {
                        ebVar = f177832e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177830c);
                            f177832e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
