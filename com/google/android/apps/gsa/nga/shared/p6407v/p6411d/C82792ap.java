package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ap */
/* compiled from: PG */
public final class C82792ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82792ap f225577a;

    /* renamed from: b */
    private static volatile C63010eb f225578b;

    static {
        C82792ap apVar = new C82792ap();
        f225577a = apVar;
        C62942bv.registerDefaultInstance(C82792ap.class, apVar);
    }

    private C82792ap() {
        emptyProtobufList();
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
                return newMessageInfo(f225577a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C82792ap();
            case 4:
                return new C82791ao();
            case 5:
                return f225577a;
            case 6:
                C63010eb ebVar = f225578b;
                if (ebVar == null) {
                    synchronized (C82792ap.class) {
                        ebVar = f225578b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225577a);
                            f225578b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
