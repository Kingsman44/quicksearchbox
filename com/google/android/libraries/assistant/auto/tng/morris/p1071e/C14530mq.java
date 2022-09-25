package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.mq */
/* compiled from: PG */
public final class C14530mq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14530mq f43916b;

    /* renamed from: c */
    private static volatile C63010eb f43917c;

    /* renamed from: a */
    public int f43918a;

    static {
        C14530mq mqVar = new C14530mq();
        f43916b = mqVar;
        C62942bv.registerDefaultInstance(C14530mq.class, mqVar);
    }

    private C14530mq() {
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
                return newMessageInfo(f43916b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14530mq();
            case 4:
                return new C14529mp();
            case 5:
                return f43916b;
            case 6:
                C63010eb ebVar = f43917c;
                if (ebVar == null) {
                    synchronized (C14530mq.class) {
                        ebVar = f43917c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43916b);
                            f43917c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
