package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.am */
/* compiled from: PG */
public final class C128064am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C128064am f352375d;

    /* renamed from: e */
    private static volatile C63010eb f352376e;

    /* renamed from: a */
    public int f352377a;

    /* renamed from: b */
    public String f352378b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f352379c;

    static {
        C128064am amVar = new C128064am();
        f352375d = amVar;
        C62942bv.registerDefaultInstance(C128064am.class, amVar);
    }

    private C128064am() {
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
                return newMessageInfo(f352375d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C128062ak.f352374a});
            case 3:
                return new C128064am();
            case 4:
                return new C128061aj();
            case 5:
                return f352375d;
            case 6:
                C63010eb ebVar = f352376e;
                if (ebVar == null) {
                    synchronized (C128064am.class) {
                        ebVar = f352376e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352375d);
                            f352376e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
