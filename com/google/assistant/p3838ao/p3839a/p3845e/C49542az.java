package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.az */
/* compiled from: PG */
public final class C49542az extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49542az f127827e;

    /* renamed from: f */
    private static volatile C63010eb f127828f;

    /* renamed from: a */
    public int f127829a;

    /* renamed from: b */
    public C49619j f127830b;

    /* renamed from: c */
    public String f127831c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127832d;

    static {
        C49542az azVar = new C49542az();
        f127827e = azVar;
        C62942bv.registerDefaultInstance(C49542az.class, azVar);
    }

    private C49542az() {
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
                return newMessageInfo(f127827e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0001\u0005ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C49540ax.f127826a});
            case 3:
                return new C49542az();
            case 4:
                return new C49539aw();
            case 5:
                return f127827e;
            case 6:
                C63010eb ebVar = f127828f;
                if (ebVar == null) {
                    synchronized (C49542az.class) {
                        ebVar = f127828f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127827e);
                            f127828f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
