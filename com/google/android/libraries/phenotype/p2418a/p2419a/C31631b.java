package com.google.android.libraries.phenotype.p2418a.p2419a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.phenotype.a.a.b */
/* compiled from: PG */
public final class C31631b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C31631b f85101c;

    /* renamed from: d */
    private static volatile C63010eb f85102d;

    /* renamed from: a */
    public int f85103a;

    /* renamed from: b */
    public String f85104b = BuildConfig.FLAVOR;

    static {
        C31631b bVar = new C31631b();
        f85101c = bVar;
        C62942bv.registerDefaultInstance(C31631b.class, bVar);
    }

    private C31631b() {
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
                return newMessageInfo(f85101c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C31631b();
            case 4:
                return new C31630a();
            case 5:
                return f85101c;
            case 6:
                C63010eb ebVar = f85102d;
                if (ebVar == null) {
                    synchronized (C31631b.class) {
                        ebVar = f85102d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85101c);
                            f85102d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
