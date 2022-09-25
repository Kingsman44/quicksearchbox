package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6906n.p6907a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.n.a.b */
/* compiled from: PG */
public final class C87358b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87358b f235922c;

    /* renamed from: d */
    private static volatile C63010eb f235923d;

    /* renamed from: a */
    public int f235924a;

    /* renamed from: b */
    public String f235925b = BuildConfig.FLAVOR;

    static {
        C87358b bVar = new C87358b();
        f235922c = bVar;
        C62942bv.registerDefaultInstance(C87358b.class, bVar);
    }

    private C87358b() {
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
                return newMessageInfo(f235922c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87358b();
            case 4:
                return new C87357a();
            case 5:
                return f235922c;
            case 6:
                C63010eb ebVar = f235923d;
                if (ebVar == null) {
                    synchronized (C87358b.class) {
                        ebVar = f235923d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235922c);
                            f235923d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
