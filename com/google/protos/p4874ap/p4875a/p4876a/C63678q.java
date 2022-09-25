package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.q */
/* compiled from: PG */
public final class C63678q extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63678q f172177g;

    /* renamed from: h */
    private static volatile C63010eb f172178h;

    /* renamed from: a */
    public int f172179a;

    /* renamed from: b */
    public int f172180b;

    /* renamed from: c */
    public int f172181c;

    /* renamed from: d */
    public int f172182d = 60;

    /* renamed from: e */
    public int f172183e = 2;

    /* renamed from: f */
    public C63674m f172184f;

    static {
        C63678q qVar = new C63678q();
        f172177g = qVar;
        C62942bv.registerDefaultInstance(C63678q.class, qVar);
    }

    private C63678q() {
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
                return newMessageInfo(f172177g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C63678q();
            case 4:
                return new C63677p();
            case 5:
                return f172177g;
            case 6:
                C63010eb ebVar = f172178h;
                if (ebVar == null) {
                    synchronized (C63678q.class) {
                        ebVar = f172178h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172177g);
                            f172178h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
