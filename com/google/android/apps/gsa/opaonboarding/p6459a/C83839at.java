package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.at */
/* compiled from: PG */
public final class C83839at extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83839at f228467b;

    /* renamed from: c */
    private static volatile C63010eb f228468c;

    /* renamed from: a */
    public C62971cq f228469a = C62942bv.emptyProtobufList();

    static {
        C83839at atVar = new C83839at();
        f228467b = atVar;
        C62942bv.registerDefaultInstance(C83839at.class, atVar);
    }

    private C83839at() {
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
                return newMessageInfo(f228467b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C83839at();
            case 4:
                return new C83838as();
            case 5:
                return f228467b;
            case 6:
                C63010eb ebVar = f228468c;
                if (ebVar == null) {
                    synchronized (C83839at.class) {
                        ebVar = f228468c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228467b);
                            f228468c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
