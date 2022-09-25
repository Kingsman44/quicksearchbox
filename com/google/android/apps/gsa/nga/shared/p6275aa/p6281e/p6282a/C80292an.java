package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.an */
/* compiled from: PG */
public final class C80292an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80292an f220332b;

    /* renamed from: c */
    private static volatile C63010eb f220333c;

    /* renamed from: a */
    public int f220334a;

    static {
        C80292an anVar = new C80292an();
        f220332b = anVar;
        C62942bv.registerDefaultInstance(C80292an.class, anVar);
    }

    private C80292an() {
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
                return newMessageInfo(f220332b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C80292an();
            case 4:
                return new C80290al();
            case 5:
                return f220332b;
            case 6:
                C63010eb ebVar = f220333c;
                if (ebVar == null) {
                    synchronized (C80292an.class) {
                        ebVar = f220333c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220332b);
                            f220333c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
