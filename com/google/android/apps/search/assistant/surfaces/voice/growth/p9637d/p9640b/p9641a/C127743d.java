package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.a.d */
/* compiled from: PG */
public final class C127743d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C127743d f351634g;

    /* renamed from: h */
    private static volatile C63010eb f351635h;

    /* renamed from: a */
    public String f351636a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C127750k f351637b;

    /* renamed from: c */
    public C127741b f351638c;

    /* renamed from: d */
    public String f351639d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f351640e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C127748i f351641f;

    static {
        C127743d dVar = new C127743d();
        f351634g = dVar;
        C62942bv.registerDefaultInstance(C127743d.class, dVar);
    }

    private C127743d() {
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
                return newMessageInfo(f351634g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0003\t\u0004\t\u0005Ȉ\u0006Ȉ\u0007\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C127743d();
            case 4:
                return new C127742c();
            case 5:
                return f351634g;
            case 6:
                C63010eb ebVar = f351635h;
                if (ebVar == null) {
                    synchronized (C127743d.class) {
                        ebVar = f351635h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351634g);
                            f351635h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
