package com.google.android.libraries.web.p3353c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.c.h */
/* compiled from: PG */
public final class C43363h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C43363h f113275f;

    /* renamed from: g */
    private static volatile C63010eb f113276g;

    /* renamed from: a */
    public int f113277a;

    /* renamed from: b */
    public int f113278b;

    /* renamed from: c */
    public String f113279c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f113280d;

    /* renamed from: e */
    public C43360e f113281e;

    static {
        C43363h hVar = new C43363h();
        f113275f = hVar;
        C62942bv.registerDefaultInstance(C43363h.class, hVar);
    }

    private C43363h() {
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
                return newMessageInfo(f113275f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0001\u0004င\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C43362g.m76516b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C43363h();
            case 4:
                return new C43358c();
            case 5:
                return f113275f;
            case 6:
                C63010eb ebVar = f113276g;
                if (ebVar == null) {
                    synchronized (C43363h.class) {
                        ebVar = f113276g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113275f);
                            f113276g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
