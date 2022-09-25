package com.google.apps.tiktok.experiments;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.experiments.h */
/* compiled from: PG */
public final class C46896h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C46896h f122360e;

    /* renamed from: f */
    private static volatile C63010eb f122361f;

    /* renamed from: a */
    public int f122362a;

    /* renamed from: b */
    public int f122363b = 0;

    /* renamed from: c */
    public Object f122364c;

    /* renamed from: d */
    public String f122365d = BuildConfig.FLAVOR;

    static {
        C46896h hVar = new C46896h();
        f122360e = hVar;
        C62942bv.registerDefaultInstance(C46896h.class, hVar);
    }

    private C46896h() {
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
                return newMessageInfo(f122360e, "\u0001\u0007\u0001\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001း\u0000\u0002်\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0005ွ\u0000\u0006ွ\u0000\nဈ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C46896h();
            case 4:
                return new C46894f();
            case 5:
                return f122360e;
            case 6:
                C63010eb ebVar = f122361f;
                if (ebVar == null) {
                    synchronized (C46896h.class) {
                        ebVar = f122361f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f122360e);
                            f122361f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
