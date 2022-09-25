package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.gu */
/* compiled from: PG */
public final class C49109gu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49109gu f127011f;

    /* renamed from: h */
    private static volatile C63010eb f127012h;

    /* renamed from: a */
    public int f127013a;

    /* renamed from: b */
    public C49111gw f127014b;

    /* renamed from: c */
    public String f127015c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f127016d;

    /* renamed from: e */
    public C48952az f127017e;

    /* renamed from: g */
    private byte f127018g = 2;

    static {
        C49109gu guVar = new C49109gu();
        f127011f = guVar;
        C62942bv.registerDefaultInstance(C49109gu.class, guVar);
    }

    private C49109gu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127018g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127018g = b;
                return null;
            case 2:
                return newMessageInfo(f127011f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C53306j.m86810b(), "e"});
            case 3:
                return new C49109gu();
            case 4:
                return new C49108gt();
            case 5:
                return f127011f;
            case 6:
                C63010eb ebVar = f127012h;
                if (ebVar == null) {
                    synchronized (C49109gu.class) {
                        ebVar = f127012h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127011f);
                            f127012h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
