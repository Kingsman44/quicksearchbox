package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ae */
/* compiled from: PG */
public final class C122386ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C122386ae f339300a;

    /* renamed from: b */
    private static volatile C63010eb f339301b;

    static {
        C122386ae aeVar = new C122386ae();
        f339300a = aeVar;
        C62942bv.registerDefaultInstance(C122386ae.class, aeVar);
    }

    private C122386ae() {
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
                return newMessageInfo(f339300a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C122386ae();
            case 4:
                return new C122385ad();
            case 5:
                return f339300a;
            case 6:
                C63010eb ebVar = f339301b;
                if (ebVar == null) {
                    synchronized (C122386ae.class) {
                        ebVar = f339301b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339300a);
                            f339301b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
