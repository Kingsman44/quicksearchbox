package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.le */
/* compiled from: PG */
public final class C50117le extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50117le f130292b;

    /* renamed from: c */
    private static volatile C63010eb f130293c;

    /* renamed from: a */
    public C62971cq f130294a = emptyProtobufList();

    static {
        C50117le leVar = new C50117le();
        f130292b = leVar;
        C62942bv.registerDefaultInstance(C50117le.class, leVar);
    }

    private C50117le() {
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
                return newMessageInfo(f130292b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C50115lc.class});
            case 3:
                return new C50117le();
            case 4:
                return new C50116ld();
            case 5:
                return f130292b;
            case 6:
                C63010eb ebVar = f130293c;
                if (ebVar == null) {
                    synchronized (C50117le.class) {
                        ebVar = f130293c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130292b);
                            f130293c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
