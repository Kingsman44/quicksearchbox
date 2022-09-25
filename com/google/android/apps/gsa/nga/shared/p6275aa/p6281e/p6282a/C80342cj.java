package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.cj */
/* compiled from: PG */
public final class C80342cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80342cj f220456c;

    /* renamed from: d */
    private static volatile C63010eb f220457d;

    /* renamed from: a */
    public int f220458a;

    /* renamed from: b */
    public C80340ch f220459b;

    static {
        C80342cj cjVar = new C80342cj();
        f220456c = cjVar;
        C62942bv.registerDefaultInstance(C80342cj.class, cjVar);
    }

    private C80342cj() {
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
                return newMessageInfo(f220456c, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C80342cj();
            case 4:
                return new C80341ci();
            case 5:
                return f220456c;
            case 6:
                C63010eb ebVar = f220457d;
                if (ebVar == null) {
                    synchronized (C80342cj.class) {
                        ebVar = f220457d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220456c);
                            f220457d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
