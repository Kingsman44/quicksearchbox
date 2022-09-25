package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51855bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.b.c */
/* compiled from: PG */
public final class C129714c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C129714c f355952d;

    /* renamed from: e */
    private static volatile C63010eb f355953e;

    /* renamed from: a */
    public int f355954a;

    /* renamed from: b */
    public boolean f355955b;

    /* renamed from: c */
    public int f355956c;

    static {
        C129714c cVar = new C129714c();
        f355952d = cVar;
        C62942bv.registerDefaultInstance(C129714c.class, cVar);
    }

    private C129714c() {
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
                return newMessageInfo(f355952d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C51855bp.f136028a});
            case 3:
                return new C129714c();
            case 4:
                return new C129713b();
            case 5:
                return f355952d;
            case 6:
                C63010eb ebVar = f355953e;
                if (ebVar == null) {
                    synchronized (C129714c.class) {
                        ebVar = f355953e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355952d);
                            f355953e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
