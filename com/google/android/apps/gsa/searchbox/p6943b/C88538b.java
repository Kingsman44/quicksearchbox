package com.google.android.apps.gsa.searchbox.p6943b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85119a;
import com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85123c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.searchbox.b.b */
/* compiled from: PG */
public final class C88538b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C88538b f239291f;

    /* renamed from: g */
    private static volatile C63010eb f239292g;

    /* renamed from: a */
    public int f239293a;

    /* renamed from: b */
    public String f239294b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f239295c;

    /* renamed from: d */
    public long f239296d;

    /* renamed from: e */
    public int f239297e;

    static {
        C88538b bVar = new C88538b();
        f239291f = bVar;
        C62942bv.registerDefaultInstance(C88538b.class, bVar);
    }

    private C88538b() {
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
                return newMessageInfo(f239291f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, C85119a.f230841a, "d", "e", C85123c.f230847a});
            case 3:
                return new C88538b();
            case 4:
                return new C88537a();
            case 5:
                return f239291f;
            case 6:
                C63010eb ebVar = f239292g;
                if (ebVar == null) {
                    synchronized (C88538b.class) {
                        ebVar = f239292g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239291f);
                            f239292g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
