package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.b */
/* compiled from: PG */
public final class C64466b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64466b f174858e;

    /* renamed from: f */
    private static volatile C63010eb f174859f;

    /* renamed from: a */
    public int f174860a;

    /* renamed from: b */
    public int f174861b;

    /* renamed from: c */
    public String f174862c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f174863d;

    static {
        C64466b bVar = new C64466b();
        f174858e = bVar;
        C62942bv.registerDefaultInstance(C64466b.class, bVar);
    }

    private C64466b() {
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
                return newMessageInfo(f174858e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64466b();
            case 4:
                return new C64439a();
            case 5:
                return f174858e;
            case 6:
                C63010eb ebVar = f174859f;
                if (ebVar == null) {
                    synchronized (C64466b.class) {
                        ebVar = f174859f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174858e);
                            f174859f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
