package com.google.assistant.p3745ab.p3746a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.q */
/* compiled from: PG */
public final class C48193q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48193q f124708c;

    /* renamed from: d */
    private static volatile C63010eb f124709d;

    /* renamed from: a */
    public int f124710a;

    /* renamed from: b */
    public int f124711b;

    static {
        C48193q qVar = new C48193q();
        f124708c = qVar;
        C62942bv.registerDefaultInstance(C48193q.class, qVar);
    }

    private C48193q() {
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
                return newMessageInfo(f124708c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48191o.f124707a});
            case 3:
                return new C48193q();
            case 4:
                return new C48192p();
            case 5:
                return f124708c;
            case 6:
                C63010eb ebVar = f124709d;
                if (ebVar == null) {
                    synchronized (C48193q.class) {
                        ebVar = f124709d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124708c);
                            f124709d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
