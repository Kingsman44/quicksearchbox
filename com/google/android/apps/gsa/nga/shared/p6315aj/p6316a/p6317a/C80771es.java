package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.es */
/* compiled from: PG */
public final class C80771es extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80771es f221679b;

    /* renamed from: c */
    private static volatile C63010eb f221680c;

    /* renamed from: a */
    public C80770er f221681a;

    static {
        C80771es esVar = new C80771es();
        f221679b = esVar;
        C62942bv.registerDefaultInstance(C80771es.class, esVar);
    }

    private C80771es() {
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
                return newMessageInfo(f221679b, "\u0000\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t", new Object[]{"a"});
            case 3:
                return new C80771es();
            case 4:
                return new C80768ep();
            case 5:
                return f221679b;
            case 6:
                C63010eb ebVar = f221680c;
                if (ebVar == null) {
                    synchronized (C80771es.class) {
                        ebVar = f221680c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221679b);
                            f221680c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
