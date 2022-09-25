package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b;

import com.google.assistant.p3897e.p3921j.p3926e.C51854bo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.b.d */
/* compiled from: PG */
public final class C129715d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129715d f355957c;

    /* renamed from: d */
    private static volatile C63010eb f355958d;

    /* renamed from: a */
    public int f355959a = 0;

    /* renamed from: b */
    public Object f355960b;

    static {
        C129715d dVar = new C129715d();
        f355957c = dVar;
        C62942bv.registerDefaultInstance(C129715d.class, dVar);
    }

    private C129715d() {
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
                return newMessageInfo(f355957c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C129714c.class, C51854bo.class});
            case 3:
                return new C129715d();
            case 4:
                return new C129712a();
            case 5:
                return f355957c;
            case 6:
                C63010eb ebVar = f355958d;
                if (ebVar == null) {
                    synchronized (C129715d.class) {
                        ebVar = f355958d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355957c);
                            f355958d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
