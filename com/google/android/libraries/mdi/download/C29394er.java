package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.er */
/* compiled from: PG */
public final class C29394er extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C29394er f79687b;

    /* renamed from: d */
    private static volatile C63010eb f79688d;

    /* renamed from: a */
    public boolean f79689a;

    /* renamed from: c */
    private int f79690c;

    static {
        C29394er erVar = new C29394er();
        f79687b = erVar;
        C62942bv.registerDefaultInstance(C29394er.class, erVar);
    }

    private C29394er() {
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
                return newMessageInfo(f79687b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C29394er();
            case 4:
                return new C29393eq();
            case 5:
                return f79687b;
            case 6:
                C63010eb ebVar = f79688d;
                if (ebVar == null) {
                    synchronized (C29394er.class) {
                        ebVar = f79688d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79687b);
                            f79688d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
