package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.s */
/* compiled from: PG */
public final class C123530s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123530s f341348b;

    /* renamed from: d */
    private static volatile C63010eb f341349d;

    /* renamed from: a */
    public C62971cq f341350a = emptyProtobufList();

    /* renamed from: c */
    private byte f341351c = 2;

    static {
        C123530s sVar = new C123530s();
        f341348b = sVar;
        C62942bv.registerDefaultInstance(C123530s.class, sVar);
    }

    private C123530s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341351c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341351c = b;
                return null;
            case 2:
                return newMessageInfo(f341348b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C61752n.class});
            case 3:
                return new C123530s();
            case 4:
                return new C123529r();
            case 5:
                return f341348b;
            case 6:
                C63010eb ebVar = f341349d;
                if (ebVar == null) {
                    synchronized (C123530s.class) {
                        ebVar = f341349d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341348b);
                            f341349d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
