package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.g */
/* compiled from: PG */
public final class C64089g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64089g f173264e;

    /* renamed from: f */
    private static volatile C63010eb f173265f;

    /* renamed from: a */
    public int f173266a;

    /* renamed from: b */
    public int f173267b = 0;

    /* renamed from: c */
    public Object f173268c;

    /* renamed from: d */
    public int f173269d;

    static {
        C64089g gVar = new C64089g();
        f173264e = gVar;
        C62942bv.registerDefaultInstance(C64089g.class, gVar);
    }

    private C64089g() {
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
                return newMessageInfo(f173264e, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C64071e.f173223a, C64073eb.class, C63971ah.class, C63994bd.class, C63973aj.class, C63981ar.class});
            case 3:
                return new C64089g();
            case 4:
                return new C64044d();
            case 5:
                return f173264e;
            case 6:
                C63010eb ebVar = f173265f;
                if (ebVar == null) {
                    synchronized (C64089g.class) {
                        ebVar = f173265f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173264e);
                            f173265f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
