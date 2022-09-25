package com.google.p4653i.p4654a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.ad */
/* compiled from: PG */
public final class C61663ad extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C61663ad f166586f;

    /* renamed from: h */
    private static volatile C63010eb f166587h;

    /* renamed from: a */
    public int f166588a;

    /* renamed from: b */
    public String f166589b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f166590c = 1;

    /* renamed from: d */
    public C61700j f166591d;

    /* renamed from: e */
    public C61696f f166592e;

    /* renamed from: g */
    private byte f166593g = 2;

    static {
        C61663ad adVar = new C61663ad();
        f166586f = adVar;
        C62942bv.registerDefaultInstance(C61663ad.class, adVar);
    }

    private C61663ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166593g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166593g = b;
                return null;
            case 2:
                return newMessageInfo(f166586f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0004ᐉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C61661ab.f166585a, "d", "e"});
            case 3:
                return new C61663ad();
            case 4:
                return new C61660aa();
            case 5:
                return f166586f;
            case 6:
                C63010eb ebVar = f166587h;
                if (ebVar == null) {
                    synchronized (C61663ad.class) {
                        ebVar = f166587h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166586f);
                            f166587h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
