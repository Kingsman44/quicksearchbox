package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.o */
/* compiled from: PG */
public final class C132807o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C132807o f362345f;

    /* renamed from: g */
    private static volatile C63010eb f362346g;

    /* renamed from: a */
    public int f362347a;

    /* renamed from: b */
    public boolean f362348b;

    /* renamed from: c */
    public String f362349c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f362350d;

    /* renamed from: e */
    public C132809q f362351e;

    static {
        C132807o oVar = new C132807o();
        f362345f = oVar;
        C62942bv.registerDefaultInstance(C132807o.class, oVar);
    }

    private C132807o() {
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
                return newMessageInfo(f362345f, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003င\u0002\u000bဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C132807o();
            case 4:
                return new C132806n();
            case 5:
                return f362345f;
            case 6:
                C63010eb ebVar = f362346g;
                if (ebVar == null) {
                    synchronized (C132807o.class) {
                        ebVar = f362346g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362345f);
                            f362346g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
