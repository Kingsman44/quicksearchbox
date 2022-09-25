package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hu */
/* compiled from: PG */
public final class C82986hu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82986hu f226439a;

    /* renamed from: b */
    private static volatile C63010eb f226440b;

    static {
        C82986hu huVar = new C82986hu();
        f226439a = huVar;
        C62942bv.registerDefaultInstance(C82986hu.class, huVar);
    }

    private C82986hu() {
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
                return newMessageInfo(f226439a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82986hu();
            case 4:
                return new C82985ht();
            case 5:
                return f226439a;
            case 6:
                C63010eb ebVar = f226440b;
                if (ebVar == null) {
                    synchronized (C82986hu.class) {
                        ebVar = f226440b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226439a);
                            f226440b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
