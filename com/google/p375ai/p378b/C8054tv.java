package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.tv */
/* compiled from: PG */
public final class C8054tv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8054tv f28344d;

    /* renamed from: f */
    private static volatile C63010eb f28345f;

    /* renamed from: a */
    public int f28346a;

    /* renamed from: b */
    public String f28347b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C7536ax f28348c;

    /* renamed from: e */
    private byte f28349e = 2;

    static {
        C8054tv tvVar = new C8054tv();
        f28344d = tvVar;
        C62942bv.registerDefaultInstance(C8054tv.class, tvVar);
    }

    private C8054tv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28349e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28349e = b;
                return null;
            case 2:
                return newMessageInfo(f28344d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8054tv();
            case 4:
                return new C8053tu();
            case 5:
                return f28344d;
            case 6:
                C63010eb ebVar = f28345f;
                if (ebVar == null) {
                    synchronized (C8054tv.class) {
                        ebVar = f28345f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28344d);
                            f28345f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
