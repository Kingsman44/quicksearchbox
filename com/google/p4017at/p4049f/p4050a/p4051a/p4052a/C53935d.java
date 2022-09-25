package com.google.p4017at.p4049f.p4050a.p4051a.p4052a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.f.a.a.a.d */
/* compiled from: PG */
public final class C53935d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53935d f141520d;

    /* renamed from: e */
    private static volatile C63010eb f141521e;

    /* renamed from: a */
    public int f141522a;

    /* renamed from: b */
    public int f141523b;

    /* renamed from: c */
    public C62995dn f141524c = C62995dn.f170057a;

    static {
        C53935d dVar = new C53935d();
        f141520d = dVar;
        C62942bv.registerDefaultInstance(C53935d.class, dVar);
    }

    private C53935d() {
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
                return newMessageInfo(f141520d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"a", "b", C45240c.f118157a, C53934c.f141519a});
            case 3:
                return new C53935d();
            case 4:
                return new C53933b();
            case 5:
                return f141520d;
            case 6:
                C63010eb ebVar = f141521e;
                if (ebVar == null) {
                    synchronized (C53935d.class) {
                        ebVar = f141521e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141520d);
                            f141521e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
