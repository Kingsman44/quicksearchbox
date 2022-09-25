package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.lk */
/* compiled from: PG */
public final class C50123lk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50123lk f130306b;

    /* renamed from: c */
    private static volatile C63010eb f130307c;

    /* renamed from: a */
    public C62971cq f130308a = emptyProtobufList();

    static {
        C50123lk lkVar = new C50123lk();
        f130306b = lkVar;
        C62942bv.registerDefaultInstance(C50123lk.class, lkVar);
    }

    private C50123lk() {
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
                return newMessageInfo(f130306b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50121li.class});
            case 3:
                return new C50123lk();
            case 4:
                return new C50122lj();
            case 5:
                return f130306b;
            case 6:
                C63010eb ebVar = f130307c;
                if (ebVar == null) {
                    synchronized (C50123lk.class) {
                        ebVar = f130307c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130306b);
                            f130307c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
