package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.az */
/* compiled from: PG */
public final class C122407az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122407az f339353b;

    /* renamed from: c */
    private static volatile C63010eb f339354c;

    /* renamed from: a */
    public C63088z f339355a = C63088z.f170246b;

    static {
        C122407az azVar = new C122407az();
        f339353b = azVar;
        C62942bv.registerDefaultInstance(C122407az.class, azVar);
    }

    private C122407az() {
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
                return newMessageInfo(f339353b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C122407az();
            case 4:
                return new C122406ay();
            case 5:
                return f339353b;
            case 6:
                C63010eb ebVar = f339354c;
                if (ebVar == null) {
                    synchronized (C122407az.class) {
                        ebVar = f339354c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339353b);
                            f339354c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
