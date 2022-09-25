package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.d */
/* compiled from: PG */
public final class C138474d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138474d f376655c;

    /* renamed from: e */
    private static volatile C63010eb f376656e;

    /* renamed from: a */
    public long f376657a;

    /* renamed from: b */
    public long f376658b;

    /* renamed from: d */
    private int f376659d;

    static {
        C138474d dVar = new C138474d();
        f376655c = dVar;
        C62942bv.registerDefaultInstance(C138474d.class, dVar);
    }

    private C138474d() {
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
                return newMessageInfo(f376655c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C138474d();
            case 4:
                return new C138452c();
            case 5:
                return f376655c;
            case 6:
                C63010eb ebVar = f376656e;
                if (ebVar == null) {
                    synchronized (C138474d.class) {
                        ebVar = f376656e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376655c);
                            f376656e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
