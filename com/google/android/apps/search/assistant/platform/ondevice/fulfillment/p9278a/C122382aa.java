package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.aa */
/* compiled from: PG */
public final class C122382aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122382aa f339293b;

    /* renamed from: c */
    private static volatile C63010eb f339294c;

    /* renamed from: a */
    public boolean f339295a;

    static {
        C122382aa aaVar = new C122382aa();
        f339293b = aaVar;
        C62942bv.registerDefaultInstance(C122382aa.class, aaVar);
    }

    private C122382aa() {
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
                return newMessageInfo(f339293b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C122382aa();
            case 4:
                return new C122471z();
            case 5:
                return f339293b;
            case 6:
                C63010eb ebVar = f339294c;
                if (ebVar == null) {
                    synchronized (C122382aa.class) {
                        ebVar = f339294c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339293b);
                            f339294c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
