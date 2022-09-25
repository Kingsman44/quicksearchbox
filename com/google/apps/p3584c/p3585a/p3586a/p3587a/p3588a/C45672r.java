package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.r */
/* compiled from: PG */
public final class C45672r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45672r f120145d;

    /* renamed from: e */
    private static volatile C63010eb f120146e;

    /* renamed from: a */
    public int f120147a;

    /* renamed from: b */
    public C58072d f120148b;

    /* renamed from: c */
    public String f120149c = BuildConfig.FLAVOR;

    static {
        C45672r rVar = new C45672r();
        f120145d = rVar;
        C62942bv.registerDefaultInstance(C45672r.class, rVar);
    }

    private C45672r() {
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
                return newMessageInfo(f120145d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0004\u0005ဉ\u0003", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C45672r();
            case 4:
                return new C45671q();
            case 5:
                return f120145d;
            case 6:
                C63010eb ebVar = f120146e;
                if (ebVar == null) {
                    synchronized (C45672r.class) {
                        ebVar = f120146e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120145d);
                            f120146e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
