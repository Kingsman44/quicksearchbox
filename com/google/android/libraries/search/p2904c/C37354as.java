package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.as */
/* compiled from: PG */
public final class C37354as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37354as f99211d;

    /* renamed from: e */
    private static volatile C63010eb f99212e;

    /* renamed from: a */
    public int f99213a;

    /* renamed from: b */
    public boolean f99214b;

    /* renamed from: c */
    public boolean f99215c;

    static {
        C37354as asVar = new C37354as();
        f99211d = asVar;
        C62942bv.registerDefaultInstance(C37354as.class, asVar);
    }

    private C37354as() {
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
                return newMessageInfo(f99211d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C37354as();
            case 4:
                return new C37353ar();
            case 5:
                return f99211d;
            case 6:
                C63010eb ebVar = f99212e;
                if (ebVar == null) {
                    synchronized (C37354as.class) {
                        ebVar = f99212e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99211d);
                            f99212e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
