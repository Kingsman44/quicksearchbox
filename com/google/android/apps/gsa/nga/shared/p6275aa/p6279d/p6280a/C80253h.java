package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.h */
/* compiled from: PG */
public final class C80253h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80253h f220183c;

    /* renamed from: d */
    private static volatile C63010eb f220184d;

    /* renamed from: a */
    public int f220185a;

    /* renamed from: b */
    public boolean f220186b;

    static {
        C80253h hVar = new C80253h();
        f220183c = hVar;
        C62942bv.registerDefaultInstance(C80253h.class, hVar);
    }

    private C80253h() {
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
                return newMessageInfo(f220183c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80253h();
            case 4:
                return new C80252g();
            case 5:
                return f220183c;
            case 6:
                C63010eb ebVar = f220184d;
                if (ebVar == null) {
                    synchronized (C80253h.class) {
                        ebVar = f220184d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220183c);
                            f220184d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
