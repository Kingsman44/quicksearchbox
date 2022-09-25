package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.dh */
/* compiled from: PG */
public final class C119867dh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119867dh f333827d;

    /* renamed from: e */
    private static volatile C63010eb f333828e;

    /* renamed from: a */
    public C119834cb f333829a;

    /* renamed from: b */
    public int f333830b;

    /* renamed from: c */
    public C62910ar f333831c;

    static {
        C119867dh dhVar = new C119867dh();
        f333827d = dhVar;
        C62942bv.registerDefaultInstance(C119867dh.class, dhVar);
    }

    private C119867dh() {
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
                return newMessageInfo(f333827d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C119867dh();
            case 4:
                return new C119865df();
            case 5:
                return f333827d;
            case 6:
                C63010eb ebVar = f333828e;
                if (ebVar == null) {
                    synchronized (C119867dh.class) {
                        ebVar = f333828e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333827d);
                            f333828e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
