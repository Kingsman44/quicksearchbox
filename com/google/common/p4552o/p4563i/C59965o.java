package com.google.common.p4552o.p4563i;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.o */
/* compiled from: PG */
public final class C59965o extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59965o f162064h;

    /* renamed from: i */
    private static volatile C63010eb f162065i;

    /* renamed from: a */
    public int f162066a;

    /* renamed from: b */
    public int f162067b;

    /* renamed from: c */
    public int f162068c;

    /* renamed from: d */
    public int f162069d;

    /* renamed from: e */
    public int f162070e;

    /* renamed from: f */
    public int f162071f;

    /* renamed from: g */
    public int f162072g;

    static {
        C59965o oVar = new C59965o();
        f162064h = oVar;
        C62942bv.registerDefaultInstance(C59965o.class, oVar);
    }

    private C59965o() {
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
                return newMessageInfo(f162064h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59965o();
            case 4:
                return new C59964n();
            case 5:
                return f162064h;
            case 6:
                C63010eb ebVar = f162065i;
                if (ebVar == null) {
                    synchronized (C59965o.class) {
                        ebVar = f162065i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162064h);
                            f162065i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
