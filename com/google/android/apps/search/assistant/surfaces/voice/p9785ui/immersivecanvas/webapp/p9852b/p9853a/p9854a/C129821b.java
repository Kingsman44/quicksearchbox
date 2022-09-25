package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.a.b */
/* compiled from: PG */
public final class C129821b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129821b f356199c;

    /* renamed from: d */
    private static volatile C63010eb f356200d;

    /* renamed from: a */
    public int f356201a;

    /* renamed from: b */
    public String f356202b = BuildConfig.FLAVOR;

    static {
        C129821b bVar = new C129821b();
        f356199c = bVar;
        C62942bv.registerDefaultInstance(C129821b.class, bVar);
    }

    private C129821b() {
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
                return newMessageInfo(f356199c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C129821b();
            case 4:
                return new C129820a();
            case 5:
                return f356199c;
            case 6:
                C63010eb ebVar = f356200d;
                if (ebVar == null) {
                    synchronized (C129821b.class) {
                        ebVar = f356200d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356199c);
                            f356200d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
