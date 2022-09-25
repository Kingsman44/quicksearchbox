package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bd */
/* compiled from: PG */
public final class C80309bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80309bd f220388b;

    /* renamed from: c */
    private static volatile C63010eb f220389c;

    /* renamed from: a */
    public int f220390a;

    static {
        C80309bd bdVar = new C80309bd();
        f220388b = bdVar;
        C62942bv.registerDefaultInstance(C80309bd.class, bdVar);
    }

    private C80309bd() {
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
                return newMessageInfo(f220388b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C80309bd();
            case 4:
                return new C80308bc();
            case 5:
                return f220388b;
            case 6:
                C63010eb ebVar = f220389c;
                if (ebVar == null) {
                    synchronized (C80309bd.class) {
                        ebVar = f220389c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220388b);
                            f220389c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
