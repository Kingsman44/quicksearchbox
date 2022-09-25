package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.sl */
/* compiled from: PG */
public final class C88189sl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88189sl f238398c;

    /* renamed from: d */
    private static volatile C63010eb f238399d;

    /* renamed from: a */
    public int f238400a;

    /* renamed from: b */
    public boolean f238401b;

    static {
        C88189sl slVar = new C88189sl();
        f238398c = slVar;
        C62942bv.registerDefaultInstance(C88189sl.class, slVar);
    }

    private C88189sl() {
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
                return newMessageInfo(f238398c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88189sl();
            case 4:
                return new C88188sk();
            case 5:
                return f238398c;
            case 6:
                C63010eb ebVar = f238399d;
                if (ebVar == null) {
                    synchronized (C88189sl.class) {
                        ebVar = f238399d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238398c);
                            f238399d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
