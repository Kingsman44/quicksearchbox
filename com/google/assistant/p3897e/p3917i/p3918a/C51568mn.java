package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.assistant.p3897e.p3921j.alb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mn */
/* compiled from: PG */
public final class C51568mn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51568mn f134404c;

    /* renamed from: d */
    private static volatile C63010eb f134405d;

    /* renamed from: a */
    public int f134406a;

    /* renamed from: b */
    public alb f134407b;

    static {
        C51568mn mnVar = new C51568mn();
        f134404c = mnVar;
        C62942bv.registerDefaultInstance(C51568mn.class, mnVar);
    }

    private C51568mn() {
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
                return newMessageInfo(f134404c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51568mn();
            case 4:
                return new C51567mm();
            case 5:
                return f134404c;
            case 6:
                C63010eb ebVar = f134405d;
                if (ebVar == null) {
                    synchronized (C51568mn.class) {
                        ebVar = f134405d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134404c);
                            f134405d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
