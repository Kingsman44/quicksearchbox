package com.google.android.p10712d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.cc */
/* compiled from: PG */
public final class C142351cc extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C142351cc f386238i;

    /* renamed from: j */
    private static volatile C63010eb f386239j;

    /* renamed from: a */
    public int f386240a;

    /* renamed from: b */
    public C142355cg f386241b;

    /* renamed from: c */
    public C142328bg f386242c;

    /* renamed from: d */
    public C142355cg f386243d;

    /* renamed from: e */
    public C142355cg f386244e;

    /* renamed from: f */
    public C142355cg f386245f;

    /* renamed from: g */
    public C142355cg f386246g;

    /* renamed from: h */
    public C142355cg f386247h;

    static {
        C142351cc ccVar = new C142351cc();
        f386238i = ccVar;
        C62942bv.registerDefaultInstance(C142351cc.class, ccVar);
    }

    private C142351cc() {
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
                return newMessageInfo(f386238i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C142351cc();
            case 4:
                return new C142350cb();
            case 5:
                return f386238i;
            case 6:
                C63010eb ebVar = f386239j;
                if (ebVar == null) {
                    synchronized (C142351cc.class) {
                        ebVar = f386239j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386238i);
                            f386239j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
