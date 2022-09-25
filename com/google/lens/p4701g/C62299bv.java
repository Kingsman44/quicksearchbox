package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64603h;

/* renamed from: com.google.lens.g.bv */
/* compiled from: PG */
public final class C62299bv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62299bv f168178f;

    /* renamed from: g */
    private static volatile C63010eb f168179g;

    /* renamed from: a */
    public int f168180a;

    /* renamed from: b */
    public int f168181b = 0;

    /* renamed from: c */
    public Object f168182c;

    /* renamed from: d */
    public int f168183d;

    /* renamed from: e */
    public int f168184e;

    static {
        C62299bv bvVar = new C62299bv();
        f168178f = bvVar;
        C62942bv.registerDefaultInstance(C62299bv.class, bvVar);
    }

    private C62299bv() {
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
                return newMessageInfo(f168178f, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0006ြ\u0000\u0007ဌ\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", C62298bu.f168177a, C62303bz.class, C62294bq.class, C62292bo.class, "e", C64603h.f175154a});
            case 3:
                return new C62299bv();
            case 4:
                return new C62297bt();
            case 5:
                return f168178f;
            case 6:
                C63010eb ebVar = f168179g;
                if (ebVar == null) {
                    synchronized (C62299bv.class) {
                        ebVar = f168179g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168178f);
                            f168179g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
