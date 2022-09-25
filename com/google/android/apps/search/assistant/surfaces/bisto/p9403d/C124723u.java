package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.android.p10712d.C142324bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.u */
/* compiled from: PG */
public final class C124723u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124723u f344112c;

    /* renamed from: e */
    private static volatile C63010eb f344113e;

    /* renamed from: a */
    public C142324bc f344114a;

    /* renamed from: b */
    public long f344115b;

    /* renamed from: d */
    private int f344116d;

    static {
        C124723u uVar = new C124723u();
        f344112c = uVar;
        C62942bv.registerDefaultInstance(C124723u.class, uVar);
    }

    private C124723u() {
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
                return newMessageInfo(f344112c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C124723u();
            case 4:
                return new C124722t();
            case 5:
                return f344112c;
            case 6:
                C63010eb ebVar = f344113e;
                if (ebVar == null) {
                    synchronized (C124723u.class) {
                        ebVar = f344113e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344112c);
                            f344113e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
