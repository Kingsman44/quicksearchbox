package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.i */
/* compiled from: PG */
public final class C122454i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122454i f339472b;

    /* renamed from: d */
    private static volatile C63010eb f339473d;

    /* renamed from: a */
    public C62971cq f339474a = emptyProtobufList();

    /* renamed from: c */
    private byte f339475c = 2;

    static {
        C122454i iVar = new C122454i();
        f339472b = iVar;
        C62942bv.registerDefaultInstance(C122454i.class, iVar);
    }

    private C122454i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339475c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339475c = b;
                return null;
            case 2:
                return newMessageInfo(f339472b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C80047aa.class});
            case 3:
                return new C122454i();
            case 4:
                return new C122453h();
            case 5:
                return f339472b;
            case 6:
                C63010eb ebVar = f339473d;
                if (ebVar == null) {
                    synchronized (C122454i.class) {
                        ebVar = f339473d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339472b);
                            f339473d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
