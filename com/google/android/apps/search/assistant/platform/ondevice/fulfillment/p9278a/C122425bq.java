package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bq */
/* compiled from: PG */
public final class C122425bq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122425bq f339409c;

    /* renamed from: e */
    private static volatile C63010eb f339410e;

    /* renamed from: a */
    public int f339411a = 0;

    /* renamed from: b */
    public Object f339412b;

    /* renamed from: d */
    private byte f339413d = 2;

    static {
        C122425bq bqVar = new C122425bq();
        f339409c = bqVar;
        C62942bv.registerDefaultInstance(C122425bq.class, bqVar);
    }

    private C122425bq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339413d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339413d = b;
                return null;
            case 2:
                return newMessageInfo(f339409c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C122456k.class, C122095d.class});
            case 3:
                return new C122425bq();
            case 4:
                return new C122424bp();
            case 5:
                return f339409c;
            case 6:
                C63010eb ebVar = f339410e;
                if (ebVar == null) {
                    synchronized (C122425bq.class) {
                        ebVar = f339410e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339409c);
                            f339410e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
