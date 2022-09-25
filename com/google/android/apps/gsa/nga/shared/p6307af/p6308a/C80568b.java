package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.b */
/* compiled from: PG */
public final class C80568b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80568b f221151c;

    /* renamed from: d */
    private static volatile C63010eb f221152d;

    /* renamed from: a */
    public int f221153a;

    /* renamed from: b */
    public String f221154b = BuildConfig.FLAVOR;

    static {
        C80568b bVar = new C80568b();
        f221151c = bVar;
        C62942bv.registerDefaultInstance(C80568b.class, bVar);
    }

    private C80568b() {
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
                return newMessageInfo(f221151c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80568b();
            case 4:
                return new C80567a();
            case 5:
                return f221151c;
            case 6:
                C63010eb ebVar = f221152d;
                if (ebVar == null) {
                    synchronized (C80568b.class) {
                        ebVar = f221152d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221151c);
                            f221152d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
