package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ap */
/* compiled from: PG */
public final class C122397ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C122397ap f339328d;

    /* renamed from: f */
    private static volatile C63010eb f339329f;

    /* renamed from: a */
    public int f339330a = 0;

    /* renamed from: b */
    public Object f339331b;

    /* renamed from: c */
    public int f339332c;

    /* renamed from: e */
    private byte f339333e = 2;

    static {
        C122397ap apVar = new C122397ap();
        f339328d = apVar;
        C62942bv.registerDefaultInstance(C122397ap.class, apVar);
    }

    private C122397ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339333e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339333e = b;
                return null;
            case 2:
                return newMessageInfo(f339328d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u0004\u0002м\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, C122392ak.class, C122388ag.class, C122390ai.class, C122386ae.class});
            case 3:
                return new C122397ap();
            case 4:
                return new C122395an();
            case 5:
                return f339328d;
            case 6:
                C63010eb ebVar = f339329f;
                if (ebVar == null) {
                    synchronized (C122397ap.class) {
                        ebVar = f339329f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339328d);
                            f339329f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
