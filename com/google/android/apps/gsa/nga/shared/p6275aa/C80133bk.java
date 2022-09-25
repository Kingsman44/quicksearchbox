package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bk */
/* compiled from: PG */
public final class C80133bk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80133bk f219911a;

    /* renamed from: b */
    private static volatile C63010eb f219912b;

    static {
        C80133bk bkVar = new C80133bk();
        f219911a = bkVar;
        C62942bv.registerDefaultInstance(C80133bk.class, bkVar);
    }

    private C80133bk() {
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
                return newMessageInfo(f219911a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80133bk();
            case 4:
                return new C80132bj();
            case 5:
                return f219911a;
            case 6:
                C63010eb ebVar = f219912b;
                if (ebVar == null) {
                    synchronized (C80133bk.class) {
                        ebVar = f219912b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219911a);
                            f219912b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
