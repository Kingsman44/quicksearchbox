package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.g */
/* compiled from: PG */
public final class C122452g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f339468b = new C122450e();

    /* renamed from: c */
    public static final C122452g f339469c;

    /* renamed from: d */
    private static volatile C63010eb f339470d;

    /* renamed from: a */
    public C62961ch f339471a = emptyIntList();

    static {
        C122452g gVar = new C122452g();
        f339469c = gVar;
        C62942bv.registerDefaultInstance(C122452g.class, gVar);
    }

    private C122452g() {
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
                return newMessageInfo(f339469c, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            case 3:
                return new C122452g();
            case 4:
                return new C122451f();
            case 5:
                return f339469c;
            case 6:
                C63010eb ebVar = f339470d;
                if (ebVar == null) {
                    synchronized (C122452g.class) {
                        ebVar = f339470d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339469c);
                            f339470d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
