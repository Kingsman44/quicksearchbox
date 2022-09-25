package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.a.k */
/* compiled from: PG */
public final class C127750k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C127750k f351661d;

    /* renamed from: e */
    private static volatile C63010eb f351662e;

    /* renamed from: a */
    public String f351663a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f351664b;

    /* renamed from: c */
    public int f351665c;

    static {
        C127750k kVar = new C127750k();
        f351661d = kVar;
        C62942bv.registerDefaultInstance(C127750k.class, kVar);
    }

    private C127750k() {
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
                return newMessageInfo(f351661d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C127750k();
            case 4:
                return new C127749j();
            case 5:
                return f351661d;
            case 6:
                C63010eb ebVar = f351662e;
                if (ebVar == null) {
                    synchronized (C127750k.class) {
                        ebVar = f351662e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351661d);
                            f351662e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
