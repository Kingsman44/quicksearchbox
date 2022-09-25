package com.google.p4242bp.p4267h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.aa */
/* compiled from: PG */
public final class C56389aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56389aa f150386e;

    /* renamed from: f */
    private static volatile C63010eb f150387f;

    /* renamed from: a */
    public int f150388a;

    /* renamed from: b */
    public int f150389b;

    /* renamed from: c */
    public int f150390c;

    /* renamed from: d */
    public int f150391d;

    static {
        C56389aa aaVar = new C56389aa();
        f150386e = aaVar;
        C62942bv.registerDefaultInstance(C56389aa.class, aaVar);
    }

    private C56389aa() {
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
                return newMessageInfo(f150386e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C56419z.m87987b(), C45240c.f118157a, "d"});
            case 3:
                return new C56389aa();
            case 4:
                return new C56416w();
            case 5:
                return f150386e;
            case 6:
                C63010eb ebVar = f150387f;
                if (ebVar == null) {
                    synchronized (C56389aa.class) {
                        ebVar = f150387f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150386e);
                            f150387f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
