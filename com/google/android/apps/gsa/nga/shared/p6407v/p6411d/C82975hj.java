package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hj */
/* compiled from: PG */
public final class C82975hj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82975hj f226373c;

    /* renamed from: d */
    private static volatile C63010eb f226374d;

    /* renamed from: a */
    public int f226375a = 0;

    /* renamed from: b */
    public Object f226376b;

    static {
        C82975hj hjVar = new C82975hj();
        f226373c = hjVar;
        C62942bv.registerDefaultInstance(C82975hj.class, hjVar);
    }

    private C82975hj() {
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
                return newMessageInfo(f226373c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C82972hg.class});
            case 3:
                return new C82975hj();
            case 4:
                return new C82970he();
            case 5:
                return f226373c;
            case 6:
                C63010eb ebVar = f226374d;
                if (ebVar == null) {
                    synchronized (C82975hj.class) {
                        ebVar = f226374d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226373c);
                            f226374d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
