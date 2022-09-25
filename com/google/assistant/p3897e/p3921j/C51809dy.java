package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.dy */
/* compiled from: PG */
public final class C51809dy extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51809dy f135933f;

    /* renamed from: g */
    private static volatile C63010eb f135934g;

    /* renamed from: a */
    public int f135935a;

    /* renamed from: b */
    public String f135936b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135937c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C51807dw f135938d;

    /* renamed from: e */
    public boolean f135939e;

    static {
        C51809dy dyVar = new C51809dy();
        f135933f = dyVar;
        C62942bv.registerDefaultInstance(C51809dy.class, dyVar);
    }

    private C51809dy() {
    }

    /* renamed from: a */
    public final C51807dw mo53737a() {
        C51807dw dwVar = this.f135938d;
        return dwVar == null ? C51807dw.f135930b : dwVar;
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
                return newMessageInfo(f135933f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ဈ\u0001\u0005ဇ\u0004", new Object[]{"a", "b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C51809dy();
            case 4:
                return new C51808dx();
            case 5:
                return f135933f;
            case 6:
                C63010eb ebVar = f135934g;
                if (ebVar == null) {
                    synchronized (C51809dy.class) {
                        ebVar = f135934g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135933f);
                            f135934g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
