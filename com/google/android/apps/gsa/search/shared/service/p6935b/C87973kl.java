package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.kl */
/* compiled from: PG */
public final class C87973kl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87973kl f237920b;

    /* renamed from: d */
    private static volatile C63010eb f237921d;

    /* renamed from: a */
    public C63088z f237922a = C63088z.f170246b;

    /* renamed from: c */
    private int f237923c;

    static {
        C87973kl klVar = new C87973kl();
        f237920b = klVar;
        C62942bv.registerDefaultInstance(C87973kl.class, klVar);
    }

    private C87973kl() {
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
                return newMessageInfo(f237920b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87973kl();
            case 4:
                return new C87972kk();
            case 5:
                return f237920b;
            case 6:
                C63010eb ebVar = f237921d;
                if (ebVar == null) {
                    synchronized (C87973kl.class) {
                        ebVar = f237921d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237920b);
                            f237921d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
