package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kq */
/* compiled from: PG */
public final class C14476kq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14476kq f43753b;

    /* renamed from: c */
    private static volatile C63010eb f43754c;

    /* renamed from: a */
    public boolean f43755a;

    static {
        C14476kq kqVar = new C14476kq();
        f43753b = kqVar;
        C62942bv.registerDefaultInstance(C14476kq.class, kqVar);
    }

    private C14476kq() {
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
                return newMessageInfo(f43753b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C14476kq();
            case 4:
                return new C14475kp();
            case 5:
                return f43753b;
            case 6:
                C63010eb ebVar = f43754c;
                if (ebVar == null) {
                    synchronized (C14476kq.class) {
                        ebVar = f43754c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43753b);
                            f43754c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
