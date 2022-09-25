package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.C65423d;

/* renamed from: com.google.protos.f.z.c.b.a.a.d */
/* compiled from: PG */
public final class C65414d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65414d f177835c;

    /* renamed from: d */
    public static final C62940bt f177836d;

    /* renamed from: e */
    private static volatile C63010eb f177837e;

    /* renamed from: a */
    public int f177838a = 0;

    /* renamed from: b */
    public Object f177839b;

    static {
        C65414d dVar = new C65414d();
        f177835c = dVar;
        C62942bv.registerDefaultInstance(C65414d.class, dVar);
        f177836d = C62942bv.newSingularGeneratedExtension(C65423d.f177855a, dVar, dVar, (C62958ce) null, 219418808, C63066gd.MESSAGE, C65414d.class);
    }

    private C65414d() {
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
                return newMessageInfo(f177835c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C65420j.class});
            case 3:
                return new C65414d();
            case 4:
                return new C65413c();
            case 5:
                return f177835c;
            case 6:
                C63010eb ebVar = f177837e;
                if (ebVar == null) {
                    synchronized (C65414d.class) {
                        ebVar = f177837e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177835c);
                            f177837e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
