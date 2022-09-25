package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ad */
/* compiled from: PG */
public final class C34014ad extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C34014ad f90663f;

    /* renamed from: h */
    private static volatile C63010eb f90664h;

    /* renamed from: a */
    public int f90665a;

    /* renamed from: b */
    public String f90666b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C34084ct f90667c;

    /* renamed from: d */
    public C34041bd f90668d;

    /* renamed from: e */
    public C34090cz f90669e;

    /* renamed from: g */
    private byte f90670g = 2;

    static {
        C34014ad adVar = new C34014ad();
        f90663f = adVar;
        C62942bv.registerDefaultInstance(C34014ad.class, adVar);
    }

    private C34014ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90670g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90670g = b;
                return null;
            case 2:
                return newMessageInfo(f90663f, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ለ\u0000\u0002\t\u0003Љ\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C34014ad();
            case 4:
                return new C34013ac();
            case 5:
                return f90663f;
            case 6:
                C63010eb ebVar = f90664h;
                if (ebVar == null) {
                    synchronized (C34014ad.class) {
                        ebVar = f90664h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90663f);
                            f90664h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
