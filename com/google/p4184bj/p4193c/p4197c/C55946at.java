package com.google.p4184bj.p4193c.p4197c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.at */
/* compiled from: PG */
public final class C55946at extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55946at f148915f;

    /* renamed from: g */
    private static volatile C63010eb f148916g;

    /* renamed from: a */
    public int f148917a;

    /* renamed from: b */
    public int f148918b;

    /* renamed from: c */
    public C55928ab f148919c;

    /* renamed from: d */
    public String f148920d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C55979o f148921e;

    static {
        C55946at atVar = new C55946at();
        f148915f = atVar;
        C62942bv.registerDefaultInstance(C55946at.class, atVar);
    }

    private C55946at() {
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
                return newMessageInfo(f148915f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0001", new Object[]{"a", "b", "d", "e", C45240c.f118157a});
            case 3:
                return new C55946at();
            case 4:
                return new C55945as();
            case 5:
                return f148915f;
            case 6:
                C63010eb ebVar = f148916g;
                if (ebVar == null) {
                    synchronized (C55946at.class) {
                        ebVar = f148916g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148915f);
                            f148916g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
