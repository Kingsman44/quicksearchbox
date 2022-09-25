package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.bg */
/* compiled from: PG */
public final class C45654bg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45654bg f120104d;

    /* renamed from: e */
    private static volatile C63010eb f120105e;

    /* renamed from: a */
    public int f120106a;

    /* renamed from: b */
    public String f120107b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f120108c = BuildConfig.FLAVOR;

    static {
        C45654bg bgVar = new C45654bg();
        f120104d = bgVar;
        C62942bv.registerDefaultInstance(C45654bg.class, bgVar);
    }

    private C45654bg() {
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
                return newMessageInfo(f120104d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45654bg();
            case 4:
                return new C45653bf();
            case 5:
                return f120104d;
            case 6:
                C63010eb ebVar = f120105e;
                if (ebVar == null) {
                    synchronized (C45654bg.class) {
                        ebVar = f120105e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120104d);
                            f120105e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
