package com.google.android.apps.gsa.nga.engine.gestureclassifier;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.gestureclassifier.h */
/* compiled from: PG */
public final class C76118h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C76118h f211042d;

    /* renamed from: g */
    private static volatile C63010eb f211043g;

    /* renamed from: a */
    public int f211044a;

    /* renamed from: b */
    public float f211045b;

    /* renamed from: c */
    public String f211046c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f211047e;

    /* renamed from: f */
    private byte f211048f = 2;

    static {
        C76118h hVar = new C76118h();
        f211042d = hVar;
        C62942bv.registerDefaultInstance(C76118h.class, hVar);
    }

    private C76118h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f211048f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f211048f = b;
                return null;
            case 2:
                return newMessageInfo(f211042d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔌ\u0000\u0002ᔁ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", C76120j.m122700b(), "b", C45240c.f118157a});
            case 3:
                return new C76118h();
            case 4:
                return new C76117g();
            case 5:
                return f211042d;
            case 6:
                C63010eb ebVar = f211043g;
                if (ebVar == null) {
                    synchronized (C76118h.class) {
                        ebVar = f211043g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211042d);
                            f211043g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
