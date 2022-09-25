package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bm */
/* compiled from: PG */
public final class C80219bm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80219bm f220092c;

    /* renamed from: d */
    private static volatile C63010eb f220093d;

    /* renamed from: a */
    public int f220094a;

    /* renamed from: b */
    public int f220095b;

    static {
        C80219bm bmVar = new C80219bm();
        f220092c = bmVar;
        C62942bv.registerDefaultInstance(C80219bm.class, bmVar);
    }

    private C80219bm() {
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
                return newMessageInfo(f220092c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80219bm();
            case 4:
                return new C80218bl();
            case 5:
                return f220092c;
            case 6:
                C63010eb ebVar = f220093d;
                if (ebVar == null) {
                    synchronized (C80219bm.class) {
                        ebVar = f220093d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220092c);
                            f220093d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
