package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bd */
/* compiled from: PG */
public final class C80210bd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80210bd f220065c;

    /* renamed from: d */
    private static volatile C63010eb f220066d;

    /* renamed from: a */
    public int f220067a;

    /* renamed from: b */
    public C80187ah f220068b;

    static {
        C80210bd bdVar = new C80210bd();
        f220065c = bdVar;
        C62942bv.registerDefaultInstance(C80210bd.class, bdVar);
    }

    private C80210bd() {
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
                return newMessageInfo(f220065c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80210bd();
            case 4:
                return new C80209bc();
            case 5:
                return f220065c;
            case 6:
                C63010eb ebVar = f220066d;
                if (ebVar == null) {
                    synchronized (C80210bd.class) {
                        ebVar = f220066d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220065c);
                            f220066d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
