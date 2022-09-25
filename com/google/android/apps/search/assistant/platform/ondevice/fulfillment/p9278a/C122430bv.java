package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bv */
/* compiled from: PG */
public final class C122430bv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122430bv f339419c;

    /* renamed from: e */
    private static volatile C63010eb f339420e;

    /* renamed from: a */
    public int f339421a = 0;

    /* renamed from: b */
    public Object f339422b;

    /* renamed from: d */
    private byte f339423d = 2;

    static {
        C122430bv bvVar = new C122430bv();
        f339419c = bvVar;
        C62942bv.registerDefaultInstance(C122430bv.class, bvVar);
    }

    private C122430bv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339423d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339423d = b;
                return null;
            case 2:
                return newMessageInfo(f339419c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001<\u0000\u0002м\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"b", "a", C122419bk.class, C122394am.class, C122095d.class, C122458m.class});
            case 3:
                return new C122430bv();
            case 4:
                return new C122428bt();
            case 5:
                return f339419c;
            case 6:
                C63010eb ebVar = f339420e;
                if (ebVar == null) {
                    synchronized (C122430bv.class) {
                        ebVar = f339420e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339419c);
                            f339420e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
