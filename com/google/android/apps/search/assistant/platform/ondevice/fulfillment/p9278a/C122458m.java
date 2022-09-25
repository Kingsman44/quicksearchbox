package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.m */
/* compiled from: PG */
public final class C122458m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122458m f339484b;

    /* renamed from: c */
    private static volatile C63010eb f339485c;

    /* renamed from: a */
    public C62961ch f339486a = emptyIntList();

    static {
        C122458m mVar = new C122458m();
        f339484b = mVar;
        C62942bv.registerDefaultInstance(C122458m.class, mVar);
    }

    private C122458m() {
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
                return newMessageInfo(f339484b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003'", new Object[]{"a"});
            case 3:
                return new C122458m();
            case 4:
                return new C122457l();
            case 5:
                return f339484b;
            case 6:
                C63010eb ebVar = f339485c;
                if (ebVar == null) {
                    synchronized (C122458m.class) {
                        ebVar = f339485c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339484b);
                            f339485c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
