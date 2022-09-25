package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.db */
/* compiled from: PG */
public final class C29316db extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C29316db f79457b;

    /* renamed from: d */
    private static volatile C63010eb f79458d;

    /* renamed from: a */
    public int f79459a;

    /* renamed from: c */
    private int f79460c;

    static {
        C29316db dbVar = new C29316db();
        f79457b = dbVar;
        C62942bv.registerDefaultInstance(C29316db.class, dbVar);
    }

    private C29316db() {
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
                return newMessageInfo(f79457b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C29315da.m54210b()});
            case 3:
                return new C29316db();
            case 4:
                return new C28810cy();
            case 5:
                return f79457b;
            case 6:
                C63010eb ebVar = f79458d;
                if (ebVar == null) {
                    synchronized (C29316db.class) {
                        ebVar = f79458d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79457b);
                            f79458d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
