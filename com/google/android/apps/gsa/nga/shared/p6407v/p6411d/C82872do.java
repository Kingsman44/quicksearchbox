package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.do */
/* compiled from: PG */
public final class C82872do extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82872do f225957a;

    /* renamed from: b */
    private static volatile C63010eb f225958b;

    static {
        C82872do doVar = new C82872do();
        f225957a = doVar;
        C62942bv.registerDefaultInstance(C82872do.class, doVar);
    }

    private C82872do() {
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
                return newMessageInfo(f225957a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82872do();
            case 4:
                return new C82871dn();
            case 5:
                return f225957a;
            case 6:
                C63010eb ebVar = f225958b;
                if (ebVar == null) {
                    synchronized (C82872do.class) {
                        ebVar = f225958b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225957a);
                            f225958b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
