package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.d */
/* compiled from: PG */
public final class C122449d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C122449d f339464b;

    /* renamed from: d */
    private static volatile C63010eb f339465d;

    /* renamed from: a */
    public C62971cq f339466a = emptyProtobufList();

    /* renamed from: c */
    private byte f339467c = 2;

    static {
        C122449d dVar = new C122449d();
        f339464b = dVar;
        C62942bv.registerDefaultInstance(C122449d.class, dVar);
    }

    private C122449d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f339467c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f339467c = b;
                return null;
            case 2:
                return newMessageInfo(f339464b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C80047aa.class});
            case 3:
                return new C122449d();
            case 4:
                return new C122435c();
            case 5:
                return f339464b;
            case 6:
                C63010eb ebVar = f339465d;
                if (ebVar == null) {
                    synchronized (C122449d.class) {
                        ebVar = f339465d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339464b);
                            f339465d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
