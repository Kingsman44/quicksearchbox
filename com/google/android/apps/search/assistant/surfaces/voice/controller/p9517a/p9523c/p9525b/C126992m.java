package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.b.m */
/* compiled from: PG */
public final class C126992m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C126992m f349681d;

    /* renamed from: e */
    private static volatile C63010eb f349682e;

    /* renamed from: a */
    public int f349683a;

    /* renamed from: b */
    public String f349684b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f349685c = BuildConfig.FLAVOR;

    static {
        C126992m mVar = new C126992m();
        f349681d = mVar;
        C62942bv.registerDefaultInstance(C126992m.class, mVar);
    }

    private C126992m() {
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
                return newMessageInfo(f349681d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C126992m();
            case 4:
                return new C126991l();
            case 5:
                return f349681d;
            case 6:
                C63010eb ebVar = f349682e;
                if (ebVar == null) {
                    synchronized (C126992m.class) {
                        ebVar = f349682e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349681d);
                            f349682e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
