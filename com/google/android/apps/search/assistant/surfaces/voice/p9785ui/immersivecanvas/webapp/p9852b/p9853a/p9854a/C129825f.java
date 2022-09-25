package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.a.f */
/* compiled from: PG */
public final class C129825f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129825f f356204c;

    /* renamed from: d */
    private static volatile C63010eb f356205d;

    /* renamed from: a */
    public int f356206a;

    /* renamed from: b */
    public int f356207b;

    static {
        C129825f fVar = new C129825f();
        f356204c = fVar;
        C62942bv.registerDefaultInstance(C129825f.class, fVar);
    }

    private C129825f() {
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
                return newMessageInfo(f356204c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C129823d.f356203a});
            case 3:
                return new C129825f();
            case 4:
                return new C129822c();
            case 5:
                return f356204c;
            case 6:
                C63010eb ebVar = f356205d;
                if (ebVar == null) {
                    synchronized (C129825f.class) {
                        ebVar = f356205d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356204c);
                            f356205d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
