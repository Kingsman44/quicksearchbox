package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.b.c */
/* compiled from: PG */
public final class C127416c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127416c f350845c;

    /* renamed from: d */
    private static volatile C63010eb f350846d;

    /* renamed from: a */
    public int f350847a;

    /* renamed from: b */
    public int f350848b;

    static {
        C127416c cVar = new C127416c();
        f350845c = cVar;
        C62942bv.registerDefaultInstance(C127416c.class, cVar);
    }

    private C127416c() {
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
                return newMessageInfo(f350845c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127416c();
            case 4:
                return new C127414a();
            case 5:
                return f350845c;
            case 6:
                C63010eb ebVar = f350846d;
                if (ebVar == null) {
                    synchronized (C127416c.class) {
                        ebVar = f350846d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350845c);
                            f350846d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
