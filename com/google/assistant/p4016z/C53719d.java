package com.google.assistant.p4016z;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3860as.C49792f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.d */
/* compiled from: PG */
public final class C53719d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53719d f141028f;

    /* renamed from: g */
    private static volatile C63010eb f141029g;

    /* renamed from: a */
    public int f141030a;

    /* renamed from: b */
    public long f141031b;

    /* renamed from: c */
    public String f141032c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C49792f f141033d;

    /* renamed from: e */
    public C53729n f141034e;

    static {
        C53719d dVar = new C53719d();
        f141028f = dVar;
        C62942bv.registerDefaultInstance(C53719d.class, dVar);
    }

    private C53719d() {
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
                return newMessageInfo(f141028f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C53719d();
            case 4:
                return new C53718c();
            case 5:
                return f141028f;
            case 6:
                C63010eb ebVar = f141029g;
                if (ebVar == null) {
                    synchronized (C53719d.class) {
                        ebVar = f141029g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141028f);
                            f141029g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
