package com.google.assistant.p3897e.p3921j;

import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aph */
/* compiled from: PG */
public final class aph extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aph f135554b;

    /* renamed from: c */
    private static volatile C63010eb f135555c;

    /* renamed from: a */
    public C62971cq f135556a = emptyProtobufList();

    static {
        aph aph = new aph();
        f135554b = aph;
        C62942bv.registerDefaultInstance(aph.class, aph);
    }

    private aph() {
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
                return newMessageInfo(f135554b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51098gh.class});
            case 3:
                return new aph();
            case 4:
                return new apg();
            case 5:
                return f135554b;
            case 6:
                C63010eb ebVar = f135555c;
                if (ebVar == null) {
                    synchronized (aph.class) {
                        ebVar = f135555c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135554b);
                            f135555c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
