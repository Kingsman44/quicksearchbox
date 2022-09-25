package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.db */
/* compiled from: PG */
public final class C39677db extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39677db f104438c;

    /* renamed from: e */
    private static volatile C63010eb f104439e;

    /* renamed from: a */
    public boolean f104440a;

    /* renamed from: b */
    public boolean f104441b;

    /* renamed from: d */
    private int f104442d;

    static {
        C39677db dbVar = new C39677db();
        f104438c = dbVar;
        C62942bv.registerDefaultInstance(C39677db.class, dbVar);
    }

    private C39677db() {
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
                return newMessageInfo(f104438c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C39677db();
            case 4:
                return new C39676da();
            case 5:
                return f104438c;
            case 6:
                C63010eb ebVar = f104439e;
                if (ebVar == null) {
                    synchronized (C39677db.class) {
                        ebVar = f104439e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104438c);
                            f104439e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
