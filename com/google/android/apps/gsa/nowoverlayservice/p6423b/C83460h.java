package com.google.android.apps.gsa.nowoverlayservice.p6423b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.b.h */
/* compiled from: PG */
public final class C83460h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83460h f227521d;

    /* renamed from: e */
    private static volatile C63010eb f227522e;

    /* renamed from: a */
    public int f227523a;

    /* renamed from: b */
    public C83458f f227524b;

    /* renamed from: c */
    public String f227525c = BuildConfig.FLAVOR;

    static {
        C83460h hVar = new C83460h();
        f227521d = hVar;
        C62942bv.registerDefaultInstance(C83460h.class, hVar);
    }

    private C83460h() {
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
                return newMessageInfo(f227521d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83460h();
            case 4:
                return new C83459g();
            case 5:
                return f227521d;
            case 6:
                C63010eb ebVar = f227522e;
                if (ebVar == null) {
                    synchronized (C83460h.class) {
                        ebVar = f227522e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227521d);
                            f227522e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
