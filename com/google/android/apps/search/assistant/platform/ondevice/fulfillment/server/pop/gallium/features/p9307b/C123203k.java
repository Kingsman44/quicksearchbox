package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9307b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4851a.p4852a.C63318b;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.b.k */
/* compiled from: PG */
public final class C123203k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123203k f340906b;

    /* renamed from: d */
    private static volatile C63010eb f340907d;

    /* renamed from: a */
    public C62971cq f340908a = emptyProtobufList();

    /* renamed from: c */
    private byte f340909c = 2;

    static {
        C123203k kVar = new C123203k();
        f340906b = kVar;
        C62942bv.registerDefaultInstance(C123203k.class, kVar);
    }

    private C123203k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f340909c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f340909c = b;
                return null;
            case 2:
                return newMessageInfo(f340906b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C63318b.class});
            case 3:
                return new C123203k();
            case 4:
                return new C123202j();
            case 5:
                return f340906b;
            case 6:
                C63010eb ebVar = f340907d;
                if (ebVar == null) {
                    synchronized (C123203k.class) {
                        ebVar = f340907d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f340906b);
                            f340907d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
