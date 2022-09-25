package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ar */
/* compiled from: PG */
public final class C122399ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122399ar f339334b;

    /* renamed from: c */
    private static volatile C63010eb f339335c;

    /* renamed from: a */
    public int f339336a;

    static {
        C122399ar arVar = new C122399ar();
        f339334b = arVar;
        C62942bv.registerDefaultInstance(C122399ar.class, arVar);
    }

    private C122399ar() {
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
                return newMessageInfo(f339334b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C122399ar();
            case 4:
                return new C122398aq();
            case 5:
                return f339334b;
            case 6:
                C63010eb ebVar = f339335c;
                if (ebVar == null) {
                    synchronized (C122399ar.class) {
                        ebVar = f339335c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339334b);
                            f339335c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
