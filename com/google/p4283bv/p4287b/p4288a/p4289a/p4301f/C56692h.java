package com.google.p4283bv.p4287b.p4288a.p4289a.p4301f;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.f.h */
/* compiled from: PG */
public final class C56692h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56692h f151323c;

    /* renamed from: e */
    private static volatile C63010eb f151324e;

    /* renamed from: a */
    public String f151325a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f151326b;

    /* renamed from: d */
    private int f151327d;

    static {
        C56692h hVar = new C56692h();
        f151323c = hVar;
        C62942bv.registerDefaultInstance(C56692h.class, hVar);
    }

    private C56692h() {
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
                return newMessageInfo(f151323c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C56692h();
            case 4:
                return new C56691g();
            case 5:
                return f151323c;
            case 6:
                C63010eb ebVar = f151324e;
                if (ebVar == null) {
                    synchronized (C56692h.class) {
                        ebVar = f151324e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151323c);
                            f151324e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
