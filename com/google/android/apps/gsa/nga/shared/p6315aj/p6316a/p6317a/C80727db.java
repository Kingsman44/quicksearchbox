package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.db */
/* compiled from: PG */
public final class C80727db extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80727db f221610d;

    /* renamed from: f */
    private static volatile C63010eb f221611f;

    /* renamed from: a */
    public int f221612a;

    /* renamed from: b */
    public C80724cz f221613b;

    /* renamed from: c */
    public C80724cz f221614c;

    /* renamed from: e */
    private byte f221615e = 2;

    static {
        C80727db dbVar = new C80727db();
        f221610d = dbVar;
        C62942bv.registerDefaultInstance(C80727db.class, dbVar);
    }

    private C80727db() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221615e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221615e = b;
                return null;
            case 2:
                return newMessageInfo(f221610d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80727db();
            case 4:
                return new C80726da();
            case 5:
                return f221610d;
            case 6:
                C63010eb ebVar = f221611f;
                if (ebVar == null) {
                    synchronized (C80727db.class) {
                        ebVar = f221611f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221610d);
                            f221611f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
