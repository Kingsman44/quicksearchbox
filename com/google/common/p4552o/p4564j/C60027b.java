package com.google.common.p4552o.p4564j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.b */
/* compiled from: PG */
public final class C60027b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60027b f162249d;

    /* renamed from: e */
    private static volatile C63010eb f162250e;

    /* renamed from: a */
    public int f162251a;

    /* renamed from: b */
    public String f162252b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f162253c;

    static {
        C60027b bVar = new C60027b();
        f162249d = bVar;
        C62942bv.registerDefaultInstance(C60027b.class, bVar);
    }

    private C60027b() {
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
                return newMessageInfo(f162249d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60027b();
            case 4:
                return new C60004a();
            case 5:
                return f162249d;
            case 6:
                C63010eb ebVar = f162250e;
                if (ebVar == null) {
                    synchronized (C60027b.class) {
                        ebVar = f162250e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162249d);
                            f162250e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
