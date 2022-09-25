package com.google.android.apps.search.googleapp.incognito.p10327f.p10328a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.incognito.f.a.b */
/* compiled from: PG */
public final class C136274b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136274b f371086c;

    /* renamed from: d */
    private static volatile C63010eb f371087d;

    /* renamed from: a */
    public int f371088a;

    /* renamed from: b */
    public String f371089b = BuildConfig.FLAVOR;

    static {
        C136274b bVar = new C136274b();
        f371086c = bVar;
        C62942bv.registerDefaultInstance(C136274b.class, bVar);
    }

    private C136274b() {
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
                return newMessageInfo(f371086c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136274b();
            case 4:
                return new C136273a();
            case 5:
                return f371086c;
            case 6:
                C63010eb ebVar = f371087d;
                if (ebVar == null) {
                    synchronized (C136274b.class) {
                        ebVar = f371087d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371086c);
                            f371087d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
