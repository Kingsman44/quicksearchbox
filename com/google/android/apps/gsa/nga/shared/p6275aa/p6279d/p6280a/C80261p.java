package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.p */
/* compiled from: PG */
public final class C80261p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80261p f220198c;

    /* renamed from: d */
    private static volatile C63010eb f220199d;

    /* renamed from: a */
    public int f220200a;

    /* renamed from: b */
    public boolean f220201b;

    static {
        C80261p pVar = new C80261p();
        f220198c = pVar;
        C62942bv.registerDefaultInstance(C80261p.class, pVar);
    }

    private C80261p() {
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
                return newMessageInfo(f220198c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80261p();
            case 4:
                return new C80260o();
            case 5:
                return f220198c;
            case 6:
                C63010eb ebVar = f220199d;
                if (ebVar == null) {
                    synchronized (C80261p.class) {
                        ebVar = f220199d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220198c);
                            f220199d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
