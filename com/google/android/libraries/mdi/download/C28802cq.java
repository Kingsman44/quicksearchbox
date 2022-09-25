package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.cq */
/* compiled from: PG */
public final class C28802cq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28802cq f78261c;

    /* renamed from: d */
    private static volatile C63010eb f78262d;

    /* renamed from: a */
    public int f78263a;

    /* renamed from: b */
    public int f78264b;

    static {
        C28802cq cqVar = new C28802cq();
        f78261c = cqVar;
        C62942bv.registerDefaultInstance(C28802cq.class, cqVar);
    }

    private C28802cq() {
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
                return newMessageInfo(f78261c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C28801cp.f78260a});
            case 3:
                return new C28802cq();
            case 4:
                return new C28800co();
            case 5:
                return f78261c;
            case 6:
                C63010eb ebVar = f78262d;
                if (ebVar == null) {
                    synchronized (C28802cq.class) {
                        ebVar = f78262d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78261c);
                            f78262d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
