package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.protos.aw.a.a.a.a.b.r */
/* compiled from: PG */
public final class C63886r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63886r f172740e;

    /* renamed from: f */
    public static final C62940bt f172741f;

    /* renamed from: h */
    private static volatile C63010eb f172742h;

    /* renamed from: a */
    public int f172743a;

    /* renamed from: b */
    public int f172744b;

    /* renamed from: c */
    public int f172745c;

    /* renamed from: d */
    public int f172746d;

    /* renamed from: g */
    private int f172747g;

    static {
        C63886r rVar = new C63886r();
        f172740e = rVar;
        C62942bv.registerDefaultInstance(C63886r.class, rVar);
        f172741f = C62942bv.newSingularGeneratedExtension(C63955s.f172966b, rVar, rVar, (C62958ce) null, 1009, C63066gd.MESSAGE, C63886r.class);
    }

    private C63886r() {
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
                return newMessageInfo(f172740e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63886r();
            case 4:
                return new C63885q();
            case 5:
                return f172740e;
            case 6:
                C63010eb ebVar = f172742h;
                if (ebVar == null) {
                    synchronized (C63886r.class) {
                        ebVar = f172742h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172740e);
                            f172742h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
