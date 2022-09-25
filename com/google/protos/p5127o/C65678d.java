package com.google.protos.p5127o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.d */
/* compiled from: PG */
public final class C65678d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65678d f178449e;

    /* renamed from: f */
    private static volatile C63010eb f178450f;

    /* renamed from: a */
    public int f178451a;

    /* renamed from: b */
    public C65682h f178452b;

    /* renamed from: c */
    public String f178453c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C65691q f178454d;

    static {
        C65678d dVar = new C65678d();
        f178449e = dVar;
        C62942bv.registerDefaultInstance(C65678d.class, dVar);
    }

    private C65678d() {
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
                return newMessageInfo(f178449e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65678d();
            case 4:
                return new C65677c();
            case 5:
                return f178449e;
            case 6:
                C63010eb ebVar = f178450f;
                if (ebVar == null) {
                    synchronized (C65678d.class) {
                        ebVar = f178450f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178449e);
                            f178450f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
