package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.cb */
/* compiled from: PG */
public final class C122437cb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122437cb f339434c;

    /* renamed from: e */
    private static volatile C63010eb f339435e;

    /* renamed from: a */
    public int f339436a = 0;

    /* renamed from: b */
    public Object f339437b;

    /* renamed from: d */
    private byte f339438d = 2;

    static {
        C122437cb cbVar = new C122437cb();
        f339434c = cbVar;
        C62942bv.registerDefaultInstance(C122437cb.class, cbVar);
    }

    private C122437cb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339438d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339438d = b;
                return null;
            case 2:
                return newMessageInfo(f339434c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C122403av.class, C122093b.class});
            case 3:
                return new C122437cb();
            case 4:
                return new C122436ca();
            case 5:
                return f339434c;
            case 6:
                C63010eb ebVar = f339435e;
                if (ebVar == null) {
                    synchronized (C122437cb.class) {
                        ebVar = f339435e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339434c);
                            f339435e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
