package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ck */
/* compiled from: PG */
public final class C87756ck extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87756ck f237513c;

    /* renamed from: d */
    private static volatile C63010eb f237514d;

    /* renamed from: a */
    public int f237515a;

    /* renamed from: b */
    public long f237516b;

    static {
        C87756ck ckVar = new C87756ck();
        f237513c = ckVar;
        C62942bv.registerDefaultInstance(C87756ck.class, ckVar);
    }

    private C87756ck() {
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
                return newMessageInfo(f237513c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87756ck();
            case 4:
                return new C87755cj();
            case 5:
                return f237513c;
            case 6:
                C63010eb ebVar = f237514d;
                if (ebVar == null) {
                    synchronized (C87756ck.class) {
                        ebVar = f237514d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237513c);
                            f237514d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
