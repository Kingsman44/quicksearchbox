package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.at */
/* compiled from: PG */
public final class C80199at extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80199at f220028c;

    /* renamed from: d */
    private static volatile C63010eb f220029d;

    /* renamed from: a */
    public int f220030a = 0;

    /* renamed from: b */
    public Object f220031b;

    static {
        C80199at atVar = new C80199at();
        f220028c = atVar;
        C62942bv.registerDefaultInstance(C80199at.class, atVar);
    }

    private C80199at() {
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
                return newMessageInfo(f220028c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001်\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C80199at();
            case 4:
                return new C80198as();
            case 5:
                return f220028c;
            case 6:
                C63010eb ebVar = f220029d;
                if (ebVar == null) {
                    synchronized (C80199at.class) {
                        ebVar = f220029d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220028c);
                            f220029d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
