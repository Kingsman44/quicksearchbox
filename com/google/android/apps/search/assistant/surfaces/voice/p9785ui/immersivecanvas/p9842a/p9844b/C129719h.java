package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.b.h */
/* compiled from: PG */
public final class C129719h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C129719h f355962c;

    /* renamed from: d */
    private static volatile C63010eb f355963d;

    /* renamed from: a */
    public int f355964a;

    /* renamed from: b */
    public int f355965b;

    static {
        C129719h hVar = new C129719h();
        f355962c = hVar;
        C62942bv.registerDefaultInstance(C129719h.class, hVar);
    }

    private C129719h() {
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
                return newMessageInfo(f355962c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C129717f.f355961a});
            case 3:
                return new C129719h();
            case 4:
                return new C129716e();
            case 5:
                return f355962c;
            case 6:
                C63010eb ebVar = f355963d;
                if (ebVar == null) {
                    synchronized (C129719h.class) {
                        ebVar = f355963d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355962c);
                            f355963d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
