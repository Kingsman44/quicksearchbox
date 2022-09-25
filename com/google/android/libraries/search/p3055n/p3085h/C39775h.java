package com.google.android.libraries.search.p3055n.p3085h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.h.h */
/* compiled from: PG */
public final class C39775h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C39775h f104621f;

    /* renamed from: g */
    private static volatile C63010eb f104622g;

    /* renamed from: a */
    public int f104623a;

    /* renamed from: b */
    public C39769b f104624b;

    /* renamed from: c */
    public String f104625c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f104626d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f104627e = emptyProtobufList();

    static {
        C39775h hVar = new C39775h();
        f104621f = hVar;
        C62942bv.registerDefaultInstance(C39775h.class, hVar);
    }

    private C39775h() {
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
                return newMessageInfo(f104621f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C39771d.class});
            case 3:
                return new C39775h();
            case 4:
                return new C39774g();
            case 5:
                return f104621f;
            case 6:
                C63010eb ebVar = f104622g;
                if (ebVar == null) {
                    synchronized (C39775h.class) {
                        ebVar = f104622g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104621f);
                            f104622g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
