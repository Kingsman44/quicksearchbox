package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.co */
/* compiled from: PG */
public final class C119847co extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119847co f333794b;

    /* renamed from: c */
    private static volatile C63010eb f333795c;

    /* renamed from: a */
    public C51805du f333796a;

    static {
        C119847co coVar = new C119847co();
        f333794b = coVar;
        C62942bv.registerDefaultInstance(C119847co.class, coVar);
    }

    private C119847co() {
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
                return newMessageInfo(f333794b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C119847co();
            case 4:
                return new C119846cn();
            case 5:
                return f333794b;
            case 6:
                C63010eb ebVar = f333795c;
                if (ebVar == null) {
                    synchronized (C119847co.class) {
                        ebVar = f333795c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333794b);
                            f333795c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
