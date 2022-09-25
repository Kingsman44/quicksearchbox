package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.t */
/* compiled from: PG */
public final class C122465t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C122465t f339501d;

    /* renamed from: e */
    private static volatile C63010eb f339502e;

    /* renamed from: a */
    public boolean f339503a;

    /* renamed from: b */
    public C62971cq f339504b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f339505c;

    static {
        C122465t tVar = new C122465t();
        f339501d = tVar;
        C62942bv.registerDefaultInstance(C122465t.class, tVar);
    }

    private C122465t() {
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
                return newMessageInfo(f339501d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0002Ț\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C122465t();
            case 4:
                return new C122464s();
            case 5:
                return f339501d;
            case 6:
                C63010eb ebVar = f339502e;
                if (ebVar == null) {
                    synchronized (C122465t.class) {
                        ebVar = f339502e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339501d);
                            f339502e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
