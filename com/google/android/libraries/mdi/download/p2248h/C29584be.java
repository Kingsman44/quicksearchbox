package com.google.android.libraries.mdi.download.p2248h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.h.be */
/* compiled from: PG */
public final class C29584be extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C29584be f80153b;

    /* renamed from: c */
    private static volatile C63010eb f80154c;

    /* renamed from: a */
    public C62995dn f80155a = C62995dn.f170057a;

    static {
        C29584be beVar = new C29584be();
        f80153b = beVar;
        C62942bv.registerDefaultInstance(C29584be.class, beVar);
    }

    private C29584be() {
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
                return newMessageInfo(f80153b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C29583bd.f80152a});
            case 3:
                return new C29584be();
            case 4:
                return new C29582bc();
            case 5:
                return f80153b;
            case 6:
                C63010eb ebVar = f80154c;
                if (ebVar == null) {
                    synchronized (C29584be.class) {
                        ebVar = f80154c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80153b);
                            f80154c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
