package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.C65184er;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bs */
/* compiled from: PG */
public final class C122427bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122427bs f339414c;

    /* renamed from: e */
    private static volatile C63010eb f339415e;

    /* renamed from: a */
    public int f339416a = 0;

    /* renamed from: b */
    public Object f339417b;

    /* renamed from: d */
    private byte f339418d = 2;

    static {
        C122427bs bsVar = new C122427bs();
        f339414c = bsVar;
        C62942bv.registerDefaultInstance(C122427bs.class, bsVar);
    }

    private C122427bs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339418d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339418d = b;
                return null;
            case 2:
                return newMessageInfo(f339414c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C65184er.class, C122093b.class});
            case 3:
                return new C122427bs();
            case 4:
                return new C122426br();
            case 5:
                return f339414c;
            case 6:
                C63010eb ebVar = f339415e;
                if (ebVar == null) {
                    synchronized (C122427bs.class) {
                        ebVar = f339415e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339414c);
                            f339415e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
