package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.y */
/* compiled from: PG */
public final class C122470y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122470y f339529b;

    /* renamed from: c */
    private static volatile C63010eb f339530c;

    /* renamed from: a */
    public String f339531a = BuildConfig.FLAVOR;

    static {
        C122470y yVar = new C122470y();
        f339529b = yVar;
        C62942bv.registerDefaultInstance(C122470y.class, yVar);
    }

    private C122470y() {
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
                return newMessageInfo(f339529b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C122470y();
            case 4:
                return new C122469x();
            case 5:
                return f339529b;
            case 6:
                C63010eb ebVar = f339530c;
                if (ebVar == null) {
                    synchronized (C122470y.class) {
                        ebVar = f339530c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339529b);
                            f339530c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
