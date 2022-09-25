package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b;

import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4393a.p4394a.p4395a.C57699c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.bv.j.b.a.b.b.c.b.j */
/* compiled from: PG */
public final class C57734j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57734j f154240c;

    /* renamed from: d */
    public static final C62940bt f154241d;

    /* renamed from: e */
    private static volatile C63010eb f154242e;

    /* renamed from: a */
    public int f154243a;

    /* renamed from: b */
    public C57699c f154244b;

    static {
        C57734j jVar = new C57734j();
        f154240c = jVar;
        C62942bv.registerDefaultInstance(C57734j.class, jVar);
        f154241d = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, jVar, jVar, (C62958ce) null, 414983457, C63066gd.MESSAGE, C57734j.class);
    }

    private C57734j() {
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
                return newMessageInfo(f154240c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57734j();
            case 4:
                return new C57733i();
            case 5:
                return f154240c;
            case 6:
                C63010eb ebVar = f154242e;
                if (ebVar == null) {
                    synchronized (C57734j.class) {
                        ebVar = f154242e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154240c);
                            f154242e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
