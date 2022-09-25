package com.google.p4184bj.p4189b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bj.b.b */
/* compiled from: PG */
public final class C55883b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55883b f148708d;

    /* renamed from: f */
    private static volatile C63010eb f148709f;

    /* renamed from: a */
    public String f148710a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f148711b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f148712c = C63088z.f170246b;

    /* renamed from: e */
    private int f148713e;

    static {
        C55883b bVar = new C55883b();
        f148708d = bVar;
        C62942bv.registerDefaultInstance(C55883b.class, bVar);
    }

    private C55883b() {
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
                return newMessageInfo(f148708d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C55883b();
            case 4:
                return new C55868a();
            case 5:
                return f148708d;
            case 6:
                C63010eb ebVar = f148709f;
                if (ebVar == null) {
                    synchronized (C55883b.class) {
                        ebVar = f148709f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148708d);
                            f148709f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
