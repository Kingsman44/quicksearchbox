package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ax */
/* compiled from: PG */
public final class C37359ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C37359ax f99220b;

    /* renamed from: d */
    private static volatile C63010eb f99221d;

    /* renamed from: a */
    public int f99222a = 10000;

    /* renamed from: c */
    private int f99223c;

    static {
        C37359ax axVar = new C37359ax();
        f99220b = axVar;
        C62942bv.registerDefaultInstance(C37359ax.class, axVar);
    }

    private C37359ax() {
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
                return newMessageInfo(f99220b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C37359ax();
            case 4:
                return new C37358aw();
            case 5:
                return f99220b;
            case 6:
                C63010eb ebVar = f99221d;
                if (ebVar == null) {
                    synchronized (C37359ax.class) {
                        ebVar = f99221d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99220b);
                            f99221d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
