package com.google.p4152bb.p4153a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.hy */
/* compiled from: PG */
public final class C55156hy extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55156hy f145197g;

    /* renamed from: h */
    public static final C62940bt f145198h;

    /* renamed from: j */
    private static volatile C63010eb f145199j;

    /* renamed from: a */
    public int f145200a;

    /* renamed from: b */
    public int f145201b = 0;

    /* renamed from: c */
    public Object f145202c;

    /* renamed from: d */
    public C55136he f145203d;

    /* renamed from: e */
    public int f145204e;

    /* renamed from: f */
    public int f145205f;

    /* renamed from: i */
    private byte f145206i = 2;

    static {
        C55156hy hyVar = new C55156hy();
        f145197g = hyVar;
        C62942bv.registerDefaultInstance(C55156hy.class, hyVar);
        f145198h = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, hyVar, hyVar, (C62958ce) null, 111899343, C63066gd.MESSAGE, C55156hy.class);
    }

    private C55156hy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145206i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145206i = b;
                return null;
            case 2:
                return newMessageInfo(f145197g, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0004\u0001ᐉ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ြ\u0000\u0007ြ\u0000\bᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C55143hl.m87609b(), C55145hn.class, C55147hp.class, C55155hx.class, C55151ht.class, C55153hv.class});
            case 3:
                return new C55156hy();
            case 4:
                return new C55141hj();
            case 5:
                return f145197g;
            case 6:
                C63010eb ebVar = f145199j;
                if (ebVar == null) {
                    synchronized (C55156hy.class) {
                        ebVar = f145199j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145197g);
                            f145199j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
