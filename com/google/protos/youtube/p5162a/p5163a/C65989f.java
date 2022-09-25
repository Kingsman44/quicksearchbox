package com.google.protos.youtube.p5162a.p5163a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.f */
/* compiled from: PG */
public final class C65989f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65989f f179473d;

    /* renamed from: e */
    private static volatile C63010eb f179474e;

    /* renamed from: a */
    public int f179475a;

    /* renamed from: b */
    public String f179476b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179477c = BuildConfig.FLAVOR;

    static {
        C65989f fVar = new C65989f();
        f179473d = fVar;
        C62942bv.registerDefaultInstance(C65989f.class, fVar);
    }

    private C65989f() {
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
                return newMessageInfo(f179473d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65989f();
            case 4:
                return new C65988e();
            case 5:
                return f179473d;
            case 6:
                C63010eb ebVar = f179474e;
                if (ebVar == null) {
                    synchronized (C65989f.class) {
                        ebVar = f179474e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179473d);
                            f179474e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
