package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.au */
/* compiled from: PG */
public final class C14210au extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14210au f42993c;

    /* renamed from: d */
    private static volatile C63010eb f42994d;

    /* renamed from: a */
    public int f42995a = 0;

    /* renamed from: b */
    public Object f42996b;

    static {
        C14210au auVar = new C14210au();
        f42993c = auVar;
        C62942bv.registerDefaultInstance(C14210au.class, auVar);
    }

    private C14210au() {
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
                return newMessageInfo(f42993c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C14203an.class, C14207ar.class, C14209at.class, C14205ap.class});
            case 3:
                return new C14210au();
            case 4:
                return new C14201al();
            case 5:
                return f42993c;
            case 6:
                C63010eb ebVar = f42994d;
                if (ebVar == null) {
                    synchronized (C14210au.class) {
                        ebVar = f42994d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f42993c);
                            f42994d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
