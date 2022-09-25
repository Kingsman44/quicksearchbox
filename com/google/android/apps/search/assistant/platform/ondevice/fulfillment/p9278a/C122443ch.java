package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5030q.C65196fc;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.ch */
/* compiled from: PG */
public final class C122443ch extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122443ch f339445c;

    /* renamed from: e */
    private static volatile C63010eb f339446e;

    /* renamed from: a */
    public int f339447a = 0;

    /* renamed from: b */
    public Object f339448b;

    /* renamed from: d */
    private byte f339449d = 2;

    static {
        C122443ch chVar = new C122443ch();
        f339445c = chVar;
        C62942bv.registerDefaultInstance(C122443ch.class, chVar);
    }

    private C122443ch() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339449d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339449d = b;
                return null;
            case 2:
                return newMessageInfo(f339445c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C65196fc.class, C122093b.class});
            case 3:
                return new C122443ch();
            case 4:
                return new C122442cg();
            case 5:
                return f339445c;
            case 6:
                C63010eb ebVar = f339446e;
                if (ebVar == null) {
                    synchronized (C122443ch.class) {
                        ebVar = f339446e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339445c);
                            f339446e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
