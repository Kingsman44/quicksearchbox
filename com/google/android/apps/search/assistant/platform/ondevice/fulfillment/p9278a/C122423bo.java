package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bo */
/* compiled from: PG */
public final class C122423bo extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122423bo f339406b;

    /* renamed from: c */
    private static volatile C63010eb f339407c;

    /* renamed from: a */
    public String f339408a = BuildConfig.FLAVOR;

    static {
        C122423bo boVar = new C122423bo();
        f339406b = boVar;
        C62942bv.registerDefaultInstance(C122423bo.class, boVar);
    }

    private C122423bo() {
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
                return newMessageInfo(f339406b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C122423bo();
            case 4:
                return new C122422bn();
            case 5:
                return f339406b;
            case 6:
                C63010eb ebVar = f339407c;
                if (ebVar == null) {
                    synchronized (C122423bo.class) {
                        ebVar = f339407c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339406b);
                            f339407c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
