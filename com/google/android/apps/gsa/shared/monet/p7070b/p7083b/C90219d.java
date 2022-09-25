package com.google.android.apps.gsa.shared.monet.p7070b.p7083b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.b.d */
/* compiled from: PG */
public final class C90219d extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C90219d f252039h;

    /* renamed from: i */
    private static volatile C63010eb f252040i;

    /* renamed from: a */
    public int f252041a;

    /* renamed from: b */
    public int f252042b;

    /* renamed from: c */
    public int f252043c;

    /* renamed from: d */
    public boolean f252044d;

    /* renamed from: e */
    public int f252045e;

    /* renamed from: f */
    public boolean f252046f;

    /* renamed from: g */
    public int f252047g;

    static {
        C90219d dVar = new C90219d();
        f252039h = dVar;
        C62942bv.registerDefaultInstance(C90219d.class, dVar);
    }

    private C90219d() {
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
                return newMessageInfo(f252039h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C90219d();
            case 4:
                return new C90218c();
            case 5:
                return f252039h;
            case 6:
                C63010eb ebVar = f252040i;
                if (ebVar == null) {
                    synchronized (C90219d.class) {
                        ebVar = f252040i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252039h);
                            f252040i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
