package com.google.assistant.p3957l.p3967d.p3968a.p3972d.p3973a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.d.a.d.a.c */
/* compiled from: PG */
public final class C52987c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52987c f138897d;

    /* renamed from: e */
    private static volatile C63010eb f138898e;

    /* renamed from: a */
    public int f138899a;

    /* renamed from: b */
    public int f138900b;

    /* renamed from: c */
    public String f138901c = BuildConfig.FLAVOR;

    static {
        C52987c cVar = new C52987c();
        f138897d = cVar;
        C62942bv.registerDefaultInstance(C52987c.class, cVar);
    }

    private C52987c() {
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
                return newMessageInfo(f138897d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52987c();
            case 4:
                return new C52986b();
            case 5:
                return f138897d;
            case 6:
                C63010eb ebVar = f138898e;
                if (ebVar == null) {
                    synchronized (C52987c.class) {
                        ebVar = f138898e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138897d);
                            f138898e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
