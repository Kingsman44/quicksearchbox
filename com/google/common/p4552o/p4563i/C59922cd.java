package com.google.common.p4552o.p4563i;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.aac;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.cd */
/* compiled from: PG */
public final class C59922cd extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59922cd f161955h;

    /* renamed from: i */
    private static volatile C63010eb f161956i;

    /* renamed from: a */
    public int f161957a;

    /* renamed from: b */
    public int f161958b;

    /* renamed from: c */
    public int f161959c;

    /* renamed from: d */
    public int f161960d;

    /* renamed from: e */
    public int f161961e;

    /* renamed from: f */
    public int f161962f;

    /* renamed from: g */
    public aac f161963g;

    static {
        C59922cd cdVar = new C59922cd();
        f161955h = cdVar;
        C62942bv.registerDefaultInstance(C59922cd.class, cdVar);
    }

    private C59922cd() {
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
                return newMessageInfo(f161955h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\bင\u0007\tဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C59922cd();
            case 4:
                return new C59921cc();
            case 5:
                return f161955h;
            case 6:
                C63010eb ebVar = f161956i;
                if (ebVar == null) {
                    synchronized (C59922cd.class) {
                        ebVar = f161956i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161955h);
                            f161956i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
