package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.aa */
/* compiled from: PG */
public final class C63887aa extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63887aa f172748g;

    /* renamed from: h */
    private static volatile C63010eb f172749h;

    /* renamed from: a */
    public int f172750a;

    /* renamed from: b */
    public int f172751b;

    /* renamed from: c */
    public int f172752c;

    /* renamed from: d */
    public int f172753d;

    /* renamed from: e */
    public int f172754e;

    /* renamed from: f */
    public int f172755f;

    static {
        C63887aa aaVar = new C63887aa();
        f172748g = aaVar;
        C62942bv.registerDefaultInstance(C63887aa.class, aaVar);
    }

    private C63887aa() {
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
                return newMessageInfo(f172748g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63887aa();
            case 4:
                return new C63962z();
            case 5:
                return f172748g;
            case 6:
                C63010eb ebVar = f172749h;
                if (ebVar == null) {
                    synchronized (C63887aa.class) {
                        ebVar = f172749h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172748g);
                            f172749h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
