package com.google.android.libraries.lens.view.p2067ak;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.bj */
/* compiled from: PG */
public final class C25231bj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C25231bj f68676f;

    /* renamed from: g */
    private static volatile C63010eb f68677g;

    /* renamed from: a */
    public long f68678a;

    /* renamed from: b */
    public long f68679b;

    /* renamed from: c */
    public boolean f68680c;

    /* renamed from: d */
    public long f68681d;

    /* renamed from: e */
    public boolean f68682e;

    static {
        C25231bj bjVar = new C25231bj();
        f68676f = bjVar;
        C62942bv.registerDefaultInstance(C25231bj.class, bjVar);
    }

    private C25231bj() {
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
                return newMessageInfo(f68676f, "\u0000\u0005\u0000\u0000\u0001\u000b\u0005\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0006\u0007\n\u0002\u000b\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C25231bj();
            case 4:
                return new C25230bi();
            case 5:
                return f68676f;
            case 6:
                C63010eb ebVar = f68677g;
                if (ebVar == null) {
                    synchronized (C25231bj.class) {
                        ebVar = f68677g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68676f);
                            f68677g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
