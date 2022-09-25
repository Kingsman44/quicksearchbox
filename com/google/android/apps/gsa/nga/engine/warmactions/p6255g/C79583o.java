package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C66865ck;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.o */
/* compiled from: PG */
public final class C79583o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C79583o f218358e;

    /* renamed from: g */
    private static volatile C63010eb f218359g;

    /* renamed from: a */
    public int f218360a;

    /* renamed from: b */
    public C62971cq f218361b = emptyProtobufList();

    /* renamed from: c */
    public C79593y f218362c;

    /* renamed from: d */
    public C79580l f218363d;

    /* renamed from: f */
    private C62995dn f218364f = C62995dn.f170057a;

    static {
        C79583o oVar = new C79583o();
        f218358e = oVar;
        C62942bv.registerDefaultInstance(C79583o.class, oVar);
    }

    private C79583o() {
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
                return newMessageInfo(f218358e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0001\u0000\u00012\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"a", C10662f.f35572a, C79582n.f218357a, "b", C66865ck.class, C45240c.f118157a, "d"});
            case 3:
                return new C79583o();
            case 4:
                return new C79581m();
            case 5:
                return f218358e;
            case 6:
                C63010eb ebVar = f218359g;
                if (ebVar == null) {
                    synchronized (C79583o.class) {
                        ebVar = f218359g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218358e);
                            f218359g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
