package com.google.android.apps.gsa.shared.speech.hotword.p7143a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.a.d */
/* compiled from: PG */
public final class C90582d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C90582d f253245d;

    /* renamed from: e */
    private static volatile C63010eb f253246e;

    /* renamed from: a */
    public int f253247a;

    /* renamed from: b */
    public int f253248b = 1;

    /* renamed from: c */
    public String f253249c = BuildConfig.FLAVOR;

    static {
        C90582d dVar = new C90582d();
        f253245d = dVar;
        C62942bv.registerDefaultInstance(C90582d.class, dVar);
    }

    private C90582d() {
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
                return newMessageInfo(f253245d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C90584f.m147801b(), C45240c.f118157a});
            case 3:
                return new C90582d();
            case 4:
                return new C90581c();
            case 5:
                return f253245d;
            case 6:
                C63010eb ebVar = f253246e;
                if (ebVar == null) {
                    synchronized (C90582d.class) {
                        ebVar = f253246e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f253245d);
                            f253246e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
