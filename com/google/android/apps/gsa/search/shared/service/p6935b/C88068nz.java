package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.nz */
/* compiled from: PG */
public final class C88068nz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88068nz f238116c;

    /* renamed from: d */
    private static volatile C63010eb f238117d;

    /* renamed from: a */
    public int f238118a;

    /* renamed from: b */
    public int f238119b;

    static {
        C88068nz nzVar = new C88068nz();
        f238116c = nzVar;
        C62942bv.registerDefaultInstance(C88068nz.class, nzVar);
    }

    private C88068nz() {
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
                return newMessageInfo(f238116c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88068nz();
            case 4:
                return new C88067ny();
            case 5:
                return f238116c;
            case 6:
                C63010eb ebVar = f238117d;
                if (ebVar == null) {
                    synchronized (C88068nz.class) {
                        ebVar = f238117d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238116c);
                            f238117d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
