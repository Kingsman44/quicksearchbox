package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.protos.aw.a.a.a.am */
/* compiled from: PG */
public final class C63899am extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C63899am f172780h;

    /* renamed from: i */
    private static volatile C63010eb f172781i;

    /* renamed from: a */
    public int f172782a;

    /* renamed from: b */
    public C63042fg f172783b;

    /* renamed from: c */
    public C63898al f172784c;

    /* renamed from: d */
    public C63898al f172785d;

    /* renamed from: e */
    public C63898al f172786e;

    /* renamed from: f */
    public C63898al f172787f;

    /* renamed from: g */
    public C63898al f172788g;

    static {
        C63899am amVar = new C63899am();
        f172780h = amVar;
        C62942bv.registerDefaultInstance(C63899am.class, amVar);
    }

    private C63899am() {
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
                return newMessageInfo(f172780h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C63899am();
            case 4:
                return new C63896aj();
            case 5:
                return f172780h;
            case 6:
                C63010eb ebVar = f172781i;
                if (ebVar == null) {
                    synchronized (C63899am.class) {
                        ebVar = f172781i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172780h);
                            f172781i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
