package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.ad */
/* compiled from: PG */
public final class C45624ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45624ad f119997d;

    /* renamed from: e */
    private static volatile C63010eb f119998e;

    /* renamed from: a */
    public int f119999a;

    /* renamed from: b */
    public String f120000b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f120001c = BuildConfig.FLAVOR;

    static {
        C45624ad adVar = new C45624ad();
        f119997d = adVar;
        C62942bv.registerDefaultInstance(C45624ad.class, adVar);
    }

    private C45624ad() {
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
                return newMessageInfo(f119997d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45624ad();
            case 4:
                return new C45623ac();
            case 5:
                return f119997d;
            case 6:
                C63010eb ebVar = f119998e;
                if (ebVar == null) {
                    synchronized (C45624ad.class) {
                        ebVar = f119998e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119997d);
                            f119998e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
