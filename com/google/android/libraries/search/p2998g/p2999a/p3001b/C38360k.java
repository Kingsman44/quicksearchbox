package com.google.android.libraries.search.p2998g.p2999a.p3001b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.b.k */
/* compiled from: PG */
public final class C38360k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38360k f101565c;

    /* renamed from: d */
    private static volatile C63010eb f101566d;

    /* renamed from: a */
    public int f101567a;

    /* renamed from: b */
    public String f101568b = BuildConfig.FLAVOR;

    static {
        C38360k kVar = new C38360k();
        f101565c = kVar;
        C62942bv.registerDefaultInstance(C38360k.class, kVar);
    }

    private C38360k() {
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
                return newMessageInfo(f101565c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C38360k();
            case 4:
                return new C38359j();
            case 5:
                return f101565c;
            case 6:
                C63010eb ebVar = f101566d;
                if (ebVar == null) {
                    synchronized (C38360k.class) {
                        ebVar = f101566d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101565c);
                            f101566d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
