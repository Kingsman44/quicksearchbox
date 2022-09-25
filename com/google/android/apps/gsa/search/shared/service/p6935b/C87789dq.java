package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.dq */
/* compiled from: PG */
public final class C87789dq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87789dq f237572a;

    /* renamed from: b */
    private static volatile C63010eb f237573b;

    static {
        C87789dq dqVar = new C87789dq();
        f237572a = dqVar;
        C62942bv.registerDefaultInstance(C87789dq.class, dqVar);
    }

    private C87789dq() {
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
                return newMessageInfo(f237572a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87789dq();
            case 4:
                return new C87788dp();
            case 5:
                return f237572a;
            case 6:
                C63010eb ebVar = f237573b;
                if (ebVar == null) {
                    synchronized (C87789dq.class) {
                        ebVar = f237573b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237572a);
                            f237573b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
