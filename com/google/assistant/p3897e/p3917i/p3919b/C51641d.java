package com.google.assistant.p3897e.p3917i.p3919b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.b.d */
/* compiled from: PG */
public final class C51641d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51641d f134566f;

    /* renamed from: g */
    private static volatile C63010eb f134567g;

    /* renamed from: a */
    public int f134568a;

    /* renamed from: b */
    public String f134569b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f134570c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f134571d;

    /* renamed from: e */
    public int f134572e;

    static {
        C51641d dVar = new C51641d();
        f134566f = dVar;
        C62942bv.registerDefaultInstance(C51641d.class, dVar);
    }

    private C51641d() {
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
                return newMessageInfo(f134566f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဌ\u0002\u0003ဌ\u0003\u0005ဈ\u0000\u0006ဈ\u0001", new Object[]{"a", "d", C51640c.f134565a, "e", C51639b.f134564a, "b", C45240c.f118157a});
            case 3:
                return new C51641d();
            case 4:
                return new C51637a();
            case 5:
                return f134566f;
            case 6:
                C63010eb ebVar = f134567g;
                if (ebVar == null) {
                    synchronized (C51641d.class) {
                        ebVar = f134567g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134566f);
                            f134567g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
