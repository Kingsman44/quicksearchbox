package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ag */
/* compiled from: PG */
public final class C122388ag extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C122388ag f339302a;

    /* renamed from: b */
    private static volatile C63010eb f339303b;

    static {
        C122388ag agVar = new C122388ag();
        f339302a = agVar;
        C62942bv.registerDefaultInstance(C122388ag.class, agVar);
    }

    private C122388ag() {
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
                return newMessageInfo(f339302a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C122388ag();
            case 4:
                return new C122387af();
            case 5:
                return f339302a;
            case 6:
                C63010eb ebVar = f339303b;
                if (ebVar == null) {
                    synchronized (C122388ag.class) {
                        ebVar = f339303b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339302a);
                            f339303b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
