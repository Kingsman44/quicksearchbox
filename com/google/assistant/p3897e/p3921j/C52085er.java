package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.er */
/* compiled from: PG */
public final class C52085er extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52085er f136696c;

    /* renamed from: d */
    private static volatile C63010eb f136697d;

    /* renamed from: a */
    public C62971cq f136698a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f136699b = C62942bv.emptyProtobufList();

    static {
        C52085er erVar = new C52085er();
        f136696c = erVar;
        C62942bv.registerDefaultInstance(C52085er.class, erVar);
    }

    private C52085er() {
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
                return newMessageInfo(f136696c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001a", new Object[]{"a", C52087et.class, "b"});
            case 3:
                return new C52085er();
            case 4:
                return new C52084eq();
            case 5:
                return f136696c;
            case 6:
                C63010eb ebVar = f136697d;
                if (ebVar == null) {
                    synchronized (C52085er.class) {
                        ebVar = f136697d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136696c);
                            f136697d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
