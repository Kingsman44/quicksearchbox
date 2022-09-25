package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9307b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.b.m */
/* compiled from: PG */
public final class C123205m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123205m f340910c;

    /* renamed from: d */
    private static volatile C63010eb f340911d;

    /* renamed from: a */
    public int f340912a;

    /* renamed from: b */
    public C65682h f340913b;

    static {
        C123205m mVar = new C123205m();
        f340910c = mVar;
        C62942bv.registerDefaultInstance(C123205m.class, mVar);
    }

    private C123205m() {
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
                return newMessageInfo(f340910c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C123205m();
            case 4:
                return new C123204l();
            case 5:
                return f340910c;
            case 6:
                C63010eb ebVar = f340911d;
                if (ebVar == null) {
                    synchronized (C123205m.class) {
                        ebVar = f340911d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f340910c);
                            f340911d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
