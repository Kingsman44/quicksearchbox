package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fv */
/* compiled from: PG */
public final class C37610fv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37610fv f99940c;

    /* renamed from: d */
    private static volatile C63010eb f99941d;

    /* renamed from: a */
    public int f99942a;

    /* renamed from: b */
    public long f99943b;

    static {
        C37610fv fvVar = new C37610fv();
        f99940c = fvVar;
        C62942bv.registerDefaultInstance(C37610fv.class, fvVar);
    }

    private C37610fv() {
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
                return newMessageInfo(f99940c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37610fv();
            case 4:
                return new C37609fu();
            case 5:
                return f99940c;
            case 6:
                C63010eb ebVar = f99941d;
                if (ebVar == null) {
                    synchronized (C37610fv.class) {
                        ebVar = f99941d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99940c);
                            f99941d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
