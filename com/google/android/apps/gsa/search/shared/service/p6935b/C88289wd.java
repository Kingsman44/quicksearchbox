package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wd */
/* compiled from: PG */
public final class C88289wd extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C88289wd f238780h;

    /* renamed from: j */
    private static volatile C63010eb f238781j;

    /* renamed from: a */
    public int f238782a;

    /* renamed from: b */
    public int f238783b;

    /* renamed from: c */
    public int f238784c;

    /* renamed from: d */
    public int f238785d;

    /* renamed from: e */
    public int f238786e;

    /* renamed from: f */
    public int f238787f;

    /* renamed from: g */
    public int f238788g;

    /* renamed from: i */
    private int f238789i;

    static {
        C88289wd wdVar = new C88289wd();
        f238780h = wdVar;
        C62942bv.registerDefaultInstance(C88289wd.class, wdVar);
    }

    private C88289wd() {
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
                return newMessageInfo(f238780h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"i", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C88289wd();
            case 4:
                return new C88288wc();
            case 5:
                return f238780h;
            case 6:
                C63010eb ebVar = f238781j;
                if (ebVar == null) {
                    synchronized (C88289wd.class) {
                        ebVar = f238781j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238780h);
                            f238781j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
