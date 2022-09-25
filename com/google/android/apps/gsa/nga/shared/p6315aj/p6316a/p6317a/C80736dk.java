package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.dk */
/* compiled from: PG */
public final class C80736dk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80736dk f221621c;

    /* renamed from: d */
    private static volatile C63010eb f221622d;

    /* renamed from: a */
    public int f221623a;

    /* renamed from: b */
    public int f221624b;

    static {
        C80736dk dkVar = new C80736dk();
        f221621c = dkVar;
        C62942bv.registerDefaultInstance(C80736dk.class, dkVar);
    }

    private C80736dk() {
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
                return newMessageInfo(f221621c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0004\u0003\u0004", new Object[]{"a", "b"});
            case 3:
                return new C80736dk();
            case 4:
                return new C80735dj();
            case 5:
                return f221621c;
            case 6:
                C63010eb ebVar = f221622d;
                if (ebVar == null) {
                    synchronized (C80736dk.class) {
                        ebVar = f221622d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221621c);
                            f221622d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
