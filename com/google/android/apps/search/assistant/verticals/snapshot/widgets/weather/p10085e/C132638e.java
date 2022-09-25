package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10085e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53258hf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.e.e */
/* compiled from: PG */
public final class C132638e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C132638e f361966d;

    /* renamed from: e */
    private static volatile C63010eb f361967e;

    /* renamed from: a */
    public int f361968a;

    /* renamed from: b */
    public int f361969b;

    /* renamed from: c */
    public C63042fg f361970c;

    static {
        C132638e eVar = new C132638e();
        f361966d = eVar;
        C62942bv.registerDefaultInstance(C132638e.class, eVar);
    }

    private C132638e() {
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
                return newMessageInfo(f361966d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C53258hf.m86799b(), C45240c.f118157a});
            case 3:
                return new C132638e();
            case 4:
                return new C132637d();
            case 5:
                return f361966d;
            case 6:
                C63010eb ebVar = f361967e;
                if (ebVar == null) {
                    synchronized (C132638e.class) {
                        ebVar = f361967e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f361966d);
                            f361967e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
