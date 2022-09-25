package com.google.android.apps.gsa.nga.shared.p6274a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.l */
/* compiled from: PG */
public final class C80066l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80066l f219710a;

    /* renamed from: b */
    private static volatile C63010eb f219711b;

    static {
        C80066l lVar = new C80066l();
        f219710a = lVar;
        C62942bv.registerDefaultInstance(C80066l.class, lVar);
    }

    private C80066l() {
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
                return newMessageInfo(f219710a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C80066l();
            case 4:
                return new C80065k();
            case 5:
                return f219710a;
            case 6:
                C63010eb ebVar = f219711b;
                if (ebVar == null) {
                    synchronized (C80066l.class) {
                        ebVar = f219711b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219710a);
                            f219711b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
