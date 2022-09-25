package com.google.android.libraries.appdoctor.p575c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.appdoctor.c.c */
/* compiled from: PG */
public final class C10471c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C10471c f35225e;

    /* renamed from: f */
    private static volatile C63010eb f35226f;

    /* renamed from: a */
    public int f35227a;

    /* renamed from: b */
    public int f35228b;

    /* renamed from: c */
    public String f35229c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C10473e f35230d;

    static {
        C10471c cVar = new C10471c();
        f35225e = cVar;
        C62942bv.registerDefaultInstance(C10471c.class, cVar);
    }

    private C10471c() {
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
                return newMessageInfo(f35225e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C10471c();
            case 4:
                return new C10470b();
            case 5:
                return f35225e;
            case 6:
                C63010eb ebVar = f35226f;
                if (ebVar == null) {
                    synchronized (C10471c.class) {
                        ebVar = f35226f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35225e);
                            f35226f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
