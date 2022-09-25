package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.u */
/* compiled from: PG */
public final class C123532u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123532u f341352c;

    /* renamed from: d */
    private static volatile C63010eb f341353d;

    /* renamed from: a */
    public int f341354a;

    /* renamed from: b */
    public C65682h f341355b;

    static {
        C123532u uVar = new C123532u();
        f341352c = uVar;
        C62942bv.registerDefaultInstance(C123532u.class, uVar);
    }

    private C123532u() {
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
                return newMessageInfo(f341352c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C123532u();
            case 4:
                return new C123531t();
            case 5:
                return f341352c;
            case 6:
                C63010eb ebVar = f341353d;
                if (ebVar == null) {
                    synchronized (C123532u.class) {
                        ebVar = f341353d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341352c);
                            f341353d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
