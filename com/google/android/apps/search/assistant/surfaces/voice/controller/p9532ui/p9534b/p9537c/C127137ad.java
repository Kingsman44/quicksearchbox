package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.ad */
/* compiled from: PG */
public final class C127137ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C127137ad f350047d;

    /* renamed from: e */
    private static volatile C63010eb f350048e;

    /* renamed from: a */
    public int f350049a;

    /* renamed from: b */
    public C52070ec f350050b;

    /* renamed from: c */
    public long f350051c;

    static {
        C127137ad adVar = new C127137ad();
        f350047d = adVar;
        C62942bv.registerDefaultInstance(C127137ad.class, adVar);
    }

    private C127137ad() {
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
                return newMessageInfo(f350047d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127137ad();
            case 4:
                return new C127136ac();
            case 5:
                return f350047d;
            case 6:
                C63010eb ebVar = f350048e;
                if (ebVar == null) {
                    synchronized (C127137ad.class) {
                        ebVar = f350048e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350047d);
                            f350048e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
