package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.eb */
/* compiled from: PG */
public final class C53173eb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53173eb f139350f;

    /* renamed from: g */
    private static volatile C63010eb f139351g;

    /* renamed from: a */
    public int f139352a;

    /* renamed from: b */
    public String f139353b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139354c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f139355d;

    /* renamed from: e */
    public String f139356e = BuildConfig.FLAVOR;

    static {
        C53173eb ebVar = new C53173eb();
        f139350f = ebVar;
        C62942bv.registerDefaultInstance(C53173eb.class, ebVar);
    }

    private C53173eb() {
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
                return newMessageInfo(f139350f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0004ဌ\u0005\u0005ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C53170dz.f139349a, "e"});
            case 3:
                return new C53173eb();
            case 4:
                return new C53169dy();
            case 5:
                return f139350f;
            case 6:
                C63010eb ebVar = f139351g;
                if (ebVar == null) {
                    synchronized (C53173eb.class) {
                        ebVar = f139351g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139350f);
                            f139351g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
