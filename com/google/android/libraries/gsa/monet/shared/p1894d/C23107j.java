package com.google.android.libraries.gsa.monet.shared.p1894d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.gsa.monet.shared.d.j */
/* compiled from: PG */
public final class C23107j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C23107j f63462d;

    /* renamed from: e */
    private static volatile C63010eb f63463e;

    /* renamed from: a */
    public int f63464a;

    /* renamed from: b */
    public String f63465b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f63466c = C63088z.f170246b;

    static {
        C23107j jVar = new C23107j();
        f63462d = jVar;
        C62942bv.registerDefaultInstance(C23107j.class, jVar);
    }

    private C23107j() {
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
                return newMessageInfo(f63462d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C23107j();
            case 4:
                return new C23106i();
            case 5:
                return f63462d;
            case 6:
                C63010eb ebVar = f63463e;
                if (ebVar == null) {
                    synchronized (C23107j.class) {
                        ebVar = f63463e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f63462d);
                            f63463e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
