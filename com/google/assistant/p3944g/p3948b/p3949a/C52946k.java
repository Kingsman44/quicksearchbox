package com.google.assistant.p3944g.p3948b.p3949a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.k */
/* compiled from: PG */
public final class C52946k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52946k f138824d;

    /* renamed from: e */
    private static volatile C63010eb f138825e;

    /* renamed from: a */
    public int f138826a;

    /* renamed from: b */
    public String f138827b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52939d f138828c;

    static {
        C52946k kVar = new C52946k();
        f138824d = kVar;
        C62942bv.registerDefaultInstance(C52946k.class, kVar);
    }

    private C52946k() {
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
                return newMessageInfo(f138824d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52946k();
            case 4:
                return new C52945j();
            case 5:
                return f138824d;
            case 6:
                C63010eb ebVar = f138825e;
                if (ebVar == null) {
                    synchronized (C52946k.class) {
                        ebVar = f138825e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138824d);
                            f138825e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
