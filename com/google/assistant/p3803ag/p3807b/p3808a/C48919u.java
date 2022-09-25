package com.google.assistant.p3803ag.p3807b.p3808a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.u */
/* compiled from: PG */
public final class C48919u extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48919u f126586g;

    /* renamed from: h */
    private static volatile C63010eb f126587h;

    /* renamed from: a */
    public int f126588a;

    /* renamed from: b */
    public int f126589b;

    /* renamed from: c */
    public String f126590c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f126591d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f126592e;

    /* renamed from: f */
    public String f126593f = BuildConfig.FLAVOR;

    static {
        C48919u uVar = new C48919u();
        f126586g = uVar;
        C62942bv.registerDefaultInstance(C48919u.class, uVar);
    }

    private C48919u() {
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
                return newMessageInfo(f126586g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", C48900b.m85302b(), C45240c.f118157a, "d", "e", C39226b.m68656b(), C10662f.f35572a});
            case 3:
                return new C48919u();
            case 4:
                return new C48918t();
            case 5:
                return f126586g;
            case 6:
                C63010eb ebVar = f126587h;
                if (ebVar == null) {
                    synchronized (C48919u.class) {
                        ebVar = f126587h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126586g);
                            f126587h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
