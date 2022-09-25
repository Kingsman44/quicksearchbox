package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ta */
/* compiled from: PG */
public final class C52473ta extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52473ta f137740c;

    /* renamed from: d */
    private static volatile C63010eb f137741d;

    /* renamed from: a */
    public int f137742a;

    /* renamed from: b */
    public boolean f137743b;

    static {
        C52473ta taVar = new C52473ta();
        f137740c = taVar;
        C62942bv.registerDefaultInstance(C52473ta.class, taVar);
    }

    private C52473ta() {
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
                return newMessageInfo(f137740c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52473ta();
            case 4:
                return new C52471sz();
            case 5:
                return f137740c;
            case 6:
                C63010eb ebVar = f137741d;
                if (ebVar == null) {
                    synchronized (C52473ta.class) {
                        ebVar = f137741d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137740c);
                            f137741d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
