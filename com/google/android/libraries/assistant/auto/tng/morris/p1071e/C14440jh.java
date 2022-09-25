package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jh */
/* compiled from: PG */
public final class C14440jh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14440jh f43680b;

    /* renamed from: c */
    private static volatile C63010eb f43681c;

    /* renamed from: a */
    public int f43682a;

    static {
        C14440jh jhVar = new C14440jh();
        f43680b = jhVar;
        C62942bv.registerDefaultInstance(C14440jh.class, jhVar);
    }

    private C14440jh() {
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
                return newMessageInfo(f43680b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14440jh();
            case 4:
                return new C14439jg();
            case 5:
                return f43680b;
            case 6:
                C63010eb ebVar = f43681c;
                if (ebVar == null) {
                    synchronized (C14440jh.class) {
                        ebVar = f43681c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43680b);
                            f43681c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
