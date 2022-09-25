package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bz */
/* compiled from: PG */
public final class C122434bz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122434bz f339429c;

    /* renamed from: e */
    private static volatile C63010eb f339430e;

    /* renamed from: a */
    public int f339431a = 0;

    /* renamed from: b */
    public Object f339432b;

    /* renamed from: d */
    private byte f339433d = 2;

    static {
        C122434bz bzVar = new C122434bz();
        f339429c = bzVar;
        C62942bv.registerDefaultInstance(C122434bz.class, bzVar);
    }

    private C122434bz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339433d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339433d = b;
                return null;
            case 2:
                return newMessageInfo(f339429c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C122401at.class, C122095d.class});
            case 3:
                return new C122434bz();
            case 4:
                return new C122433by();
            case 5:
                return f339429c;
            case 6:
                C63010eb ebVar = f339430e;
                if (ebVar == null) {
                    synchronized (C122434bz.class) {
                        ebVar = f339430e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339429c);
                            f339430e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
