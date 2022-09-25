package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bs */
/* compiled from: PG */
public final class C119824bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119824bs f333739b;

    /* renamed from: d */
    private static volatile C63010eb f333740d;

    /* renamed from: a */
    public int f333741a;

    /* renamed from: c */
    private int f333742c;

    static {
        C119824bs bsVar = new C119824bs();
        f333739b = bsVar;
        C62942bv.registerDefaultInstance(C119824bs.class, bsVar);
    }

    private C119824bs() {
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
                return newMessageInfo(f333739b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C119822bq.f333738a});
            case 3:
                return new C119824bs();
            case 4:
                return new C119821bp();
            case 5:
                return f333739b;
            case 6:
                C63010eb ebVar = f333740d;
                if (ebVar == null) {
                    synchronized (C119824bs.class) {
                        ebVar = f333740d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333739b);
                            f333740d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
