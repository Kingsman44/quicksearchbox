package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.yw */
/* compiled from: PG */
public final class C50486yw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50486yw f131382a;

    /* renamed from: b */
    private static volatile C63010eb f131383b;

    static {
        C50486yw ywVar = new C50486yw();
        f131382a = ywVar;
        C62942bv.registerDefaultInstance(C50486yw.class, ywVar);
    }

    private C50486yw() {
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
                return newMessageInfo(f131382a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50486yw();
            case 4:
                return new C50485yv();
            case 5:
                return f131382a;
            case 6:
                C63010eb ebVar = f131383b;
                if (ebVar == null) {
                    synchronized (C50486yw.class) {
                        ebVar = f131383b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131382a);
                            f131383b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
