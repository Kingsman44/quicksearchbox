package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.hv */
/* compiled from: PG */
public final class C49137hv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49137hv f127063d;

    /* renamed from: e */
    private static volatile C63010eb f127064e;

    /* renamed from: a */
    public int f127065a;

    /* renamed from: b */
    public String f127066b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f127067c;

    static {
        C49137hv hvVar = new C49137hv();
        f127063d = hvVar;
        C62942bv.registerDefaultInstance(C49137hv.class, hvVar);
    }

    private C49137hv() {
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
                return newMessageInfo(f127063d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C49135ht.f127062a});
            case 3:
                return new C49137hv();
            case 4:
                return new C49134hs();
            case 5:
                return f127063d;
            case 6:
                C63010eb ebVar = f127064e;
                if (ebVar == null) {
                    synchronized (C49137hv.class) {
                        ebVar = f127064e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127063d);
                            f127064e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
